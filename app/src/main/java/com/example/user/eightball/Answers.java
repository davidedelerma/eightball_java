package com.example.user.eightball;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 17/08/2016.
 */

//abstract class: you can't create an answer but you can inherit from answers
public abstract class Answers implements Answerable {

    //subclass can access to the method if it is  protected not private

    protected ArrayList<String> mAnswers;

    //first answer method
    public Answers(){
        mAnswers = new ArrayList<String>();
        setupAnswers();
    }

    //2 answer method: overloading method to pass an arraylist to answers; Overloading is in the same class
    public Answers(ArrayList<String> answers){
        mAnswers = answers;
    }

    public ArrayList<String> getAnswers(){
        return new ArrayList<String>(mAnswers);
    }

    public int getLength(){
        return mAnswers.size();
    }

    public String getAnswerAttheIndex(int index){
        return mAnswers.get(index);
    }

    public String getAnswer(){
        Random rand = new Random();
        int listSize = getLength();
        int index = rand.nextInt(listSize);
        String answer = getAnswerAttheIndex(index);
        return  answer;
    }

    //abstract method means that it is not implemented in the super class but only in the parent class
    abstract public void setupAnswers();


}
