package com.design.pattern.core.composite;

import java.util.Optional;

/**
 * 
 * @author almed
 *
 */
public abstract class ArticleComponent {
	
	protected String name;
	
	public ArticleComponent(String name) {
		super();
		this.name = name;
	}

	public void add(ArticleComponent productComponent) {}
	
	public void remove(ArticleComponent productComponent) {}
	
	public Optional<ArticleComponent> get(ArticleComponent productComponent) {return null;}

	abstract public void articleInfo();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
