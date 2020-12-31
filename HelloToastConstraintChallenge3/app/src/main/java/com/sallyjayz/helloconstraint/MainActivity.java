package com.sallyjayz.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button mButtonZero, mButtonCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = findViewById(R.id.show_count);
        mButtonZero = findViewById(R.id.button_zero);
//        mButtonCount = findViewById(R.id.button_count);

    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            if (mCount % 2 == 0) {
                mShowCount.setText(Integer.toString(mCount));
//                mButtonCount.setBackgroundColor(getResources().getColor(R.color.green));
                view.setBackgroundColor(getResources().getColor(R.color.green));
            } else {
                mShowCount.setText(Integer.toString(mCount));
//                mButtonCount.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                view.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            }
            mButtonZero.setBackgroundColor(getResources().getColor(R.color.pink));
        }
    }

    public void reset(View view) {
        if (mCount > 0) {
            mCount = 0;
            mShowCount.setText(Integer.toString(mCount));
            mButtonZero.setBackgroundColor(getResources().getColor(R.color.gray));
        }

    }
}