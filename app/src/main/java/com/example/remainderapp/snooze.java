package com.example.remainderapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class snooze extends AppCompatActivity
        implements AdapterView.OnItemSelectedListener {
    Spinner s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snooze);
        String time[]={"5 min","10 min","15 min"};
        s2=(Spinner)findViewById(R.id.spinner2);
        ArrayAdapter<String> adap2=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,time);
        s2.setAdapter(adap2);
        s2.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
