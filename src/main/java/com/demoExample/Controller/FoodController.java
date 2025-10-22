package com.demoExample.Controller;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demoExample.Entity.FoodDishes;
import com.demoExample.Service.FoodService;



@RestController
public class FoodController {
	
	@Autowired
	//private FoodService foodService;
	
	
	private  final FoodService foodService;
	
	public FoodController(FoodService foodService) {
		this.foodService=foodService;
	}
	
	
	
	
	
	//create an api for posting food data
	
	
	
	//this is used for adding data to the db
	@PostMapping("/foodapp")
	public ResponseEntity<FoodDishes> addFood(@RequestBody FoodDishes foodDish){
		
		
		
		FoodDishes f1=foodService.save(foodDish);
		
		return ResponseEntity.ok(f1);
		
	}
	
	
	
	
	
	//get all the food items here
	@GetMapping("/food")
	public List<FoodDishes> getFood(){
		
		return foodService.getFood();
	
		
		
		
	}
	
	
	//get specific food items
//	@GetMapping("/getFood/{id}")
//	
//	
//	//I was manually handline the exception using try catch
//	public ResponseEntity<?> getFoodItems(@PathVariable  long id){
//		try {
//			FoodDishes food=foodService.getFoodByid(id);
//			return ResponseEntity.ok(food);
//			
//		}
//		catch (NoSuchElementException e) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND)
//                                 .body(Map.of(("error"),e.getMessage()));
//        }
	
	

//		
	
	@GetMapping("/Food/{id}")
	public ResponseEntity<?> getFood(@PathVariable long id){
		
		
		//here I have not used any try catch to handle exception  
		FoodDishes food=foodService.getFoodByid(id);
		
		return ResponseEntity.ok(food);
		
		
		
		
	
		

	}
		
	
	
	

}
