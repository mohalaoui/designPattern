package com.design.pattern.core.strategy;

/**
 * 
 * @author almed
 *
 */
public class FiftyPercentBonus implements Bonus {

	@Override
	public double bonus() {
		return 50.0 / 100.0;
	}

}
