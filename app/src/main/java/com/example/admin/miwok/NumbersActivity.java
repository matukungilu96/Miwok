package com.example.admin.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


//this ArrayList contains the objects of the Word Class we declared
        ArrayList<Word> words=new ArrayList<Word>();
        //populate the ArrayList using the getMethod
      /**  Word w=new Word("lutti","one");
        words.add(w);**/
      words.add(new Word("one","lutti",R.drawable.number_one));
        words.add(new Word("two","otiiko",R.drawable.number_two));
        words.add(new Word("three","tolookosu",R.drawable.number_three));
        words.add(new Word("four","oyyisa",R.drawable.number_four));
        words.add(new Word("five","massoka",R.drawable.number_five));
        words.add(new Word("six","temmokka",R.drawable.number_six));
        words.add(new Word("seven","kenakaku",R.drawable.number_seven));
        words.add(new Word("eight","kawinta",R.drawable.number_eight));
        words.add(new Word("nine","wo'e",R.drawable.number_nine));
        words.add(new Word("ten","na'aacha",R.drawable.number_ten));

        //dynamically adding the textviews from the ArrayList

        WordAdapter itemsAdapter=new WordAdapter(this,words,R.color.category_numbers);
        ListView listView=(ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


    }
}
