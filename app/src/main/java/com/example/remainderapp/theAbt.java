package com.example.remainderapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class theAbt extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView lv;
    String instag[]={"@starkyboi0913","@crack.vr","@being_akhilistic","abhilash525"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_abt);
        setContentView(R.layout.activity_settings);
        lv=findViewById(R.id.listv);
        ArrayAdapter<String> ada=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                instag);
        lv.setAdapter(ada);
        lv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



    }
}
