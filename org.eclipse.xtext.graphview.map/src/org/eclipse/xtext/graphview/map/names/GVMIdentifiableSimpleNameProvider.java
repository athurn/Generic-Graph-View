/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.map.names;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping;
import org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider;

public class GVMIdentifiableSimpleNameProvider extends IdentifiableSimpleNameProvider {

	@Override
	public String getSimpleName(JvmIdentifiableElement element) {
		if (element instanceof AbstractMapping) {
			return "this";
		}
		return super.getSimpleName(element);
	}
}
