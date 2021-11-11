package com.example.quizapp;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;//For name
    TextView textView1;//for ID
    Button button;//for repo
    Button button1;//for quiz
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Display the name
        textView = (TextView) findViewById(R.id.TextView1);
        textView.setText("Hassan Waheed");
         //Display the ID
        textView1 =  (TextView) findViewById(R.id.TextView2);
        textView1.setText("BITF18A524");
        //Button to open repository
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://github.com/HassanWaheed24/AssignmentNO3";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        //Button to move on quiz
        button1 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenQuiz();
            }
        });
    }
    public void OpenQuiz(){
        Intent intent = new Intent(this,quiz.class);
        startActivity(intent);
    }
}