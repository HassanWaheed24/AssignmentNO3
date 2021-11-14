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
    private int tscore = 0;
    private int mcqLength = mcq.question.length;
    Random random;

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

        score.setText(""+tscore);

        random =  new Random();
        updatemcq(random.nextInt(mcqLength));

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a.getText() == answer){
                    tscore++;
                    score.setText(""+score);

                }else{
                    updatemcq(random.nextInt(mcqLength));
                }
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b.getText() == answer){
                    tscore++;
                    score.setText(""+score);

                }else{
                    updatemcq(random.nextInt(mcqLength));
                }
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c.getText() == answer){
                    tscore++;
                    score.setText(""+score);

                }else{
                    updatemcq(random.nextInt(mcqLength));
                }
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(d.getText() == answer){
                    tscore++;
                    score.setText(""+score);

                }else{
                    updatemcq(random.nextInt(mcqLength));
                }
            }
        });



    //end......
    }
    private void updatemcq(int n){
        ques.setText(mcq.getQuestion(n)+""+n);
        a.setText(mcq.getOption1(n));
        b.setText(mcq.getOption2(n));
        c.setText(mcq.getOption3(n));
        d.setText(mcq.getOption4(n));

        answer = mcq.getAnswers(n);
    }
}