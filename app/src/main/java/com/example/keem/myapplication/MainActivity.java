package com.example.keem.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.keem.myapplication.fragment.MaindFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add Fregment

        if (savedInstanceState == null) {
            MaindFragment maindFragment = new MaindFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.mainConteiner, maindFragment)
                    .commit();
        }

    } // Main Method
}// Main Class
