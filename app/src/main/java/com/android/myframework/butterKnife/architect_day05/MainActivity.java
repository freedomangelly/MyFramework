package com.android.myframework.butterKnife.architect_day05;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.android.myframework.R;
import com.butterknife.ButterKnife;
import com.butterknife.Unbinder;
import com.butterknife.annotations.BindView;


public class MainActivity extends AppCompatActivity {
    @BindView(R.id.tv1)
    TextView textView1;

    Unbinder mUnbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.butter_knife_layout);

        mUnbinder = ButterKnife.bind(this);

        textView1.setText("butterKnife1");
    }


    @Override
    protected void onDestroy() {
        mUnbinder.unbind();
        super.onDestroy();
    }
}
