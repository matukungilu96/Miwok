package com.example.admin.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


//this ArrayList contains the objects of the Word Class we declared
        ArrayList<Word> words=new ArrayList<Word>();
        //populate the ArrayList using the getMethod
        /**  Word w=new Word("lutti","one");
         words.add(w);**/
      words.add(new Word("the weekend was boring","sato sikua na fom"));
        words.add(new Word("how are you","vipi lakini"));
        words.add(new Word("how old are you","kama miaka ngapi ivi"));
        words.add(new Word("good night","kojoa ulale"));
        words.add(new Word("where are you going","za mawapi"));
        words.add(new Word("you have a girlfriend","uko naye"));
        words.add(new Word("what is the plan","rada yako"));
        words.add(new Word("how much is your phone","iyo simu ni mangapi"));
        words.add(new Word("am coming","mimi uyo"));
        words.add(new Word("see you later","tuchekiane maidhaa"));
        words.add(new Word("i will be right back","naenda ivi nakam"));
        words.add(new Word("the exam was fine","teu haikua mbaya"));
        words.add(new Word("this phone is old now,i wanna sell it","hii teje imechapa,nitairusha"));


        //dynamically adding the textviews from the ArrayList

        WordAdapter itemsAdapter=new WordAdapter(this,words,R.color.category_phrases);
        ListView listView=(ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        }
}
