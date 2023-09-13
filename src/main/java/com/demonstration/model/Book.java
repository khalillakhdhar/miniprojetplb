package com.demonstration.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
public class Book extends Audit {

private String title;
private int publicationYear;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "author_id")
@JsonProperty(required = false)

private Author author;
@Temporal(TemporalType.TIMESTAMP)
//@JsonFormat(JJ/MM/AAAA)
//private Date publish;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getPublicationYear() {
	return publicationYear;
}
public void setPublicationYear(int publicationYear) {
	this.publicationYear = publicationYear;
}
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}




}
