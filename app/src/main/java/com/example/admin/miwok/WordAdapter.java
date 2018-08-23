package com.example.admin.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    int mColorResource;
    public  WordAdapter(Activity context,ArrayList<Word> words,int colorResource){
        super(context,0,words);
        mColorResource=colorResource;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       View listItems=convertView;
       if(listItems==null){
           listItems= LayoutInflater.from(getContext()).inflate(R.layout.list_items,parent,false);
       }
       Word currentWord=getItem(position);
        TextView miwokTranslation=(TextView)listItems.findViewById(R.id.miwok_text_view);
        miwokTranslation.setText(currentWord.getMiwokTranslation());

        TextView defaultTranslation=(TextView)listItems.findViewById(R.id.default_text_view);
       defaultTranslation.setText(currentWord.getDefaulTranslation());

        ImageView resourceImageID=(ImageView)listItems.findViewById(R.id.imageResoureID);
        resourceImageID.setImageResource(currentWord.getImageResourceID());
        //set color for different activities at run time
        View textContainer= listItems.findViewById(R.id.text_container);
        int color= ContextCompat.getColor(getContext(),mColorResource);
        textContainer.setBackgroundColor(color);
        //Return the whole list
       return  listItems;
    }
}
