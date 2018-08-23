package com.example.admin.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


//this ArrayList contains the objects of the Word Class we declared
        ArrayList<Word> words=new ArrayList<Word>();
        //populate the ArrayList using the getMethod
        /**  Word w=new Word("lutti","one");
         words.add(w);**/
        words.add(new Word("father","apa",R.drawable.family_father));
        words.add(new Word("mother","ata",R.drawable.family_mother));
        words.add(new Word("son","angsi",R.drawable.family_son));
        words.add(new Word("daughter","tune",R.drawable.family_daughter));
        words.add(new Word("older brother","taachi",R.drawable.family_older_brother));
        words.add(new Word("younger brother","chalitti",R.drawable.family_younger_brother));
        words.add(new Word("older sister","tete",R.drawable.family_older_sister));
        words.add(new Word("younger sister","kolliti",R.drawable.family_younger_sister));
        words.add(new Word("grandfather","ama",R.drawable.family_grandfather));
        words.add(new Word("grandmother","paapa",R.drawable.family_grandmother));

        //dynamically adding the textviews from the ArrayList

        WordAdapter itemsAdapter=new WordAdapter(this,words,R.color.category_family);
        ListView listView=(ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


    }
}


