package com.example.android.newhavenfoodspots;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the ViewPager that allows user to swipe between fragments
        ViewPager viewPager = findViewById(R.id.viewpager);

        //Create an adaptor to show the fragments for each tab
        CategoryAdapter categoryAdapter = new CategoryAdapter(MainActivity.this, getSupportFragmentManager());

        //Set the categoryAdapter on the viewPager
        viewPager.setAdapter(categoryAdapter);

        //Find the tabLayout showing tabs
        TabLayout tabLayout = findViewById(R.id.tabs);

        //Connect the tabLayout with the viewPager
        tabLayout.setupWithViewPager(viewPager);


    }
}
