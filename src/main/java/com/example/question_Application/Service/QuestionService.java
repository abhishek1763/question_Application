package com.example.question_Application.Service;

import com.example.question_Application.Dao.QuestionDao;
import com.example.question_Application.quiz_questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    public List<quiz_questions> getAllQuestions() {
        return questionDao.findAll();
    }
}
