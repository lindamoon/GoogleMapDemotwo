package com.feima.googlemapdemo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

public class MainActivity extends FragmentActivity {


    private FragmentManager mSupportFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSupportFragmentManager = getSupportFragmentManager();
        mSupportFragmentManager
                .beginTransaction()
                .add(R.id.fl_map,GoogMapFragment.newInstance())
                .commit();
    }
}
