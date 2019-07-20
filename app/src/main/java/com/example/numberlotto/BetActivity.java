package com.example.numberlotto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BetActivity extends AppCompatActivity {

    private int mOne;
    private int mTwo;
    private int mThree;
    private int mFour;
    private int mFive;
    private int mSix;
    private int mSeven;
    private int mEight;
    private int mNine;
    private int mTen;

    private Button mButtonOne;
    private Button mButtonTwo;
    private Button mButtonThree;
    private Button mButtonFour;
    private Button mButtonFive;
    private Button mButtonSix;
    private Button mButtonSeven;
    private Button mButtonEight;
    private Button mButtonNine;
    private Button mButtonTen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bet);
        getStateValues();
        passSelectedButton();
    }

    private void getStateValues() {
        mButtonOne = findViewById(R.id.button_one);
        mOne = Integer.parseInt(mButtonOne.getText().toString());
        mButtonTwo = findViewById(R.id.button_two);
        mTwo = Integer.parseInt(mButtonTwo.getText().toString());
        mButtonThree = findViewById(R.id.button_three);
        mThree = Integer.parseInt(mButtonThree.getText().toString());
        mButtonFour = findViewById(R.id.button_four);
        mFour = Integer.parseInt(mButtonFour.getText().toString());
        mButtonFive = findViewById(R.id.button_five);
        mFive = Integer.parseInt(mButtonFive.getText().toString());
        mButtonSix = findViewById(R.id.button_six);
        mSix = Integer.parseInt(mButtonSix.getText().toString());
        mButtonSeven = findViewById(R.id.button_seven);
        mSeven = Integer.parseInt(mButtonSeven.getText().toString());
        mButtonEight = findViewById(R.id.button_eight);
        mEight = Integer.parseInt(mButtonEight.getText().toString());
        mButtonNine = findViewById(R.id.button_nine);
        mNine = Integer.parseInt(mButtonNine.getText().toString());
        mButtonTen = findViewById(R.id.button_ten);
        mTen = Integer.parseInt(mButtonTen.getText().toString());
    }

    private void passSelectedButton() {

        mButtonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BetActivity.this, ShowResultActivity.class);
                intent.putExtra(ShowResultActivity.BUTTON, mOne);
                startActivity(intent);
                finish();
            }
        });
        mButtonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BetActivity.this, ShowResultActivity.class);
                intent.putExtra(ShowResultActivity.BUTTON, mTwo);
                startActivity(intent);
                finish();
            }
        });
        mButtonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BetActivity.this, ShowResultActivity.class);
                intent.putExtra(ShowResultActivity.BUTTON, mThree);
                startActivity(intent);
                finish();
            }
        });
        mButtonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BetActivity.this, ShowResultActivity.class);
                intent.putExtra(ShowResultActivity.BUTTON, mFour);
                startActivity(intent);
                finish();
            }
        });
        mButtonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BetActivity.this, ShowResultActivity.class);
                intent.putExtra(ShowResultActivity.BUTTON, mFive);
                startActivity(intent);
                finish();
            }
        });
        mButtonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BetActivity.this, ShowResultActivity.class);
                intent.putExtra(ShowResultActivity.BUTTON, mSix);
                startActivity(intent);
                finish();
            }
        });
        mButtonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BetActivity.this, ShowResultActivity.class);
                intent.putExtra(ShowResultActivity.BUTTON, mSeven);
                startActivity(intent);
                finish();
            }
        });
        mButtonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BetActivity.this, ShowResultActivity.class);
                intent.putExtra(ShowResultActivity.BUTTON, mEight);
                startActivity(intent);
                finish();
            }
        });
        mButtonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BetActivity.this, ShowResultActivity.class);
                intent.putExtra(ShowResultActivity.BUTTON, mNine);
                startActivity(intent);
                finish();
            }
        });
        mButtonTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BetActivity.this, ShowResultActivity.class);
                intent.putExtra(ShowResultActivity.BUTTON, mTen);
                startActivity(intent);
                finish();
            }
        });
    }
}
