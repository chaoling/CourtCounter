package com.example.chaol.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mScoreA;
    private int mScoreB;
    private TextView mLabelA;
    private TextView mLabelB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLabelA = (TextView) this.findViewById(R.id.team_a_score);
        mLabelB = (TextView) this.findViewById(R.id.team_b_score);
    }

    public void resetScore(View view) {
        mScoreA = 0;
        mScoreB = 0;
        displayScoreTeamA();
        displayScoreTeamB();
    }

    public void addOneForTeamA(View view) {
        mScoreA += 1;
        displayScoreTeamA();
    }

    public void addTwoForTeamA(View view) {
        mScoreA +=2;
        displayScoreTeamA();
    }

    public void addThreeForTeamA(View view) {
        mScoreA += 3;
        displayScoreTeamA();
    }

    public void addOneForTeamB(View view) {
        mScoreB +=1;
        displayScoreTeamB();
    }

    public void addTwoForTeamB(View view) {
        mScoreB +=2;
        displayScoreTeamB();
    }

    public void addThreeForTeamB(View view) {
        mScoreB +=3;
        displayScoreTeamB();
    }

    private void displayScoreTeamA() {
        Log.d("MainActivity",""+mScoreA);
        mLabelA.setText(""+mScoreA);
    }

    private void displayScoreTeamB() {
        Log.d("MainActivity",""+mScoreB);
        mLabelB.setText(""+mScoreB);
    }
}
