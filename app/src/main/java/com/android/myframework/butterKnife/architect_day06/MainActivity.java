package com.android.myframework.butterKnife.architect_day06;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.myframework.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 布局里面明明是 match_parent ,但是添加到其他ViewGroup的时候会发现变成了包裹内容
        // LayoutInflater.from(context).inflate(R.layout.item_recycler,parent,false);

        /*View.inflate(context,R.layout.item_recycler,null);
        LayoutInflater.from(context).inflate(R.layout.item_recycler,parent);
        LayoutInflater.from(context).inflate(R.layout.item_recycler,parent,false);*/
    }
}
