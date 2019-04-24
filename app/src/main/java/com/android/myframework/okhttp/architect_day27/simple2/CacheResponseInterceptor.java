package com.android.myframework.okhttp.architect_day27.simple2;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Response;

/**
 * Created by hcDarren on 2017/11/25.
 */

public class CacheResponseInterceptor implements Interceptor{
    @Override
    public Response intercept(Chain chain) throws IOException {
        Response response = chain.proceed(chain.request());
        // 过期时间是 30s
        response = response.newBuilder()
                .removeHeader("Cache-Control")
                .removeHeader("Pragma")
                .addHeader("Cache-Control","max-age="+30).build();
        return response;
    }
}
