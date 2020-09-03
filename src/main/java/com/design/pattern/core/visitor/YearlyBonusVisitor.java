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
		double tenPercent = 10.0 / 100.0;
		double twentyPercent = 20.0 / 100.0;
		double thirtyPercent = 30.0 / 100.0;
		int seniorityYears = employee.getSeniorityYears();
		
		if (seniorityYears > 2 && seniorityYears < 5) {
			result = employee.getSalary() * tenPercent;
		}
		if (seniorityYears >= 5 && seniorityYears < 10) {
			result = employee.getSalary() * twentyPercent;
		}
		if (seniorityYears >= 10) {
			result = employee.getSalary() * thirtyPercent;
		}

		return result;
	}

}
