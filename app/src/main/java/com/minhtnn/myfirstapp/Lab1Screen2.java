package com.minhtnn.myfirstapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Lab1Screen2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab1_screen2);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}
