package com.design.pattern.core.visitor;

/**
 * 
 * @author almed
 *
 */
public class Consultant extends AbstractEmployee implements Visitable{

	private String affectationSite; 
	
	public Consultant(String firstname, String lastname, double salary, int seniorityYears, String affectationSite) {
		super(firstname, lastname, salary, seniorityYears);
		this.affectationSite = affectationSite;
	}

	public String getAffectationSite() {
		return affectationSite;
	}

	public void setAffectationSite(String affectationSite) {
		this.affectationSite = affectationSite;
	}

	@Override
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}
	
}
