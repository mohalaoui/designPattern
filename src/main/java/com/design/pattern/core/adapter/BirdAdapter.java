package com.design.pattern.core.adapter;

/**
 * 
 * @author almed
 *
 */
public class BirdAdapter implements ToyDuck {

	Bird bird;

	public BirdAdapter(Bird bird) {
		super();
		this.bird = bird;
	}

	@Override
	public void squeak() {
		bird.makeSound();

	}
}
