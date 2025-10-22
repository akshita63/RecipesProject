package com.demoExample.serviceTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.commons.annotation.Testable;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.demoExample.Entity.FoodDishes;
import com.demoExample.Repos.FoodDishRepo;
import com.demoExample.Service.FoodService;


@ExtendWith(MockitoExtension.class)
public class ServiceTest {
	
	
	@Mock
	FoodDishRepo foodDishRepo;
	
	
   @InjectMocks
	FoodService foodService;
	
	//here I have compltely mocked the foodService object so I am not getting any kind of error here
   
	
	//test annotation must be used above the method
	@Test
	
	public void addProduct() {
		
		
		
		
		System.out.println("my first unit test");
		FoodDishes f=new FoodDishes();
		f.setId(1);
		f.setName("jamun");
		f.setCategory("sweet");
		f.setDescription("healthy");
		
		Mockito.when(foodDishRepo.save(f)).thenReturn(f);
		
		FoodDishes addedfood=foodService.save(f);
		
		
		//this is actual testing , where we get true or false
		
		Assertions.assertEquals(7, addedfood.getId());
		
		//I should get 1 but expected is 2 so it will fail
		
		
	}
}
