package com.example.question_Application;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
//@Table
public class quiz_questions {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String category;
    private String difficultyLevel;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String QuestionTitle;
    private String wrightAns;

}
