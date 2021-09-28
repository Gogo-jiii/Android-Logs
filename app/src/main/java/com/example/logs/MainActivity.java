package com.example.logs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName()+" : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "IT Wala...");
        Log.e(TAG, "IT Wala...");
        Log.i(TAG, "IT Wala...");
        Log.v(TAG, "IT Wala...");
        Log.w(TAG, "IT Wala...");
    }
}