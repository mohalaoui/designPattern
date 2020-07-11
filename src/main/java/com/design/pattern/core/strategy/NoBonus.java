package com.design.pattern.core.strategy;

/**
 * 
 * @author almed
 *
 */
public class NoBonus implements Bonus {
	
	
	@Override
	public double bonus() {
		return 0.0;
	}

}
