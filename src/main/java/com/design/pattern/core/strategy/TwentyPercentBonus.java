package com.design.pattern.core.strategy;

/**
 * 
 * @author almed
 *
 */
public class TwentyPercentBonus implements Bonus {

	@Override
	public double bonus() {
		return 20.0 / 100.0;
	}

}
