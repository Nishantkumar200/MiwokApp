package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ColorsActivity extends AppCompatActivity {
    List<Color> color = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        color.add(new Color("red", "weṭeṭṭi", R.drawable.red, R.raw.color_red));
        color.add(new Color("green", "chokokki", R.drawable.green, R.raw.color_green));
        color.add(new Color("brown", "ṭakaakki", R.drawable.brown, R.raw.color_brown));
        color.add(new Color("gray", "ṭopoppi", R.drawable.gray, R.raw.color_gray));
        color.add(new Color("black", "kululli", R.drawable.black, R.raw.color_black));
        color.add(new Color("white", "kelelli", R.drawable.white, R.raw.color_white));
        color.add(new Color("dusty yellow", "ṭopiisә", R.drawable.dusty_yellow, R.raw.color_dusty_yellow));
        color.add(new Color("mustard yellow", "chiwiiṭә", R.drawable.mustard_yellow, R.raw.color_mustard_yellow));


        ColorAdapter arrayAdapter = new ColorAdapter(this, 0, color);
        final ListView colorlist = findViewById(R.id.colorsList);
        colorlist.setAdapter(arrayAdapter);

        colorlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Color colorpostion = color.get(position);
                MediaPlayer mediaPlayer =  MediaPlayer.create(ColorsActivity.this,colorpostion.getmColoraudioId());
                mediaPlayer.start();
            }
        });

    }
}