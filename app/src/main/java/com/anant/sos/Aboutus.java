package com.anant.sos;



import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Aboutus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
    }

    public void Dan(View v){
        Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/AnantSingh0121"));
        startActivity(implicit);
    }

    public void kad(View v){
        Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/SanikaLad01"));
        startActivity(implicit);

    }

    public void Him(View v){
        Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/search?q=SANIKA+SHETE"));
        startActivity(implicit);

    }
    public void Man(View v){
        Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/AdityaChoudharyone/AdityaChoudharyone"));
        startActivity(implicit);

    }
}
