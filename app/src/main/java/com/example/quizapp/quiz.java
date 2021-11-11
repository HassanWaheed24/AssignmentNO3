package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Random;

public class quiz extends AppCompatActivity {

    TextView textView;//For name
    String question[] = {"What is your name?","Your age?"};
    String answers[]={"sabri","19"};
    String option[]={"sabri","19","momin","14"};
    CheckBox a,b,c,d;
    //random variable
    //int random  = new Random().nextInt(2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        textView = (TextView) findViewById(R.id.textView);
        textView.setText(question[0]);
        a=findViewById(R.id.checkBox);
        b=findViewById(R.id.checkBox2);
        c=findViewById(R.id.checkBox3);
        d=findViewById(R.id.checkBox4);
        a.setText("sabri");
        b.setText("xyz");
        c.setText("momin");
        d.setText("ali");

    }
}