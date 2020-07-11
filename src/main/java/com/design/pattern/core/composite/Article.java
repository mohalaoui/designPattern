package com.design.pattern.core.composite;

/**
 * 
 * @author almed
 *
 */
public class Article extends ArticleComponent {

	private String cost;

	public Article(String name, String cost) {
		super(name);
		this.cost = cost;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	@Override
	public void articleInfo() {
		System.out.println(this.getName() + ": " + this.getCost());
	}

}
