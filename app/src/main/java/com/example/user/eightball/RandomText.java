package com.example.user.eightball;


/**
 * Created by user on 16/08/2016.
 */
public class RandomText {
    private String[] words = {"Yes","No","Maybe"};
    private int randomInt;
    private String word;

    public RandomText(){


    }
    public String takeRandomWord(){
        randomInt = (int)(Math.random()*(words.length));
        return word = words[randomInt];
    }
}
