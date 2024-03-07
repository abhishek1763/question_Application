package com.example.question_Application.Dao;

import com.example.question_Application.quiz_questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDao extends JpaRepository<quiz_questions, Integer> {

}
