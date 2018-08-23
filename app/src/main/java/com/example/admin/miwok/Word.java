package com.example.admin.miwok;

public class Word {
    //the two variables that holds the English and Miwok translation
    private  String mDefaulTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID;

    //constructor that assidgns the string  variables
    public Word(String defaultTranslation,String miwokTranslation){
        mDefaulTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
    }
    //another constructor that deals with image
    public  Word(String defaultTranslation,String miwokTranslation,int imageResourceId){
        mDefaulTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceID=imageResourceId;
    }
    //get mwthods for the variables
    //the words dont change so need for set methods
    public String getDefaulTranslation(){return mDefaulTranslation;}
    public  String getMiwokTranslation(){return  mMiwokTranslation;}
    public int getImageResourceID(){return mImageResourceID;}

}
