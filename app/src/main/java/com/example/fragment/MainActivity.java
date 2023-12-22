package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnFragA, btnFragB, btnFragC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnnews = findViewById(R.id.btnNews);
        btnnews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, NewsFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("Yes")
                        .commit();
            }
        });

        Button btnscience = findViewById(R.id.btnScience);
        btnscience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, ScienceFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("Yes")
                        .commit();
            }
        });

        Button btnsport = findViewById(R.id.btnSports);
        btnsport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, SportFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("Yes")
                        .commit();
            }
        });

    }
}