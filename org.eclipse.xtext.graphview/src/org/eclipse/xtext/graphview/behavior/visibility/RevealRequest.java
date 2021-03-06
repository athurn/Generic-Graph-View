/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.behavior.visibility;

import java.util.List;
import java.util.Set;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.xtext.graphview.editpart.IInstanceModelEditPart;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;

import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;

public class RevealRequest extends Request {

	private final List<AbstractInstance> toBeRevealed;

	private RevealedEditPartMap revealedEditPartMap;

	private double mouseAngle;

	private double mouseDistance;

	public RevealRequest(List<AbstractInstance> toBeRevealed) {
		this.toBeRevealed = toBeRevealed;
	}

	@Override
	public Object getType() {
		return "Show connected";
	}

	public List<AbstractInstance> getToBeRevealed() {
		return toBeRevealed;
	}

	public double getMouseDistance() {
		return mouseDistance;
	}

	public void setMouseDistance(double mouseDistance) {
		this.mouseDistance = mouseDistance;
	}

	public double getMouseAngle() {
		return mouseAngle;
	}

	public void setMouseAngle(double mouseAngle) {
		this.mouseAngle = mouseAngle;
	}

	public RevealedEditPartMap getRevealedEditPartMap() {
		return revealedEditPartMap;
	}

	public void setRevealedEditPartMap(RevealedEditPartMap revealedEditPartMap) {
		this.revealedEditPartMap = revealedEditPartMap;
	}

	private Set<IInstanceModelEditPart> selection = Sets.newHashSet();

	public Set<IInstanceModelEditPart> getSelection() {
		return selection;
	}

	public boolean addToSelection(EditPart selectedEditPart) {
		if (!(selectedEditPart instanceof IInstanceModelEditPart))
			return false;
		else if (Iterables.contains(revealedEditPartMap.getLayoutables(), selectedEditPart))
			return selection.add((IInstanceModelEditPart) selectedEditPart);
		else
			return addToSelection(selectedEditPart.getParent());
	}

	public boolean removeFromSelection(IInstanceModelEditPart selectedEditPart) {
		if (!(selectedEditPart instanceof IInstanceModelEditPart))
			return false;
		else if (Iterables.contains(revealedEditPartMap.getLayoutables(), selectedEditPart))
			return selection.remove((IInstanceModelEditPart) selectedEditPart);
		else
			return addToSelection(selectedEditPart.getParent());
	}
	
	public boolean isSelected(IInstanceModelEditPart editPart) {
		return selection.contains(editPart);
	}
	
	public void selectAll() {
		for(IInstanceModelEditPart selected: revealedEditPartMap.getLayoutables()) 
			selection.add(selected);
	}
}
