package com.neeru.language;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = findViewById(R.id.numbers);
        TextView family = findViewById(R.id.family);
        TextView phrases = findViewById(R.id.phrases);
        TextView colors = findViewById(R.id.colors);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numberIntent = new Intent(getApplicationContext(),NumbersActivity.class);
                startActivity(numberIntent);
            }
        });
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent familyIntent = new Intent(getApplicationContext(),FamilyActivity.class);
                startActivity(familyIntent);
            }
        });
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrasesIntent = new Intent(getApplicationContext(),PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colorsIntent = new Intent(getApplicationContext(),ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });
    }
}
