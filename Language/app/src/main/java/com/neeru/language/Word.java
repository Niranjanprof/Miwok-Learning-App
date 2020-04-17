package com.neeru.language;

import java.util.ArrayList;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;
    private int mAudioResourceId;
    private  static  final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation,String miwokTranslation,int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = NO_IMAGE_PROVIDED;
        mAudioResourceId = audioResourceId;
    }
    //Overloading
    public Word(String defaultTranslation,String miwokTranslation,int imageResourceId,int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }
    public  String getmDefaultTranslation(){
        return mDefaultTranslation;
    }
    public  String getmMiwokTranslation(){
        return mMiwokTranslation;
    }
    public int getmImageResourceId(){return  mImageResourceId;}
    public boolean hasImage(){ return mImageResourceId != NO_IMAGE_PROVIDED; }
    public int getmAudioResourceId(){return mAudioResourceId;}
}
