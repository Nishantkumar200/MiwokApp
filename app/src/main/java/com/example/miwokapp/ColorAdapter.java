package com.example.miwokapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ColorAdapter extends ArrayAdapter<Color> {
    public ColorAdapter(@NonNull Context context, int resource, @NonNull List<Color> colorsObject) {
        super(context, 0, colorsObject);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listview = convertView;
        if (listview == null) {
            listview = LayoutInflater.from(getContext()).inflate(R.layout.color_name_list, parent, false);
        }


        Color itemPosition = getItem(position);

        // linking to the xml file
        TextView  EnglishName = (TextView)listview.findViewById(R.id.englishName);

        // Setting Value to the @EnglishName
        EnglishName.setText(itemPosition.getmColors());

        TextView ChineseName = (TextView)listview.findViewById(R.id.chineseName);
        ChineseName.setText(itemPosition.getcColors());

        ImageView ColorImage = (ImageView)listview.findViewById(R.id.colorImage);
        ColorImage.setImageResource(itemPosition.getColorImage());


        return listview;
    }
}
