package com.demonstration.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Profile extends Audit {
	@NotBlank
private String description;

@Min(value = 1900)
private int birthdate;

@OneToOne(mappedBy = "profile")
@JsonProperty("auteur")
Author author;

}
