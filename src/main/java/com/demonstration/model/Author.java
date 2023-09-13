package com.demonstration.model;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Author extends Audit {

	@NotBlank
	private String firstname,lastname;
	@OneToOne(cascade = CascadeType.ALL)
	private Profile profile;
	@OneToMany(mappedBy = "author")
	@JsonIgnore
	private HashSet<Book> books=new HashSet<Book>();
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
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
