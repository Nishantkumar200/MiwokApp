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

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Objects;

public class FamilyAdapter extends ArrayAdapter<Family> {

    public FamilyAdapter(Context context, ArrayList<Family> familyArrayList) {
        super(context, 0, familyArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        listItem = LayoutInflater.from(getContext()).inflate(R.layout.family_list_item, parent, false);


        Family familypostion = getItem(position);

        TextView dFamilyName = (TextView) listItem.findViewById(R.id.defaultFamily);
        dFamilyName.setText(familypostion.getDefaultFamily());

        TextView miwokFamilyName = (TextView) listItem.findViewById(R.id.miwokFamily);
        miwokFamilyName.setText(familypostion.getMiwokFamily());

        ImageView familyImage = (ImageView)listItem.findViewById(R.id.familyMember);
        familyImage.setImageResource(familypostion.getFamilyPhoto());


        return listItem;
    }
}
