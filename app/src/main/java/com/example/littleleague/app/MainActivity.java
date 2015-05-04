package com.example.littleleague.app;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity {
    int numStrike;
    int numBall;
    int numFoul;
    int numOut;
    int numRun;
    int inningNum;

    public void MainActivity() {
        numStrike = 0;
        numBall = 0;
        numFoul = 0;
        numOut = 0;
        numRun = 0;
        inningNum = 0;
    }

    public void incrementStrike() {
        numStrike = numStrike++;
        if (numStrike == 3) {
            numOut = numOut++;
            numStrike = 0;
            Textview textView = (TextView)
            findViewById(R.id.strikeText);
            textView.setText(numStrike);
        }
    }

    public void incrementBall() {
        numBall = numBall++;
        TextView textView = (TextView);
        findViewById(R.id.ballText);
        textView.setText(numBall);
        if (numBall == 5) {
            numBall = 0;
            numStrike = 0;
        }
    }

    public void incrementFoul() {
        numFoul = numFoul++;
        TextView textView = (TextView);
        findViewById(R.id.foulText);
        textView.setText(numFoul);
    }

    public void incrementOut() {
        numOut = numOut++;
        TextView textView = (TextView);
        findViewById(R.id.outText);
        textView.setText(numOut);
        if (numOut == 6) {
            numOut = 0;
            inningNum = inningNum++;
        }
    }


    public void incrementRun() {
        numRun = numRun++;
        TextView textView = (TextView);
        findViewById(R.id.runText);
        textView.setText(numRun);
    }

    public void incrementInning() {
        numStrike = 0;
        numBall = 0;
        numFoul = 0;
        numOut = 0;
        inningNum = inningNum++;
        TextView textView = (TextView);
        findViewById(R.id.currentIning);
        textView.setTExt(numInning)
    }

    //getters and setters

    public int getNumStrike() {
        return numStrike;
    }

    public void setNumStrike(int numStrike) {
        this.numStrike = numStrike;
    }

    public int getNumBall() {
        return numBall;
    }

    public void setNumBall(int numBall) {
        this.numBall = numBall;
    }

    public int getNumFoul() {
        return numFoul;
    }

    public void setNumFoul(int numFoul) {
        this.numFoul = numFoul;
    }

    public int getNumOut() {
        return numOut;
    }

    public void setNumOut(int numOut) {
        this.numOut = numOut;
    }

    public int getNumRun() {
        return numRun;
    }

    public void setNumRun(int numRun) {
        this.numRun = numRun;
    }

    public int getInningNum() {
        return inningNum;
    }

    public void setInningNum(int inningNum) {
        this.inningNum = inningNum;
    }
}
