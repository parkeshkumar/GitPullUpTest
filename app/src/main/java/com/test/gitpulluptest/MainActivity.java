package com.test.gitpulluptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Message","Hello Git");
        Log.i("Message","Hello Git2");
        Log.i("Message","Hello Git3");
    }
    private void setGit(){
        int i=0;
    }
}
