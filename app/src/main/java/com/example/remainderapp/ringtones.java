package com.example.remainderapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ringtones extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ringtones);
        s1=(Spinner)findViewById(R.id.spinner);                                                //simple_list_item_checked
        ArrayAdapter adap1=ArrayAdapter.createFromResource(this,R.array.color,android.R.layout.simple_list_item_activated_1);
        s1.setAdapter(adap1);
        s1.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
