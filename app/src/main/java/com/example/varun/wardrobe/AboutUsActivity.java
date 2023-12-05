package com.example.varun.wardrobe;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.shivani.miete.R;

public class AboutUsActivity extends AppCompatActivity {
    TextView textView2, varunText, tusharText, yugalText, textView3, aboutUsHead, disText, devText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        aboutUsHead = (TextView) findViewById(R.id.aboutUsHead);
        disText = (TextView) findViewById(R.id.disclaimer_id);
        devText = (TextView) findViewById(R.id.developers_id);
        textView2 = (TextView) findViewById(R.id.textView2);
        varunText = (TextView) findViewById(R.id.varun);
        tusharText = (TextView) findViewById(R.id.tushar);
        yugalText = (TextView) findViewById(R.id.yugal);
        textView3 = (TextView) findViewById(R.id.textView3);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/alex.ttf");
        textView2.setTypeface(custom_font);
        aboutUsHead.setTypeface(custom_font);
        varunText.setTypeface(custom_font);
        tusharText.setTypeface(custom_font);
        yugalText.setTypeface(custom_font);
        textView3.setTypeface(custom_font);
        disText.setTypeface(custom_font);
        devText.setTypeface(custom_font);
    }
}