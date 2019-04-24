package com.android.myframework;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.myframework.rxjava.UseRxjava;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_1);
        UseRxjava useRxjava=new UseRxjava();
        useRxjava.observer();
        useRxjava.observable();
        useRxjava.userDisposable();
        useRxjava.userMap();
        useRxjava.userFlatMap();

    }


}

