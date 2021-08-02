package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "onCreate  is called", Toast.LENGTH_SHORT).show();

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.BLACK);
                findViewById(R.id.ll).setBackgroundColor(Color.CYAN);

            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume  is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause  is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy  is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart  is called", Toast.LENGTH_SHORT).show();
    }

    /*public void buttonIsClicked(View buttonView){

        buttonView.setBackgroundColor(Color.RED);
        findViewById(R.id.ll).setBackgroundColor(Color.BLUE);
    }*/
}
