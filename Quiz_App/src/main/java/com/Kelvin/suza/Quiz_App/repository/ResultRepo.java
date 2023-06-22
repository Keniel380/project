package com.Kelvin.suza.Quiz_App.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Kelvin.suza.Quiz_App.model.Result;

@Repository
public interface ResultRepo extends JpaRepository<Result, Integer> {
	

}