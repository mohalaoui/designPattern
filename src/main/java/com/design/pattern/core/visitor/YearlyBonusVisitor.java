package com.design.pattern.core.visitor;

/**
 * 
 * @author almed
 *
 */
public class YearlyBonusVisitor implements Visitor {

	@Override
	public double visit(AbstractEmployee employee) {
		return calcultateYearlyBonus(employee);
	}

	private double calcultateYearlyBonus(AbstractEmployee employee) {
		double result = 0;
		int seniorityYears = employee.getSeniorityYears();
		
		if (isTenPercentEligible(seniorityYears)) {
			result = employee.getSalary() * tenPercent();
		}
		if (isTwentyPercentEligible(seniorityYears)) {
			result = employee.getSalary() * twentyPercent();
		}
		if (isThirtyPercentEligible(seniorityYears)) {
			result = employee.getSalary() * thirtyPercent();
		}

		return result;
	}

	private double thirtyPercent() {
		return 30.0 / 100.0;
	}

	private double twentyPercent() {
		return 20.0 / 100.0;
	}

	private double tenPercent() {
		return 10.0 / 100.0;
	}

	private boolean isThirtyPercentEligible(int seniorityYears) {
		return seniorityYears >= 10;
	}

	private boolean isTwentyPercentEligible(int seniorityYears) {
		return seniorityYears >= 5 && seniorityYears < 10;
	}

	private boolean isTenPercentEligible(int seniorityYears) {
		return seniorityYears > 2 && seniorityYears < 5;
	}

}
