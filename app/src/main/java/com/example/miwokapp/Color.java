package com.example.miwokapp;

public class Color {
    String mColors;
    String cColors;
    int colorImage;
    int mColoraudioId;

    public Color(String mColors, String cColors, int colorImage, int mColoraudioId) {
        this.mColors = mColors;
        this.cColors = cColors;
        this.colorImage = colorImage;
        this.mColoraudioId = mColoraudioId;
    }


    //  Calling the Constructor




    public String getmColors() {
        return mColors;
    }

    public void setmColors(String mColors) {
        this.mColors = mColors;
    }

    public String getcColors() {
        return cColors;
    }

    public void setcColors(String cColors) {
        this.cColors = cColors;
    }

    public int getColorImage() {
        return colorImage;
    }

    public void setColorImage(int colorImage) {
        this.colorImage = colorImage;
    }

    public int getmColoraudioId() {
        return mColoraudioId;
    }

    public void setmColoraudioId(int mColoraudioId) {
        this.mColoraudioId = mColoraudioId;
    }
}
