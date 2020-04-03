package com.bb.viewgroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TAG_X", "onCreate: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG_X", "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG_X", "onResume: ");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG_X", "onPause: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TAG_X", "onRestart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG_X", "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG_X", "onDestroy: ");
    }
}


