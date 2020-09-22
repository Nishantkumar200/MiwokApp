package com.example.miwokapp;

import android.graphics.drawable.Drawable;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int imageView;
    private int maudioResourceId;

    public Word(String defaultTranslation, String MiwokTranslation, int sideimage, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        imageView = sideimage;
        maudioResourceId = audioResourceId;

    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public void setmDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public void setmMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
    }


    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public int getMaudioResourceId() {
        return maudioResourceId;
    }
}

