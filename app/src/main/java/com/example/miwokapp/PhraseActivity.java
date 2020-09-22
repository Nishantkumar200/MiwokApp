package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhraseActivity extends AppCompatActivity {

    ArrayList<Phrase> phraseArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrase);

        phraseArrayList.add(new Phrase("Where are you going ?","minto wuksus",R.raw.phrase_where_are_you_going));
        phraseArrayList.add(new Phrase("What is your name ?","tinnә oyaase'nә",R.raw.phrase_what_is_your_name));
        phraseArrayList.add(new Phrase("My name is...","oyaaset...",R.raw.phrase_my_name_is));
        phraseArrayList.add(new Phrase("How are you feeling ?","michәksәs ?",R.raw.phrase_how_are_you_feeling));
        phraseArrayList.add(new Phrase("I'm feeling good.","kuchi achit",R.raw.phrase_im_feeling_good));
        phraseArrayList.add(new Phrase("Are you coming ?","әәnәs'aa?",R.raw.phrase_are_you_coming));
        phraseArrayList.add(new Phrase("Yes, I'm coming ","hәә’ әәnәm",R.raw.phrase_yes_im_coming));
        phraseArrayList.add(new Phrase("Let's go .?","yoowutis",R.raw.phrase_lets_go));
        phraseArrayList.add(new Phrase("Come here","әnni'nem",R.raw.phrase_come_here));


        PhraseAdapter phraseAdapter = new PhraseAdapter(this,0,phraseArrayList);
        ListView phraseListView = findViewById(R.id.phraseList);
        phraseListView.setAdapter(phraseAdapter);

        phraseListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Phrase phrasepostion = phraseArrayList.get(position);
                MediaPlayer mediaPlayer = MediaPlayer.create(PhraseActivity.this,phrasepostion.getPhraseAudioResourceId());
                mediaPlayer.start();

            }
        });
    }
}