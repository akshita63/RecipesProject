package com.demoExample.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.demoExample.DTO.foodDishDto;
import com.demoExample.Entity.FoodDishes;
import com.demoExample.Exception.ResourceNotFoundException;
import com.demoExample.Repos.FoodDishRepo;

@Service
public class FoodService {
	
	
	
	//
	
	@Autowired
	private FoodDishRepo foodDishRepo;
	
	
	
	public foodDishDto convertToFoodDto(FoodDishes food) {
		
		
		 foodDishDto  f1=new foodDishDto();
		 f1.setName(food.getName());
		 f1.setDescription(food.getDescription());
		 
		 return f1;
	}

	
	
	
	//this is used to save the foodDish
	public FoodDishes save(FoodDishes foodDish) {
		// TODO Auto-generated method stub
		return foodDishRepo.save(foodDish);
	}

	
	
	
	//get APi for fetching the food item
	public List<FoodDishes> getFood() {
		// TODO Auto-generated method stub
		return foodDishRepo.findAll();
	}

	

	
	//get api for fetching the food item by its id
	
	public FoodDishes getFoodByid(long id) {
		// TODO Auto-generated method stub
		 return foodDishRepo.findById(id).
				 orElseThrow(() -> new ResourceNotFoundException("Food item not found with ID: " + id));
		 
		 
		 
		 
		 
	}
	
	
	
	
	//here you can write your own APIs
	
	

}
