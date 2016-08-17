package com.example.user.eightball;

import java.util.ArrayList;

/**
 * Created by user on 17/08/2016.
 */
public class AnswerFromSimpleString extends Answers {
    //this is a contructor that doesn't take any parameters; The constructor is a function that has the same name of the class
    public AnswerFromSimpleString(){
        super();
    }

    //overloading; This is a constructor that take parameters
    public AnswerFromSimpleString(ArrayList<String> answers){
        super(answers);
    }

    //setupAnswers is called in answers() (the first contructor with no parameters)
    @Override
    public void setupAnswers(){
        String[] answers = {
          "Yes", "NO"
        };

        for (String answer : answers){
            mAnswers.add(answer);
        }
    }
}
