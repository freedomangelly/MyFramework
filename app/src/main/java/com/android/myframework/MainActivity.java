package com.android.myframework;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import rx.Observer;
import rx.Subscriber;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void observer(){//观察者
        Observer observer=new Observer() {
            @Override
            public void onCompleted() {
                11
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Object o) {

            }
        };


    }

    public void subscriber(){
        Subscriber subscriber=new Subscriber() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Object o) {

            }
        };
    }
}
