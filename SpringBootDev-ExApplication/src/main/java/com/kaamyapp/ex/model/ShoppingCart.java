package com.kaamyapp.ex.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Shopping_Table")
public class ShoppingCart 
{

	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	@Column
	private String name;
	@Column
	private String description;
	
	@OneToMany
	private List<ImageModel> image;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<ImageModel> getImage() {
		return image;
	}

	public void setImage(List<ImageModel> image) {
		this.image = image;
	}
}