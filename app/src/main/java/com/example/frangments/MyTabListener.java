package com.example.frangments;

import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MyTabListener implements ActionBar .TabListener{

    private Fragment Frag;
    public MyTabListener(Fragment Frag){
        this.Frag = Frag;
    }
    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {

        ft.replace(R.id.layoutfrag, this.Frag, null);
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
