package com.design.pattern.core.adapter;

/**
 * 
 * @author almed
 *
 */
public class Budgie implements Bird {

	@Override
	public void fly() {
		System.out.println("Flying...");
		
	}
	
	@Override
	public void makeSound() {
		System.out.println("Chirp Chirp...");
		
	}
	
}
