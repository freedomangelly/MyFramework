package com.android.myframework.AOP.architect_day02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @CheckNet
    public void click(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @CheckNet
    public void postData() {

    }
}
