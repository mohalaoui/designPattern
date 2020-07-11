package com.design.pattern.core.builder;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 
 * @author almed
 *
 */
public class Book {
	
	private Author author;
	private String isbn;
	private String edition;
	private BookFromat format;
	
    public Book() {}
	
    // force to use builder
	private Book(Author author, String isbn, String edition, BookFromat format) {
		this.author = author;
		this.isbn = isbn;
		this.edition = edition;
		this.format = format;
	}

	public Author getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getEdition() {
		return edition;
	}

	public BookFromat getFormat() {
		return format;
	}
	
	public static class Builder {
		private Author author;
		private String isbn;
		private String edition;
		private BookFromat format;
		
		public Builder() {}
		
		public Builder withAuthor(Author author) {
			this.author = author;
			return this;
		}
		
		public Builder withIsbn(String isbn) {
			this.isbn = isbn;
			return this;
		}
		
		public Builder withEdition(String edition) {
			this.edition = edition;
			return this;
		}
		
		public Builder withAuthor(BookFromat format) {
			this.format = format;
			return this;
		}
		
		public Book build() {
			return new Book(author, isbn, edition, format);
		}
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	

}
