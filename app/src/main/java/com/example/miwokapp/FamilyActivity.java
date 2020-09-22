package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {
    ArrayList<Family> families = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        families.add(new Family("Father", "әpә",R.drawable.father,R.raw.family_father));
        families.add(new Family("Mother", "әta",R.drawable.mother,R.raw.family_mother));
        families.add(new Family("Son", "angsi",R.drawable.son,R.raw.family_son));
        families.add(new Family("Daughter", "tune",R.drawable.daughter,R.raw.family_daughter));
        families.add(new Family("Older brother", "taachi",R.drawable.olderbrother,R.raw.family_older_brother));
        families.add(new Family("Younger Brother", "chalitti",R.drawable.youngerbrother,R.raw.family_younger_brother));
        families.add(new Family("Older Sister", "tete",R.drawable.oldersister,R.raw.family_older_sister));
        families.add(new Family("Younger sister", "kolliti",R.drawable.youngersister,R.raw.family_younger_sister));
        families.add(new Family("Grand Mother", "ama",R.drawable.grandmother,R.raw.family_grandmother));
        families.add(new Family("Grand Father", "pappa",R.drawable.grandfather,R.raw.family_grandfather));

        FamilyAdapter familyAdapter = new FamilyAdapter(this, families);
        ListView familyList = findViewById(R.id.familylist);
        familyList.setAdapter(familyAdapter);

        familyList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Family family =families.get(position);
                MediaPlayer mediaPlayer =  MediaPlayer.create(FamilyActivity.this,family.getFamilyResourceId());
                mediaPlayer.start();
            }
        });
    }
}