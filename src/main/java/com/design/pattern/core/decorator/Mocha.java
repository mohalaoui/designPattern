package com.design.pattern.core.decorator;

/**
 * 
 * @author almed
 *
 */
public class Mocha extends CondimentDecorator{
	
	protected Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDesc() {
		return  beverage.getDesc() + ", Mocha";
	}

	@Override
	public double cost() {
		return 10.0 + beverage.cost();
	}

}
