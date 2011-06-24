package org.eclipse.xtext.graphview.model;

import java.util.Map;

import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping;
import org.eclipse.xtext.util.Triple;
import org.eclipse.xtext.util.Tuples;

import com.google.common.collect.Maps;

public class InstanceCache {

	private Map<Triple<Object, AbstractInstance, AbstractMapping>, AbstractInstance> map = Maps.newHashMap();
	
	public AbstractInstance put(Object semanticElement, AbstractInstance parentInstance, AbstractMapping mapping, AbstractInstance instance) {
		return map.put(getKey(semanticElement, parentInstance, mapping), instance);
	}

	public AbstractInstance get(Object semanticElement, AbstractInstance parentInstance, AbstractMapping mapping) {
		return map.get(getKey(semanticElement, parentInstance, mapping));
	}
	
	protected Triple<Object, AbstractInstance, AbstractMapping> getKey(
			Object semanticElement, AbstractInstance parentInstance,
			AbstractMapping mapping) {
		return Tuples.create(semanticElement, parentInstance, mapping);
	}
	
}