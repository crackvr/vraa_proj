package com.example.remainderapp;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class CallFragment extends Fragment {

    View view;
    Button firstButton;


    /* Read this link for more info on inflator : https://www.bignerdranch.com/blog/understanding-androids-layoutinflater-inflate/  */

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_call, container, false);



        // perform setOnClickListener on first Button



        return view;

    }

}

