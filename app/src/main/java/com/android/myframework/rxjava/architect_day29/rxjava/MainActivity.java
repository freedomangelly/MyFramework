package com.android.myframework.rxjava.architect_day29.rxjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.android.myframework.R;

import io.reactivex.annotations.NonNull;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_1);
        // 1.观察者 Observable 被观察对象
        // Observer 观察者
        // subscribe 注册订阅
        Observable.just("urlxxx")
                .subscribe(new Observer<String>() {

                    @Override
                    public void onSubscribe() {
                        Log.e("TAG","onSubscribe");
                    }

                    @Override
                    public void onNext(@NonNull String s) {
                        Log.e("TAG","onNext = "+s);
                        Integer.parseInt("xx");
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        Log.e("TAG","onError");
                    }

                    @Override
                    public void onComplete() {
                        Log.e("TAG","onComplete");
                    }
                });

    }
}
