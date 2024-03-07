package com.example.question_Application.Controller;

import java.util.List;

import com.example.question_Application.Service.QuestionService;
import com.example.question_Application.quiz_questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;
    @GetMapping("allQuestion")
    public List<quiz_questions> getAllQuestion(){
        return questionService.getAllQuestions();
    }

}
