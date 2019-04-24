package com.android.myframework.okhttp.architect_day25;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.android.myframework.R;
import com.android.myframework.okhttp.architect_day25.okhttp.Call;
import com.android.myframework.okhttp.architect_day25.okhttp.Callback;
import com.android.myframework.okhttp.architect_day25.okhttp.OkHttpClient;
import com.android.myframework.okhttp.architect_day25.okhttp.Request;
import com.android.myframework.okhttp.architect_day25.okhttp.RequestBody;
import com.android.myframework.okhttp.architect_day25.okhttp.Response;

import java.io.File;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        File file = new File("");

        OkHttpClient client = new OkHttpClient();
        RequestBody requestBody = new RequestBody()
                .type(RequestBody.FORM)
                .addParam("file", RequestBody.create(file))
                .addParam("file2", RequestBody.create(file))
                .addParam("pageSize", 1 + "");

        Request request = new Request.Builder()
                .url("https://api.saiwuquan.com/api/appv2/sceneModel")
                .post(requestBody).build();

        Call call = client.newCall(request);

        call.enqueue(new Callback() {

            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Log.e("TAG", response.string());
                //Log.e("TAG",response.string());
            }
        });
    }

    // 设计的类比较多，写出来代码的思想（UML）, 体现的调用形式搭起来，把里面的细节填好
}
