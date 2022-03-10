package com.example.frangments;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Configuration config = getResources().getConfiguration();
        if (config.smallestScreenWidthDp<720){

        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.Tab tab1 = actionBar.newTab().setText("INICIO");
        tab1.setTabListener(new MyTabListener(new Frag1()));
        actionBar.addTab(tab1);

        ActionBar.Tab tab2 = actionBar.newTab().setText("REGISTRO");
        tab2.setTabListener(new MyTabListener(new Frag2()));
        actionBar.addTab(tab2);}

        }



}