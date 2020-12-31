package com.sallyjayz.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String count = intent.getStringExtra(MainActivity.EXTRA_COUNT);

        TextView word = findViewById(R.id.word_text);
        word.setText(message);

        TextView currentCount = findViewById(R.id.current_count);
        currentCount.setText(count);
    }
}