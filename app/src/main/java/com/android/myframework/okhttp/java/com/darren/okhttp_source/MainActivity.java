package com.android.myframework.okhttp.java.com.darren.okhttp_source;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.myframework.R;

import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.CacheControl.Builder;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        OkHttpClient okHttpClient = new OkHttpClient.Builder().cache(new Cache()).build();
//
//        Request.Builder request = (Request.Builder) new Request.Builder().cacheControl(new Builder().noCache())
    }
}
