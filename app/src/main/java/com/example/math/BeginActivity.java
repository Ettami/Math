package com.example.math;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.content.Context;
import android.annotation.SuppressLint;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BeginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_begin);


    }
    public void onButtonClick(View view){
        Intent toMain = new Intent(this, MainActivity.class);
        startActivity(toMain);
    }
}