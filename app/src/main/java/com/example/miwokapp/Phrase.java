package com.example.miwokapp;

public class Phrase  {
    String mPhrase;
    String cPhrase;
    int phraseAudioResourceId;

    public Phrase(String Ephrase, String Cphrase,int phraseaudioId) {
        this.mPhrase = Ephrase;
        this.cPhrase = Cphrase;
        this.phraseAudioResourceId =  phraseaudioId;
    }

    public String getmPhrase() {
        return mPhrase;
    }

    public void setmPhrase(String mPhrase) {
        this.mPhrase = mPhrase;
    }

    public String getcPhrase() {
        return cPhrase;
    }

    public void setcPhrase(String cPhrase) {
        this.cPhrase = cPhrase;
    }

    public int getPhraseAudioResourceId() {
        return phraseAudioResourceId;
    }

    public void setPhraseAudioResourceId(int phraseAudioResourceId) {
        this.phraseAudioResourceId = phraseAudioResourceId;
    }
}
