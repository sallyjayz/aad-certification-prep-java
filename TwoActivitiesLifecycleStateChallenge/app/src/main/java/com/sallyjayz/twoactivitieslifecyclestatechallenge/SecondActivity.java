package com.sallyjayz.twoactivitieslifecyclestatechallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static final String EXTRA_ITEM_ONE = "com.sallyjayz.twoactivities.extra.ITEM_ONE";
    public static final String EXTRA_ITEM_TWO = "com.sallyjayz.twoactivities.extra.ITEM_TWO";
    public static final String EXTRA_ITEM_THREE = "com.sallyjayz.twoactivities.extra.ITEM_THREE";
    public static final String EXTRA_ITEM_FOUR = "com.sallyjayz.twoactivities.extra.ITEM_FOUR";
    public static final String EXTRA_ITEM_FIVE = "com.sallyjayz.twoactivities.extra.ITEM_FIVE";
    public static final String EXTRA_ITEM_SIX = "com.sallyjayz.twoactivities.extra.ITEM_SIX";
    public static final String EXTRA_ITEM_SEVEN = "com.sallyjayz.twoactivities.extra.ITEM_SEVEN";
    public static final String EXTRA_ITEM_EIGHT = "com.sallyjayz.twoactivities.extra.ITEM_EIGHT";
    public static final String EXTRA_ITEM_NINE = "com.sallyjayz.twoactivities.extra.ITEM_NINE";
    public static final String EXTRA_ITEM_TEN = "com.sallyjayz.twoactivities.extra.ITEM_TEN";

    private Button mButton1, mButton2, mButton3, mButton4, mButton5,
            mButton6, mButton7, mButton8, mButton9, mButton10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mButton1 = findViewById(R.id.item_btn_1);
        mButton2 = findViewById(R.id.item_btn_2);
        mButton3 = findViewById(R.id.item_btn_3);
        mButton4 = findViewById(R.id.item_btn_4);
        mButton5 = findViewById(R.id.item_btn_5);
        mButton6 = findViewById(R.id.item_btn_6);
        mButton7 = findViewById(R.id.item_btn_7);
        mButton8 = findViewById(R.id.item_btn_8);
        mButton9 = findViewById(R.id.item_btn_9);
        mButton10 = findViewById(R.id.item_btn_10);

    }

    public void pickItem(View view) {

        Intent intent;

        switch (view.getId()) {
            case R.id.item_btn_1:
                intent = new Intent();
                intent.putExtra(EXTRA_ITEM_ONE, getString(R.string.cheese));
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.item_btn_2:
                intent = new Intent();
                intent.putExtra(EXTRA_ITEM_TWO, getString(R.string.apples));
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.item_btn_3:
                intent = new Intent();
                intent.putExtra(EXTRA_ITEM_THREE, getString(R.string.rice));
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.item_btn_4:
                intent = new Intent();
                intent.putExtra(EXTRA_ITEM_FOUR, getString(R.string.beans));
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.item_btn_5:
                intent = new Intent();
                intent.putExtra(EXTRA_ITEM_FIVE, getString(R.string.spaghetti));
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.item_btn_6:
                intent = new Intent();
                intent.putExtra(EXTRA_ITEM_SIX, getString(R.string.watermelon));
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.item_btn_7:
                intent = new Intent();
                intent.putExtra(EXTRA_ITEM_SEVEN, getString(R.string.fish));
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.item_btn_8:
                intent = new Intent();
                intent.putExtra(EXTRA_ITEM_EIGHT, getString(R.string.samosa));
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.item_btn_9:
                intent = new Intent();
                intent.putExtra(EXTRA_ITEM_NINE, getString(R.string.cake));
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.item_btn_10:
                intent = new Intent();
                intent.putExtra(EXTRA_ITEM_TEN, getString(R.string.cookies));
                setResult(RESULT_OK, intent);
                finish();
                break;

        }

    }
}