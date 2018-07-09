package com.example.ehababdo.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CourtCounter extends AppCompatActivity {
    int score1 =0 ;
    int score2 =0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_court_counter);
        displayForTeamA(score1);
        displayForTeamB(score2);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score1) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score1));
    }
    public void displayForTeamB(int score2) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score2));
    }
    public void decrementby2(View view){
        score1=score1+2;
        displayForTeamA(score1);

    }
    public void decrementby3(View view){
        score1=score1+3;
        displayForTeamA(score1);

    }
    public void decrementby1(View view){
        score1=score1+1;
        displayForTeamA(score1);

    }
    public void reset(View view){
        score1=0;
        score2=0;
        displayForTeamA(score1);
        displayForTeamB(score2);

    }
    public void decrementby2b(View view){
        score2=score2+2;
        displayForTeamB(score2);

    }
    public void decrement3b(View view){
        score2=score2+3;
        displayForTeamB(score2);

    }
    public void decrement1b(View view){
        score2=score2+1;
        displayForTeamB(score2);

    }
    }

