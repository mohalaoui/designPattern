package com.design.pattern.core.composite;

import java.util.List;
import java.util.Optional;

import com.google.common.collect.Lists;

/**
 * 
 * @author almed
 *
 */
public class ArticleGroup extends ArticleComponent {

	private List<ArticleComponent> articleComponents = Lists.newArrayList();

	public ArticleGroup(String name) {
		super(name);
	}

	@Override
	public void add(ArticleComponent articleComponent) {
		articleComponents.add(articleComponent);

	}

	@Override
	public void remove(ArticleComponent articleComponent) {
		boolean isRemoved = articleComponents.remove(articleComponent);

		if (!isRemoved) {
			throw new IllegalArgumentException(articleComponent.getName() + " child not found!");
		}

	}

	@Override
	public Optional<ArticleComponent> get(ArticleComponent productComponent) {
		return articleComponents.stream().filter(articleCompo -> articleCompo.name.equals(productComponent.name)).findFirst();
	}

	@Override
	public void articleInfo() {

		System.out.println(getName());
		for (ArticleComponent articleComponent : articleComponents) {
			articleComponent.articleInfo();
		}

	}

}
