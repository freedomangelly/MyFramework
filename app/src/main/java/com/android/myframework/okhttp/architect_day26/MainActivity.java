package com.android.myframework.okhttp.architect_day26;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.android.myframework.R;
import com.android.myframework.okhttp.architect_day26.okhttp.Call;
import com.android.myframework.okhttp.architect_day26.okhttp.Callback;
import com.android.myframework.okhttp.architect_day26.okhttp.OkHttpClient;
import com.android.myframework.okhttp.architect_day26.okhttp.Request;
import com.android.myframework.okhttp.architect_day26.okhttp.RequestBody;
import com.android.myframework.okhttp.architect_day26.okhttp.Response;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RequestBody requestBody = new RequestBody()
                .type(RequestBody.FORM)
                .addParam("pageNo", 1+"")
                .addParam("platform", "android");
        final Request request = new Request.Builder()
                .url("https://api.saiwuquan.com/api/appv2/sceneModel")
                .post(requestBody)
                .build();

        OkHttpClient okHttpClient = new OkHttpClient();

        okHttpClient.newCall(request).enqueue(new Callback() {

            @Override
            public void onFailure(Call call, IOException e) {
                //e.printStackTrace();
                Log.e("TAG", "出错了");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String result = response.string();
                Log.e("TAG", result);
            }
        });
    }
}
