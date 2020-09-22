package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    final ArrayList<Word> numbers = new ArrayList<Word>();
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        numbers.add(new Word("One", "lutti",R.drawable.one, R.raw.number_one));
        numbers.add(new Word("Two", "Otiiko", R.drawable.two, R.raw.number_two));
        numbers.add(new Word("Three", "toloosku",R.drawable.three, R.raw.number_three));
        numbers.add(new Word("Four", "oyyisa", R.drawable.four, R.raw.number_four));
        numbers.add(new Word("Five", "massoka", R.drawable.five, R.raw.number_five));
        numbers.add(new Word("Six", "tommaka", R.drawable.six, R.raw.number_six));
        numbers.add(new Word("Seven", "kenekaku", R.drawable.seven, R.raw.number_seven));
        numbers.add(new Word("Eight", "kanwita", R.drawable.eight, R.raw.number_eight));
        numbers.add(new Word("Nine", "wo,e", R.drawable.nine, R.raw.number_nine));
        numbers.add(new Word("Ten", "na achha", R.drawable.ten, R.raw.number_ten));


        // Simple array list to add items in it

//        numbers.add("One");
//        numbers.add("Two");
//        numbers.add("Three");
//        numbers.add("Four");
//        numbers.add("Five");
//        numbers.add("Six"); numbers.add("Seven");
//        numbers.add("Eight");
//        numbers.add("Nine");
//        numbers.add("Ten");

        WordAdapter wordAdapter = new WordAdapter(this, numbers);
        ListView numberlist = (ListView) findViewById(R.id.numberlist);
        numberlist.setAdapter(wordAdapter);


        numberlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = numbers.get(position);
                mediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getMaudioResourceId());
                mediaPlayer.start();

            }
        });


    }

//    @Override
//    protected void onStop() {
//        super.onStop();
//        mediaPlayer.release();
//    }
}