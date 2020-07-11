package com.design.pattern.core.builder;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 
 * @author almed
 *
 */
public class Author {

	private String firstname;
	private String lastname;
	// ...

	public Author(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
