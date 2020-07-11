package com.design.pattern.core.factory;

/**
 * 
 * @author almed
 *
 */
public class ShapeFactory {
	
	public Shape getShape(ShapeType shapeType) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<Shape> shapeClass = (Class<Shape>) Class.forName(shapeType.getValue()); 
		return shapeClass.newInstance();
	}

}
