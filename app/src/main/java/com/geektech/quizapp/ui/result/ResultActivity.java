package com.geektech.quizapp.ui.result;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.geektech.quizapp.R;

public class ResultActivity extends AppCompatActivity {

    public static void start(Context context) {
        context.startActivity(new Intent(context, ResultActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //TODO: Result screen design
        setContentView(R.layout.activity_result);
    }
}
