package com.sallyjayz.twoactivitieslifecyclestatechallenge;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final int ITEM_REQUEST = 1;

    private TextView mTextView1, mTextView2, mTextView3, mTextView4, mTextView5,
            mTextView6, mTextView7, mTextView8, mTextView9, mTextView10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView1 = findViewById(R.id.item_1);
        mTextView2 = findViewById(R.id.item_2);
        mTextView3 = findViewById(R.id.item_3);
        mTextView4 = findViewById(R.id.item_4);
        mTextView5 = findViewById(R.id.item_5);
        mTextView6 = findViewById(R.id.item_6);
        mTextView7 = findViewById(R.id.item_7);
        mTextView8 = findViewById(R.id.item_8);
        mTextView9 = findViewById(R.id.item_9);
        mTextView10 = findViewById(R.id.item_10);

        if (savedInstanceState != null) {
            boolean isVisible = savedInstanceState.getBoolean("reply_visible");
            if (isVisible) {
                mTextView1.setText(savedInstanceState.getString("reply_text1"));
                mTextView1.setVisibility(View.VISIBLE);

                mTextView2.setText(savedInstanceState.getString("reply_text2"));
                mTextView2.setVisibility(View.VISIBLE);

                mTextView3.setText(savedInstanceState.getString("reply_text3"));
                mTextView3.setVisibility(View.VISIBLE);

                mTextView4.setText(savedInstanceState.getString("reply_text4"));
                mTextView4.setVisibility(View.VISIBLE);

                mTextView5.setText(savedInstanceState.getString("reply_text5"));
                mTextView5.setVisibility(View.VISIBLE);

                mTextView6.setText(savedInstanceState.getString("reply_text6"));
                mTextView6.setVisibility(View.VISIBLE);

                mTextView7.setText(savedInstanceState.getString("reply_text7"));
                mTextView7.setVisibility(View.VISIBLE);

                mTextView8.setText(savedInstanceState.getString("reply_text8"));
                mTextView8.setVisibility(View.VISIBLE);

                mTextView9.setText(savedInstanceState.getString("reply_text9"));
                mTextView9.setVisibility(View.VISIBLE);

                mTextView10.setText(savedInstanceState.getString("reply_text10"));
                mTextView10.setVisibility(View.VISIBLE);

            }
        }
    }

    public void addItem(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, ITEM_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == ITEM_REQUEST) {
            if (resultCode == RESULT_OK) {
                String itemOne = data.getStringExtra(SecondActivity.EXTRA_ITEM_ONE);
                mTextView1.setText(itemOne);
                mTextView1.setVisibility(View.VISIBLE);

                String itemTwo = data.getStringExtra(SecondActivity.EXTRA_ITEM_TWO);
                mTextView2.setText(itemTwo);
                mTextView2.setVisibility(View.VISIBLE);

                String itemThree = data.getStringExtra(SecondActivity.EXTRA_ITEM_THREE);
                mTextView3.setText(itemThree);
                mTextView3.setVisibility(View.VISIBLE);

                String itemFour = data.getStringExtra(SecondActivity.EXTRA_ITEM_FOUR);
                mTextView4.setText(itemFour);
                mTextView4.setVisibility(View.VISIBLE);

                String itemFive = data.getStringExtra(SecondActivity.EXTRA_ITEM_FIVE);
                mTextView5.setText(itemFive);
                mTextView5.setVisibility(View.VISIBLE);

                String itemSix = data.getStringExtra(SecondActivity.EXTRA_ITEM_SIX);
                mTextView6.setText(itemSix);
                mTextView6.setVisibility(View.VISIBLE);

                String itemSeven = data.getStringExtra(SecondActivity.EXTRA_ITEM_SEVEN);
                mTextView7.setText(itemSeven);
                mTextView7.setVisibility(View.VISIBLE);

                String itemEight = data.getStringExtra(SecondActivity.EXTRA_ITEM_EIGHT);
                mTextView8.setText(itemEight);
                mTextView8.setVisibility(View.VISIBLE);

                String itemNine = data.getStringExtra(SecondActivity.EXTRA_ITEM_NINE);
                mTextView9.setText(itemNine);
                mTextView9.setVisibility(View.VISIBLE);

                String itemTen = data.getStringExtra(SecondActivity.EXTRA_ITEM_TEN);
                mTextView10.setText(itemTen);
                mTextView10.setVisibility(View.VISIBLE);
            }
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        if (mTextView1.getVisibility() == View.VISIBLE || mTextView2.getVisibility() == View.VISIBLE
                || mTextView3.getVisibility() == View.VISIBLE || mTextView4.getVisibility() == View.VISIBLE
                || mTextView5.getVisibility() == View.VISIBLE || mTextView6.getVisibility() == View.VISIBLE
                || mTextView7.getVisibility() == View.VISIBLE || mTextView8.getVisibility() == View.VISIBLE
                || mTextView9.getVisibility() == View.VISIBLE || mTextView10.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text1", mTextView1.getText().toString());
            outState.putString("reply_text2", mTextView2.getText().toString());
            outState.putString("reply_text3", mTextView3.getText().toString());
            outState.putString("reply_text4", mTextView4.getText().toString());
            outState.putString("reply_text5", mTextView5.getText().toString());
            outState.putString("reply_text6", mTextView6.getText().toString());
            outState.putString("reply_text7", mTextView7.getText().toString());
            outState.putString("reply_text8", mTextView8.getText().toString());
            outState.putString("reply_text9", mTextView9.getText().toString());
            outState.putString("reply_text10", mTextView10.getText().toString());
        }
    }
}