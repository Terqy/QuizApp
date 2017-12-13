package com.example.android.quizzapp;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

import java.io.IOError;

public class MainActivity extends AppCompatActivity {


    int rightAnswerCount = 0;

    //RadioButtons for question 1
    RadioButton answerWrongOneQuestion1;
    RadioButton answerWrongTwoQuestion1;
    RadioButton answerRightQuestion1;

    //CheckBoxes for question 2
    CheckBox answerWrongOneQuestion2;
    CheckBox answerWrongTwoQuestion2;
    CheckBox answerRightQuestion2;

    //CheckBoxes for question 3
    CheckBox answerRightQuestion3;
    CheckBox answerWrongOneQuestion3;
    CheckBox answerWrongTwoQuestion3;

    //CheckBoxes for question 4
    CheckBox answerRightQuestion4;
    CheckBox answerWrongOneQuestion4;
    CheckBox answerWrongTwoQuestion4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing RadioButtons for question 1
        answerWrongOneQuestion1 = (RadioButton) findViewById(R.id.radioButtonQuestionWrong1);
        answerWrongTwoQuestion1 = (RadioButton) findViewById(R.id.radioButtonQuestionWrong2);
        answerRightQuestion1 = (RadioButton) findViewById(R.id.radioButtonQuestionRight);

        //Initializing CheckBoxes for question 2
        answerWrongOneQuestion2 = (CheckBox) findViewById(R.id.wrongAnswerOneQuestion2);
        answerWrongTwoQuestion2 = (CheckBox) findViewById(R.id.wrongAnswerTwoQuestion2);
        answerRightQuestion2 = (CheckBox) findViewById(R.id.questionTwoRightAnswer);

        //Initializing CheckBoxes for question 3
        answerRightQuestion3 = (CheckBox) findViewById(R.id.questionThreeRightAnswer);
        answerWrongOneQuestion3 = (CheckBox) findViewById(R.id.questionThreeWrongAnswerOne);
        answerWrongTwoQuestion3 = (CheckBox) findViewById(R.id.questionThreeWrongAnswerTwo);

        //Initializing CheckBoxes for question 4
        answerRightQuestion4 = (CheckBox) findViewById(R.id.questionFourRightAnswer);
        answerWrongOneQuestion4 = (CheckBox) findViewById(R.id.questionFourWrongAnswerOne);
        answerWrongTwoQuestion4 = (CheckBox) findViewById(R.id.questionFourWrongAnswerTwo);
    }

    public void submit(View view) {
        Toast toast = new Toast(this);

        if(answerRightQuestion1.isChecked()) {
            rightAnswerCount++;
            if(rightAnswerCount > 1) {
                rightAnswerCount = 1;
            }
        }

        if(answerRightQuestion2.isChecked()) {
            rightAnswerCount++;
        }

        if(answerRightQuestion3.isChecked()) {
            rightAnswerCount++;
        }

        if(answerRightQuestion4.isChecked()) {
            rightAnswerCount++;
        }

        if(rightAnswerCount < 3) {
            toast.makeText(this, "You scored less than 3! Try again", Toast.LENGTH_LONG).show();
        } else {
            toast.makeText(this, "You scored: " + rightAnswerCount + "/4", Toast.LENGTH_LONG).show();
        }
    }

    public void questionOneRightAnswer(View v) {
        answerWrongOneQuestion1.setChecked(false);
        answerWrongTwoQuestion1.setChecked(false);
    }

    public void questionOneWrongAnswerOne(View v) {
        answerWrongTwoQuestion1.setChecked(false);
        answerRightQuestion1.setChecked(false);
    }

    public void questionOneWrongAnswerTwo(View v) {
        answerWrongOneQuestion1.setChecked(false);
        answerRightQuestion1.setChecked(false);
    }

    public void questionTwoRightAnswer(View v) {
        answerWrongOneQuestion2.setChecked(false);
        answerWrongTwoQuestion2.setChecked(false);
    }

    public void questionTwoWrongAnswerOne(View v) {
        answerRightQuestion2.setChecked(false);
        answerWrongOneQuestion2.setChecked(false);

    }

    public void questionTwoWrongAnswerTwo(View v) {
        answerRightQuestion2.setChecked(false);
        answerWrongTwoQuestion2.setChecked(false);
    }

    public void questionThreeRightAnswer(View v) {
        answerWrongOneQuestion3.setChecked(false);
        answerWrongTwoQuestion3.setChecked(false);
    }

    public void questionThreeWrongAnswerOne(View v) {
        answerRightQuestion3.setChecked(false);
        answerWrongTwoQuestion3.setChecked(false);
    }

    public void questionThreeWrongAnswerTwo(View v) {
        answerRightQuestion3.setChecked(false);
        answerWrongOneQuestion3.setChecked(false);
    }

    public void questionFourRightAnswer(View v) {
        answerWrongOneQuestion4.setChecked(false);
        answerWrongTwoQuestion4.setChecked(false);
    }

    public void questionFourWrongAnswerOne(View v) {
        answerRightQuestion4.setChecked(false);
        answerWrongTwoQuestion4.setChecked(false);
    }

    public void questionFourWrongAnswerTwo(View v) {
        answerRightQuestion4.setChecked(false);
        answerWrongOneQuestion4.setChecked(false);
    }
}
