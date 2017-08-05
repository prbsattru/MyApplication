package com.example.keem.myapplication.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.keem.myapplication.R;

public class MaindFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.maiin_fragment, container, false);//เรียกใช้ fragmentที่ได้สร้างขึ้น//
        return view;

    }
}// Main CLass
