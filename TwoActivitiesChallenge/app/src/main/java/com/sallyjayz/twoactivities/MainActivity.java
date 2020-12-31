package com.sallyjayz.twoactivities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE = "com.sallyjayz.twoactivities.extra.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void launchSecondActivity(View view) {


        /*Passing data to second activity*/
        Intent intent = new Intent(this, SecondActivity.class);
        String message;
        switch (view.getId()) {
            case R.id.text_one:
                message = getString(R.string.text_one_message);
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            break;
            case R.id.text_two:
                message = getString(R.string.text_two_message);
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            break;
            case R.id.text_three:
                message = getString(R.string.text_three_message);
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            break;
        }
    }
}