package com.example.miwokapp;

import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.annotation.MainThread;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView number,family,colors,phrase;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = findViewById(R.id.numbers);
        family = findViewById(R.id.family);
        colors = findViewById(R.id.colors);
        phrase = findViewById(R.id.phrase);


        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,NumbersActivity.class));
            }
        });


        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,FamilyActivity.class));
            }
        });

        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ColorsActivity.class
                ));
            }
        });

        phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,PhraseActivity.class));
            }
        });
    }

    @Override
    public void onBackPressed() {
            super.onBackPressed();
            Toast.makeText(MainActivity.this,"You exit from the App, Plase Visit Again !",Toast.LENGTH_LONG).show();
    }
}