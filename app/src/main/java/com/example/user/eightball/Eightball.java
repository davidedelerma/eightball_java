package com.example.user.eightball;
import java.util.*;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 16/08/2016.
 */
public class Eightball extends AppCompatActivity {

    EditText mQuestionEditText;
    //TextView mAnswerText;
    Button mShakeButton;
    Button mButton2;
    Button mFunButton;
    //RandomText randomText;
    Answers mAnswers;
    Answers mAnswers2;
    Answers mAnswerFun;
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        mQuestionEditText = (EditText)findViewById(R.id.question_text);
        //mAnswerText = (TextView)findViewById(R.id.answer_text);
        mShakeButton = (Button) findViewById(R.id.shake_button);
        mButton2 = (Button) findViewById(R.id.player2);
        mFunButton = (Button) findViewById(R.id.asleigh);
        //mAnswers = new AnswerFromSimpleString();
        mAnswers = new AnswersFromAPI();
        mAnswers2 = new AnswersFromItalian();
        mAnswerFun = new AnswerFromAshleighApi();
        //randomText = new RandomText();
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String word =mAnswers2.getAnswer();
                Intent intent = new Intent(Eightball.this, AnswerActivityButton2.class);
                intent.putExtra("answer",word);
                startActivity(intent);

            }
        });

        mFunButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String word =mAnswerFun.getAnswer();
                Intent intent = new Intent(Eightball.this, AnswerActivityButton2.class);
                intent.putExtra("answer",word);
                startActivity(intent);
            }
        });

        mShakeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String question = mQuestionEditText.getText().toString();
                Log.d("Eightball","Shake button clicked");
                Log.d("Eightball", "The question asked was: '" + question + "'");
                String word = mAnswers.getAnswer();
               // String word = randomText.takeRandomWord();
               //mAnswerText.setText(word);
                //create intent object: take package context and class
                Intent intent = new Intent(Eightball.this, AnswerActivity.class);
                intent.putExtra("answer",word);
                Log.d("Eightball","passing through'"+ word + "'");
                startActivity(intent);
            }
        });
    }
}
