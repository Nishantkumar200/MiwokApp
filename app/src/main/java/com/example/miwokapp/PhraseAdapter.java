package com.example.miwokapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class PhraseAdapter extends ArrayAdapter<Phrase> {
    public PhraseAdapter(@NonNull Context context, int resource, @NonNull List<Phrase> phraseList) {
        super(context, 0, phraseList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listview = convertView;
        if(listview==null){
            listview = LayoutInflater.from(getContext()).inflate(R.layout.phrase_list,parent,false);
        }

        Phrase phraseposition =  getItem(position);

        TextView englishPhrase = (TextView)listview.findViewById(R.id.englishPhrase);
        englishPhrase.setText(phraseposition.getmPhrase());

        TextView chinesePhrase  = (TextView)listview.findViewById(R.id.chinesePhrase);
        chinesePhrase.setText(phraseposition.getcPhrase());

        return listview;
    }
}
