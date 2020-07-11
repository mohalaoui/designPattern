package com.design.pattern.core.factory;

/**
 * 
 * @author almed
 * 
 * used for creation instances with reflection: Class.forName(shapeType.getValue())
 *
 */
public enum ShapeType {
	Circle("com.design.pattern.core.factory.Circle"), 
	Rectangle("com.design.pattern.core.factory.Rectangle");

	private String value;
	
	ShapeType(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

}
