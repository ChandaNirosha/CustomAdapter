package com.example.sys9.customadapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public GridView gridView;
    String[] arr = {"sth1", "sth2", "sth3", "sth4"};
    int[] images = {R.drawable.img1, R.drawable.img2, R.drawable.image3, R.drawable.image4, R.drawable.image5};
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView= findViewById(R.id.gridview1);
        customAdapter = new CustomAdapter(this,arr,images);
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView t1=view.findViewById(R.id.name);
                String msg=t1.getText().toString();
                Toast toast=Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT);
                toast.show();
                Intent I=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(I);


            }
        });



    }
    }



