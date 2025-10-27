package com.demoExample.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

//this is the entuity class

@Entity
public class FoodDishes {
	
	//id, name, description, catgegory and price
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	private String name;
	
	
    @NotBlank(message="description is needed")
	private String description;
    
	private String category;
	
	
	private double price;


	public Long getId() {
		return id;
	}


	public void setId(long i) {
		this.id = i;
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


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public FoodDishes() {}


	public FoodDishes(Long id, String name, String description, String category, double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.category = category;
		this.price = price;
	}
	
	
	
	
	
	
	
	

}
