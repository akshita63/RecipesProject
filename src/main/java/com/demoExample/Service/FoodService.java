package com.demoExample.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.demoExample.Entity.FoodDishes;
import com.demoExample.Repos.FoodDishRepo;

@Service
public class FoodService {
	
	@Autowired
	private FoodDishRepo foodDishRepo;

	public FoodDishes save(FoodDishes foodDish) {
		// TODO Auto-generated method stub
		return foodDishRepo.save(foodDish);
	}

	public List<FoodDishes> getFood() {
		// TODO Auto-generated method stub
		return foodDishRepo.findAll();
	}

	

	
	public FoodDishes getFoodByid(long id) {
		// TODO Auto-generated method stub
		 return foodDishRepo.findById(id).
				 orElseThrow(() -> new NoSuchElementException("Food item not found with ID: " + id));
		 
		 
		 
		 
		 
	}
	
	
	
	
	//here you can write your own APIs
	

}
