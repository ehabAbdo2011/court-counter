package com.example.ehababdo.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreOfa=0;
    int scoreOfb=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        diplaya(scoreOfa);
        diplayb(scoreOfb);
    }
    public void add_three_to_A(View view){
        scoreOfa=scoreOfa+3;
        diplaya(scoreOfa);
    }
    public void add_two_TO_A(View view){
        scoreOfa=scoreOfa+2;
        diplaya(scoreOfa);
    }
    public void add_one_TO_A(View view){
        scoreOfa=scoreOfa+1;
        diplaya(scoreOfa);
    }
    public void add_three_to_B(View view){
        scoreOfb=scoreOfb+3;
        diplayb(scoreOfb);
    }
    public void add_two_to_B(View view){
        scoreOfb=scoreOfb+2;
        diplayb(scoreOfb);
    }
    public void add_one_to_B(View view){
        scoreOfb=scoreOfb+1;
        diplayb(scoreOfb);
    }

    private void diplaya(int num){
        TextView score_a=findViewById(R.id.score_a);
        score_a.setText(num);
    }
    private void diplayb(int num){
        TextView score_b=findViewById(R.id.bbb);
        score_b.setText(num);
    }
}
