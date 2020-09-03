package com.design.pattern.core.visitor;
/**
 * 
 * @author almed
 *
 */
public interface Visitable {
	
	double accept(Visitor visitor);

}
