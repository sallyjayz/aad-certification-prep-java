package com.sallyjayz.twoactivitieslifecyclestatechallenge;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mTextViewCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextViewCount = findViewById(R.id.count);

        if (savedInstanceState != null) {
            boolean isVisible = savedInstanceState.getBoolean("reply_visible");
            if (isVisible) {
                mTextViewCount.setText(savedInstanceState.getString("reply_text"));
            }
        }
    }


    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        if (mTextViewCount != null) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text", mTextViewCount.getText().toString());
        }
    }

    public void increment(View view) {
        mCount++;
        if (mTextViewCount != null) {
            mTextViewCount.setText(Integer.toString(mCount));
        }
    }
}