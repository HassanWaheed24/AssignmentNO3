package com.example.quizapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Random;

public class quiz extends AppCompatActivity {

    TextView ques,score;
    Button a,b,c,d;

    private MCQ mcq = new MCQ();
    private String answer;
    int tscore = 0;
   // private int mcqLength = mcq.question.length;
    int number = 0;
   // Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        ques = (TextView) findViewById(R.id.textView2);
        score = (TextView) findViewById(R.id.textView3);

        a = (Button) findViewById(R.id.button8);
        b = (Button) findViewById(R.id.button9);
        c = (Button) findViewById(R.id.button10);
        d = (Button) findViewById(R.id.button11);

        score.setText(String.valueOf(tscore));

        //random =  new Random();
        //updatemcq(random.nextInt(mcqLength));
        updatemcq(number);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a.getText().equals(answer)&& number < 20){
                    tscore++;
                    score.setText(String.valueOf(tscore));
                    number++;
                    updatemcq(number);

                }else{
                    number++;
                    score.setText(String.valueOf(tscore));
                    updatemcq(number);
                }
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b.getText().equals(answer) && number < 20){
                    tscore++;
                    score.setText(String.valueOf(tscore));
                    number++;
                    updatemcq(number);
                }else{
                    number++;
                    score.setText(String.valueOf(tscore));
                    updatemcq(number);
                }
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c.getText().equals(answer)&& number < 20){
                    tscore++;
                    score.setText(String.valueOf(tscore));
                    updatemcq(number);

                }else{
                    number++;
                    score.setText(String.valueOf(tscore));
                    updatemcq(number);
                }
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(d.getText().equals(answer)&& number < 20){
                    tscore++;
                    score.setText(String.valueOf(tscore));
                    number++;
                    updatemcq(number);

                }else{
                    number++;
                    score.setText(String.valueOf(tscore));
                    updatemcq(number);
                }
            }
        });
    //end......
    }
    private void updatemcq(int n){
        ques.setText(mcq.getQuestion(n));
        a.setText(mcq.getOption1(n));
        b.setText(mcq.getOption2(n));
        c.setText(mcq.getOption3(n));
        d.setText(mcq.getOption4(n));

        answer = mcq.getAnswers(n);
    }
}