package com.example.numberlotto;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;


public class ShowResultActivity extends AppCompatActivity {
    public static final String BUTTON = "com.example.numberlotto.BUTTON";
    private String mDisplay;
    private int mDefaultValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView result = findViewById(R.id.textView_result);
        getStateValues();
        result.setText(mDisplay);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAgain();
            }
        });
    }

    private void playAgain() {
        Intent intent = new Intent(this, BetActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intent);
        finish();
    }

    private void getStateValues() {
        Intent intent = getIntent();
        mDefaultValue = -1;
        int pickNumber = intent.getIntExtra(BUTTON, mDefaultValue);
        if (pickNumber != mDefaultValue) {
            int correctNumber = NumberLotto.getInstance().placeBet();
            boolean betResult = NumberLotto.getInstance().confirmBet(correctNumber, pickNumber);
            mDisplay = NumberLotto.getInstance().confirmResult(betResult, correctNumber, pickNumber);
        }

    }

}
