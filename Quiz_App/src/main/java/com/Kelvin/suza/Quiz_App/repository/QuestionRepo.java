package com.Kelvin.suza.Quiz_App.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Kelvin.suza.Quiz_App.model.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {

}
