package com.cookandandroid.mobileprogramming_02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.Calendar;

public class Recipe1_2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe1_2);
        Calendar cal = Calendar.getInstance();
        LinearLayout Layout1, Layout2, Layout3, Layout4, Layout5, Layout6;
        int date = (cal.get(cal.DATE))%6+1;

        final ImageButton Eggrice, Salad, Salmonrice, Muksha, Friedrice, Beetjuice;

        Eggrice = (ImageButton)findViewById(R.id.eggrice);
        Salad = (ImageButton)findViewById(R.id.salad);
        Salmonrice = (ImageButton)findViewById(R.id.salmonrice);
        Muksha = (ImageButton)findViewById(R.id.muksha);
        Friedrice = (ImageButton)findViewById(R.id.friedrice);
        Beetjuice = (ImageButton)findViewById(R.id.beetjuice);

        Layout1 = (LinearLayout)findViewById(R.id.layout1);
        Layout2 = (LinearLayout)findViewById(R.id.layout2);
        Layout3 = (LinearLayout)findViewById(R.id.layout3);
        Layout4 = (LinearLayout)findViewById(R.id.layout4);
        Layout5 = (LinearLayout)findViewById(R.id.layout5);
        Layout6 = (LinearLayout)findViewById(R.id.layout6);

        if(date==1)
            Layout1.setVisibility(View.VISIBLE);
        else if(date==2)
            Layout2.setVisibility(View.VISIBLE);
        else if(date==3)
            Layout3.setVisibility(View.VISIBLE);
        else if(date==4)
            Layout4.setVisibility(View.VISIBLE);
        else if(date==5)
            Layout5.setVisibility(View.VISIBLE);
        else if(date==6)
            Layout6.setVisibility(View.VISIBLE);

        Eggrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Recipe1_1_1Activity.class);
                intent.putExtra("Food",1 );
                startActivity(intent);
            }
        });
        Salad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Recipe1_1_1Activity.class);
                intent.putExtra("Food",2 );
                startActivity(intent);
            }
        });
        Salmonrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Recipe1_1_1Activity.class);
                intent.putExtra("Food",3 );
                startActivity(intent);
            }
        });
        Muksha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Recipe1_1_1Activity.class);
                intent.putExtra("Food",4 );
                startActivity(intent);
            }
        });
        Friedrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Recipe1_1_1Activity.class);
                intent.putExtra("Food",5 );
                startActivity(intent);
            }
        });
        Beetjuice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Recipe1_1_1Activity.class);
                intent.putExtra("Food",6 );
                startActivity(intent);
            }
        });
    }
}
