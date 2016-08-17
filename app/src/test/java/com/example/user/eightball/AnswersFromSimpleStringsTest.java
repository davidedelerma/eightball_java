package com.example.user.eightball;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
/**
 * Created by user on 17/08/2016.
 */
public class AnswersFromSimpleStringsTest {
    // to create a unit test file click on build variants and in the dropdown select unit  test
    ArrayList<String> list;
    @Before

    public void Before(){
        list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
    }



    @Test
    public void getAnswersTest(){

        Answers answers = new AnswerFromSimpleString();
        assertNotNull(answers.getAnswers());
    }

    @Test
    public void getAnswersLength(){
        Answers answers = new AnswerFromSimpleString();
        assertEquals(2, answers.getLength());

    }

    @Test
    public void getAnswerLengthWhenAddThreeAnswers(){
        Answers answers = new AnswerFromSimpleString(list);

        assertEquals(3, answers.getLength());

    }

    @Test
    public void getAnswerAtTheindex(){
        Answers answers = new AnswerFromSimpleString(list);
        assertEquals("B", answers.getAnswerAttheIndex(1));
    }
}
