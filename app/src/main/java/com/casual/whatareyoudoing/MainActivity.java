package com.casual.whatareyoudoing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner doinglistspinner;
    TextView tetxview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doinglistspinner = findViewById(R.id.doinglist);
        tetxview = findViewById(R.id.trial);
        //initilize arraylis
        ArrayList<String> doinglistarray = new ArrayList<>();
        //Add elements in arrayList
        doinglistarray.add("one");
        doinglistarray.add("four");
        doinglistarray.add("three");
        doinglistarray.add("five");
        doinglistarray.add("seve");
        doinglistarray.add("ten");
        doinglistarray.add("ele");

        //Set adapter
        doinglistspinner.setAdapter(new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_spinner_dropdown_item,doinglistarray));

        doinglistspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    //Dsiplay toast
                    Toast.makeText(getApplicationContext(),"Please select",Toast.LENGTH_SHORT).show();
                }else{
                    String setSpinner = adapterView.getItemAtPosition(i).toString();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

}