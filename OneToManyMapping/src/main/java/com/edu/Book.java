package com.edu;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hiberbook")
public class Book {
	@Id
	private int bookid;
	@Column(length=20)

	private String title;
	@Column(length=20)
	private String author;
	private double price;
	public Book()
	{
		super();
	}
	public Book(int bookid,String title,String author,double price)
	{
		super();
		this.bookid=bookid;
		this.title=title;
		this.author=author;
		this.price=price;
		
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	
}
