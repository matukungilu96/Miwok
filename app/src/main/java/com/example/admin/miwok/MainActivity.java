package com.example.admin.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//numbers onclick listener
        TextView numbers=(TextView)findViewById(R.id.numbers);
numbers.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent numbersIntent=new Intent(MainActivity.this,NumbersActivity.class);
        startActivity(numbersIntent);
    }
});//colrs intent

        //numbers onclick listener
        TextView colors=(TextView)findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colorsIntent=new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });//colors intent

        //family onclick listener
        TextView family=(TextView)findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent familyIntent=new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(familyIntent);
            }
        });//family intent

        //numbers onclick listener
        TextView phrase=(TextView)findViewById(R.id.phrases);
        phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phraseIntent=new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(phraseIntent);
            }
        });//numbers intent
    }

}