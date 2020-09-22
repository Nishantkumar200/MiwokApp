package com.example.miwokapp;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Objects;

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(@NonNull Context context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listview = convertView;

        listview = LayoutInflater.from(getContext()).inflate(R.layout.number_list_items, parent, false);

        TextView defaultname = (TextView) listview.findViewById(R.id.defaultTranslation);
        defaultname.setText(Objects.requireNonNull(getItem(position)).getmDefaultTranslation());

        // first link the xml file to java and then set the method
        TextView miwoknmae = (TextView) listview.findViewById(R.id.mMiwokTranslation);
        miwoknmae.setText(Objects.requireNonNull(getItem(position)).getmMiwokTranslation());



        ImageView images = (ImageView) listview.findViewById(R.id.defaultImage);
        images.setImageResource(getItem(position).getImageView());




        return listview;
    }


}
