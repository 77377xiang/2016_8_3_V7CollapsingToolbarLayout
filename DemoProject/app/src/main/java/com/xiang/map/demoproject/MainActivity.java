package com.xiang.map.demoproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView  list;
    List<Persen> persens= new  ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list= (ListView) findViewById(R.id.list);
        intData();
        ListAdapter adapter=new ListAdapter(this,persens);
        list.setAdapter(adapter);

    }
    private void intData(){
        for (int i=0;i<10;i++){
            Persen persen=new Persen();
           persen.setPhoto(R.drawable.datu);
            persens.add(persen);


        }

    };


}

