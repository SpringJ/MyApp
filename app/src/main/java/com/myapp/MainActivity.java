package com.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        TextView textView1 = (TextView) findViewById(R.id.textView1);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
    }
}
