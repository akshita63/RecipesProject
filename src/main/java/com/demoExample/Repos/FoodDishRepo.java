package com.demoExample.Repos;

import java.util.Optional;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoExample.Entity.FoodDishes;

public interface FoodDishRepo  extends JpaRepository<FoodDishes, Long>{
	
	
	//here you can just write your customised JPA queries
	
	
	//Optional<FoodDishes> result = FoodDishRepo.findById(id);

}
