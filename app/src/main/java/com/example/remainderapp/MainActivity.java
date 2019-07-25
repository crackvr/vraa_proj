package com.example.remainderapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button b1,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= findViewById(R.id.button5);
        b1.setOnClickListener(this);
        b2= findViewById(R.id.button);
        b2.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        if(v.getId()== b1.getId())
        {
            Intent i=new Intent(this,settings.class);
            startActivity(i);

        }

        if(v.getId()== b2.getId())
        {
            Intent j=new Intent(this,setRem.class);
            startActivity(j);

        }
    }


}
