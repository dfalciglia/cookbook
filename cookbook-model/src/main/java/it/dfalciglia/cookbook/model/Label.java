package it.dfalciglia.cookbook.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tiporicetta")
public class Label implements Serializable {

	private static final long serialVersionUID = 7406005089175373368L;

	@Id
	protected int id;
	@Column(name = "descrizione")
	protected String description;
	@Column(name = "immagine")
	protected byte[] image;
	@Column(name = "ordine")
	protected int order;

	public Label() {
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

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

}
