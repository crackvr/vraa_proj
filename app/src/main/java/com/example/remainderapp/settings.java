package com.example.remainderapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class settings extends AppCompatActivity implements AdapterView.OnItemClickListener {


    ListView lv;
    String sets[]={"Snooze","ringtone","Vibrate","About"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        lv=findViewById(R.id.listv);
        ArrayAdapter<String> ada=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                sets);
        lv.setAdapter(ada);
        lv.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


        TextView txt = (TextView) view;
        if(txt.getText()== "About")
        {

        Intent i=new Intent(this,theAbt.class);
        startActivity(i);
    }
        if(txt.getText()== "ringtone")
        {

            Intent i1=new Intent(this,ringtones.class);
            startActivity(i1);
        }
        if(txt.getText()== "Snooze")
        {

            Intent i2=new Intent(this,snooze.class);
            startActivity(i2);
        }
        if(txt.getText()== "Vibrate")
        {

            Intent i3=new Intent(this,vibrate.class);
            startActivity(i3);
        }


    }

}
