package com.android.myframework.butterKnife.architect_day05;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.android.myframework.R;
import com.butterknife.annotations.BindView;


public class MainActivity1 extends AppCompatActivity {
    @BindView(R.id.tv1)
    TextView textView3;
    @BindView(R.id.tv2)
    TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.butter_knife_layout);

        textView3.setText("butterKnife1");

        textView4.setText("butterKnife2");
    }
}
