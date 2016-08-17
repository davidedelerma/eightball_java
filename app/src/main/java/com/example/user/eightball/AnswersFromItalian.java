package com.example.user.eightball;

import java.util.ArrayList;

/**
 * Created by user on 17/08/2016.
 */
public class AnswersFromItalian extends Answers {
    //this is a contructor that doesn't take any parameters; The constructor is a function that has the same name of the class
    public AnswersFromItalian(){
        super();
    }

    //overloading; This is a constructor that tae parameters
    public AnswersFromItalian(ArrayList<String> answers){
        super(answers);
    }
    @Override
    public void setupAnswers(){
        String[] answers = {
                "Si", "NO","Forse","Perche","ma"
        };

        for (String answer : answers){
            mAnswers.add(answer);
        }
    }
}
