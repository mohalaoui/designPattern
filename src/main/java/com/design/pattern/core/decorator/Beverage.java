package com.design.pattern.core.decorator;

/**
 * 
 * @author almed
 *
 */
public abstract class Beverage {
	
	String desc = "unknown";
	
	public String getDesc() {
		return desc;
	}
	
	public abstract double cost();

}
