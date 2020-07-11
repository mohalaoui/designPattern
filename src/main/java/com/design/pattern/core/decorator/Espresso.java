package com.design.pattern.core.decorator;

/**
 * 
 * @author almed
 *
 */
public class Espresso extends Beverage {
	
	public Espresso() {
		desc = "espresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
