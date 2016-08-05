package org.lanqiao.zhengwei.demo.rest;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Book implements Serializable {

	private Long id;

	private String title;
	private String description;
	private double price;
	private Integer year;
	private String author;
	private String Isbn;

	private Category category;

	public Book() {
		super();
	}

	public Book(Long id, String title, String description, double price, Integer year, 
			String author, String isbn,
			Long categoryId) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.price = price;
		this.year = year;
		this.author = author;
		Isbn = isbn;
		this.category = Categories.get(categoryId);
	}

	public Long getId() {
		return this.id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getIsbn() {
		return this.Isbn;
	}

	public void setIsbn(String isbn) {
		this.Isbn = isbn;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		Book other = (Book) object;

		return new EqualsBuilder().append(this.getTitle(), other.getTitle()).append(this.getAuthor(), other.getAuthor())
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(getAuthor()).append(getTitle()).toHashCode();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE);
		builder.append("title", this.title);
		builder.append("author", this.author);
		builder.append("isbn", this.Isbn);
		return builder.build();
	}
}
