package com.example.android.gaascoreboard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    static final String GOAL_SCORE_TEAM_A = "teamAGoalScore";
    static final String GOAL_SCORE_TEAM_B = "teamBGoalScore";
    static final String POINT_SCORE_TEAM_A = "teamAPointScore";
    static final String POINT_SCORE_TEAM_B = "teamBPointScore";

    int goalScoreTeamA = 0;
    int goalScoreTeamB = 0;
    int pointScoreTeamA = 0;
    int pointScoreTeamB = 0;

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current game state
        savedInstanceState.putInt(GOAL_SCORE_TEAM_A, goalScoreTeamA);
        savedInstanceState.putInt(GOAL_SCORE_TEAM_B, goalScoreTeamB);
        savedInstanceState.putInt(POINT_SCORE_TEAM_A, pointScoreTeamA);
        savedInstanceState.putInt(POINT_SCORE_TEAM_B, pointScoreTeamB);

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Check whether we're recreating a previously destroyed instance
        if (savedInstanceState != null) {
            // Restore value of members from saved state
            goalScoreTeamA = savedInstanceState.getInt(GOAL_SCORE_TEAM_A);
            goalScoreTeamB = savedInstanceState.getInt(GOAL_SCORE_TEAM_B);
            pointScoreTeamA = savedInstanceState.getInt(POINT_SCORE_TEAM_A);
            pointScoreTeamB = savedInstanceState.getInt(POINT_SCORE_TEAM_B);
            setContentView(R.layout.activity_main);
            displayGoalForTeamA(goalScoreTeamA);
            displayGoalForTeamB(goalScoreTeamB);
            displayPointForTeamA(pointScoreTeamA);
            displayPointForTeamB(pointScoreTeamB);
        }
    }

    /**
     * This method is called when the 'Goal' button is clicked for TeamA.
     */
    public void addGoalForTeamA(View view) {
        goalScoreTeamA = goalScoreTeamA + 1;
        displayGoalForTeamA(goalScoreTeamA);
    }

    /**
     * This method is called when the 'Point' button is clicked for TeamA.
     */
    public void addPointForTeamA(View view) {
        pointScoreTeamA = pointScoreTeamA + 1;
        displayPointForTeamA(pointScoreTeamA);
    }


    /**
     * Displays the given goal score for Team A.
     */
    public void displayGoalForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_goal_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given point score for Team A.
     */
    public void displayPointForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_point_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the 'Goal' button is clicked for TeamB.
     */
    public void addGoalForTeamB(View view) {
        goalScoreTeamB = goalScoreTeamB + 1;
        displayGoalForTeamB(goalScoreTeamB);
    }

    /**
     * This method is called when the 'Point' button is clicked for TeamB.
     */
    public void addPointForTeamB(View view) {
        pointScoreTeamB = pointScoreTeamB + 1;
        displayPointForTeamB(pointScoreTeamB);
    }


    /**
     * Displays the given goal score for Team B.
     */
    public void displayGoalForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_goal_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given point score for Team B.
     */
    public void displayPointForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_point_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the 'Reset' button is clicked.
     */
    public void reset(View view) {
        goalScoreTeamA = 0;
        goalScoreTeamB = 0;
        pointScoreTeamA = 0;
        pointScoreTeamB = 0;
        displayGoalForTeamA(goalScoreTeamA);
        displayGoalForTeamB(goalScoreTeamB);
        displayPointForTeamA(pointScoreTeamA);
        displayPointForTeamB(pointScoreTeamB);
    }

}