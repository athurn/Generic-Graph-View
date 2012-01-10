package org.eclipse.xtext.graphview.editpolicy;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.xtext.graphview.editpart.EdgeEditPart;
import org.eclipse.xtext.graphview.editpart.IInstanceModelEditPart;
import org.eclipse.xtext.graphview.editpolicy.request.RevealRequest;
import org.eclipse.xtext.graphview.editpolicy.request.SetVisibilityCommand;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;
import org.eclipse.xtext.graphview.instancemodel.Visibility;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;

public class RevealEditPolicy extends AbstractEditPolicy {

	public static final String ROLE = "Reveal role";

	@Inject
	private SetVisibilityCommand.Provider visibilityCommandProvider;

	@Override
	public Command getCommand(Request request) {
		if (request instanceof RevealRequest) {
			CompoundCommand compoundCommand = new CompoundCommand();
			RevealRequest revealRequest = (RevealRequest) request;
			RevealedEditPartMap revealedEditPartMap = calculateRevealedEditPartMap(revealRequest);
			showFeedback(revealRequest, revealedEditPartMap);
			for (IInstanceModelEditPart layoutable : revealedEditPartMap.getLayoutables()) {
				if (revealRequest.isRevealSingle()
						&& revealRequest.getSingleSelection() != layoutable) {
					layoutable.getModel().setVisibility(Visibility.HIDDEN);
					for (IInstanceModelEditPart secondary : revealRequest
							.getRevealedEditPartMap()
							.getSecondaries(layoutable))
						secondary.getModel().setVisibility(Visibility.HIDDEN);
				} else {
					compoundCommand.add(visibilityCommandProvider.get(
							layoutable.getModel(), Visibility.VISIBLE));
					for (IInstanceModelEditPart secondary : revealRequest
							.getRevealedEditPartMap()
							.getSecondaries(layoutable))
						compoundCommand.add(visibilityCommandProvider.get(
								secondary.getModel(), Visibility.VISIBLE));
				}
			}
			return compoundCommand;
		}
		return super.getCommand(request);
	}

	@Override
	public void showSourceFeedback(Request request) {
		if (request instanceof RevealRequest) {
			RevealRequest revealRequest = (RevealRequest) request;
			RevealedEditPartMap revealedEditPartMap = calculateRevealedEditPartMap(revealRequest);
			showFeedback(revealRequest, revealedEditPartMap);
		}
		super.showSourceFeedback(request);
	}

	@Override
	public void eraseSourceFeedback(Request request) {
		if (request instanceof RevealRequest) {
			RevealRequest revealRequest = (RevealRequest) request;
			revealRequest.setRevealedEditPartMap(null);
			revealRequest.setSingleSelection(null);
		}
		super.eraseSourceFeedback(request);
	}
	
	protected RevealedEditPartMap calculateRevealedEditPartMap(RevealRequest revealRequest) {
		if (revealRequest.getRevealedEditPartMap() == null) {
			for (AbstractInstance toBeRevealed : revealRequest
					.getToBeRevealed()) {
				toBeRevealed.setVisibility(Visibility.TRANSPARENT);
			}
			RevealedEditPartMap revealedEditPartMap = new RevealedEditPartMap();
			for (AbstractInstance toBeRevealed : revealRequest
					.getToBeRevealed()) {
				IInstanceModelEditPart editPart = (IInstanceModelEditPart) getHost()
						.getViewer().getEditPartRegistry()
						.get(toBeRevealed);
				if (editPart instanceof EdgeEditPart) {
					EdgeEditPart edgeEditPart = (EdgeEditPart) editPart;
					if (edgeEditPart.getSource() == getHost()) {
						revealedEditPartMap.addSecondary(
								(IInstanceModelEditPart) edgeEditPart
										.getTarget(), edgeEditPart);
					} else {
						revealedEditPartMap.addSecondary(
								(IInstanceModelEditPart) edgeEditPart
										.getSource(), edgeEditPart);
					}
				} else {
					revealedEditPartMap.addLayoutable(editPart);
				}
			}
			revealRequest.setRevealedEditPartMap(revealedEditPartMap);
		}
		return revealRequest.getRevealedEditPartMap();
	}

	protected void showFeedback(RevealRequest revealRequest, RevealedEditPartMap revealedEditPartMap) {
		Iterable<IInstanceModelEditPart> layoutables = revealedEditPartMap.getLayoutables();
		if (!Iterables.isEmpty(layoutables)) {
			Point currentMouseLocation = revealRequest
					.getCurrentMouseLocation();
			IFigure hostFigure = ((IInstanceModelEditPart) getHost())
					.getFigure();
			Point center = hostFigure.getBounds().getCenter();
			if (hostFigure.getParent() != null)
				hostFigure.getParent().translateToAbsolute(center);
			Dimension dragDifference = currentMouseLocation
					.getDifference(center);
			double dist = diameter(dragDifference);
			double mouseAngle = Math.atan2(dragDifference.preciseHeight(),
					dragDifference.preciseWidth());
			double angle = (revealRequest.isRevealSingle()) ? 0 : mouseAngle;
			double deltaAngle = 2 * Math.PI / Iterables.size(layoutables);
			for (IInstanceModelEditPart layoutable : layoutables) {
				IFigure figure = layoutable.getFigure();
				Point newCenter = new Point(center);
				Dimension figureSize = figure.getSize();
				double centerDist = dist;
				newCenter.translate((int) (Math.cos(angle) * centerDist),
						(int) (Math.sin(angle) * centerDist));
				newCenter.translate(-figureSize.width / 2,
						-figureSize.height / 2);
				if (figure.getParent() != null) {
					figure.getParent().translateToRelative(newCenter);
				}
				figure.setBounds(new Rectangle(newCenter.x, newCenter.y,
						figureSize.width, figureSize.height));
				angle += deltaAngle;
			}
			if (revealRequest.isRevealSingle()) {
				int revealIndex = (int) (((mouseAngle + 0.5 * deltaAngle + 2 * Math.PI) % (2 * Math.PI)) / deltaAngle);
				int i = 0;
				for (IInstanceModelEditPart layoutable : layoutables) {
					if(i == revealIndex) 
						revealRequest.setSingleSelection(layoutable);
					layoutable.setTransparent(i != revealIndex);
					for (IInstanceModelEditPart secondary : revealedEditPartMap
							.getSecondaries(layoutable))
						secondary.setTransparent(i != revealIndex);
					++i;
				}
			}
		}
	}

	protected double diameter(Dimension dimension) {
		return Math.sqrt(dimension.width * dimension.width + dimension.height
				* dimension.height);
	}
}