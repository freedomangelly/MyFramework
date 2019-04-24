package com.android.myframework.okhttp.architect_day27;

/**
 * Created by hcDarren on 2017/11/25.
 */
public interface UploadProgressListener {
    void onProgress(long total, long current);
}
