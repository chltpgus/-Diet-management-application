package com.cookandandroid.mobileprogramming_02;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Recipe1_1_1Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe1_1_1);

        final int Food;
        ImageView ImgText1;
        LinearLayout Eggricelayout, Saladlayout, Salmonricelayout, Mukshalayout, Friedricelayout, Beetjuicelayout;

        ImgText1 = (ImageView)findViewById(R.id.imgtext1);
        Eggricelayout = (LinearLayout)findViewById(R.id.eggricelayout) ;
        Saladlayout = (LinearLayout)findViewById(R.id.saladlayout) ;
        Salmonricelayout = (LinearLayout)findViewById(R.id.salmonrice) ;
        Mukshalayout = (LinearLayout)findViewById(R.id.mukshalayout);
        Friedricelayout = (LinearLayout)findViewById(R.id.friedricelayout);
        Beetjuicelayout = (LinearLayout)findViewById(R.id.beetjuicelayout);


        Food = getIntent().getIntExtra("Food", 0);

        if(Food==1){
            ImgText1.setImageResource(R.drawable.eggrice);
            Eggricelayout.setVisibility(View.VISIBLE);
        }
        if(Food==2){
            ImgText1.setImageResource(R.drawable.salad);
            Saladlayout.setVisibility(View.VISIBLE);
        }
        if(Food==3){
            ImgText1.setImageResource(R.drawable.salmonrice);
            Salmonricelayout.setVisibility(View.VISIBLE);
        }
        if(Food==4){
            ImgText1.setImageResource(R.drawable.muksha);
            Mukshalayout.setVisibility(View.VISIBLE);
        }
        if(Food==5){
            ImgText1.setImageResource(R.drawable.friedrice);
            Friedricelayout.setVisibility(View.VISIBLE);
        }
        if(Food==6){
            ImgText1.setImageResource(R.drawable.beetjuice);
            Beetjuicelayout.setVisibility(View.VISIBLE);
        }


    }
}
