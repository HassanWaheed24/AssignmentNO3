package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Display the name
        textView = (TextView) findViewById(R.id.TextView1);
        textView.setText("Hassan Waheed");
         //Display the ID
        textView1 =  (TextView) findViewById(R.id.TextView2);
        textView.setText("BITF18A524");
    }

}