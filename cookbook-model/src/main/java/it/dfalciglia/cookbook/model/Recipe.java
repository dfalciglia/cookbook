package it.dfalciglia.cookbook.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ricetta")
public class Recipe {

	@Id
	protected int id;
	@Column(name = "nome")
	protected String name;
	@Column(name = "descrizione")
	protected String source;
	@Column(name = "preparazione")
	protected String method;

	public Recipe() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

}
