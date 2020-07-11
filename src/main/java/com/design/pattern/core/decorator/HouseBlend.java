package com.design.pattern.core.decorator;

/**
 * 
 * @author almed
 *
 */
public class HouseBlend extends Beverage{

	public HouseBlend() {
		desc = "house blend coffe";
	}
	
	@Override
	public double cost() {
		return 5.0;
	}

}
