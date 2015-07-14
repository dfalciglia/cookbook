package it.dfalciglia.cookbook.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Ingredient {

	@Id
	protected int id;
	@Column(name = "descrizione")
	protected String description;

	public Ingredient() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
