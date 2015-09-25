package com.moviles.salt.fragments;


import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.moviles.salt.fragments.fragments.ColorFragment;

public class MainActivity extends AppCompatActivity {

    ColorFragment color;
    ColorFragment color2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        color = new ColorFragment();
        color.init(ColorFragment.VIOLET);

        color2 = new ColorFragment();
        color2.init(ColorFragment.GREEN);

        FragmentTransaction fM = getSupportFragmentManager().beginTransaction();

        fM.replace(R.id.container,color);

        if(!getResources().getBoolean(R.bool.port))
            fM.replace(R.id.container2,color2);

        fM.commit();
    }

}
