package com.example.miwokapp;

public class Family {
    String defaultFamily;
    String miwokFamily;
    int familyPhoto;
    int familyResourceId;

    public Family(String defaultFamily, String miwokFamily, int Familyphoto, int FamilyId) {
        this.defaultFamily = defaultFamily;
        this.miwokFamily = miwokFamily;
        this.familyPhoto = Familyphoto;
        this.familyResourceId = FamilyId;
    }

    public String getDefaultFamily() {
        return defaultFamily;
    }


    public String getMiwokFamily() {
        return miwokFamily;
    }

    public int getFamilyPhoto() {
        return familyPhoto;
    }

    public void setFamilyPhoto(int familyPhoto) {
        this.familyPhoto = familyPhoto;
    }

    public int getFamilyResourceId() {
        return familyResourceId;
    }

    public void setFamilyResourceId(int familyResourceId) {
        this.familyResourceId = familyResourceId;
    }
}
