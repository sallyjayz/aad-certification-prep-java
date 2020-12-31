package com.sallyjayz.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.sallyjayz.hellotoast.extra.MESSAGE";
    public static final String EXTRA_COUNT = "com.sallyjayz.hellotoast.extra.COUNT";

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = findViewById(R.id.show_count);
    }

    public void showWordCount(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = getString(R.string.hello);
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(EXTRA_COUNT, Integer.toString(mCount));
        startActivity(intent);
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}