package com.example.raiff.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Tracks the score for Celtics
    int scoreCeltics = 0;

    //Track the score for the Cavaliers
    int scoreCavaliers = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Increase by 1 Celtics
    public void addOneForCelics(View view) {
        scoreCeltics = scoreCeltics +1;
        displayForCeltics(scoreCeltics);
    }
    //Increase by 1 Cavaliers
    public void addOneForCavaliers(View view) {
        scoreCavaliers = scoreCavaliers +1;
        displayForCavaliers(scoreCavaliers);
    }
    //Increase by 2 Celtics
    public void addTwoForCelics(View view) {
        scoreCeltics = scoreCeltics + 2;
        displayForCeltics(scoreCeltics);
    }
    //Increase by 2 Cavaliers
    public void addTwoForCavaliers(View view) {
        scoreCavaliers = scoreCavaliers +2;
        displayForCavaliers(scoreCavaliers);
    }
    //Increase by 3 Celtics
    public void addThreeForCelics(View view) {
        scoreCeltics = scoreCeltics + 2;
        displayForCeltics(scoreCeltics);
    }
    //Increase by 3 Cavaliers
    public void addThreeForCavaliers(View view) {
        scoreCavaliers = scoreCavaliers +2;
        displayForCavaliers(scoreCavaliers);
    }

    //reset score
    public void resetScore(View view) {
        scoreCeltics = 0;
        scoreCavaliers = 0;
        displayForCeltics(scoreCeltics);
        displayForCavaliers(scoreCavaliers);
    }

    //Display the given score for Celtics
    public  void displayForCeltics(int score) {
        TextView scoreView = (TextView) findViewById(R.id.celtics_score);
        scoreView.setText(String.valueOf(score));
    }
    //Display the given score for Cavaliers
    public  void displayForCavaliers(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cavaliers_score);
        scoreView.setText(String.valueOf(score));
    }
}
