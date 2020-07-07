package com.cookandandroid.mobileprogramming_02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class Recipe1_1Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe1_1);
        final boolean Cabbage , Littletomato ,  Salmon , Acorn , Egg , Tomato , Kimch , Tofu , Broccoli , Mushroom , Onion , Chili , Beet , Carrot , Rice;
        final Button Refresh;
        final ImageButton Eggrice, Salad, Salmonrice, Muksha, Friedrice, Beetjuice;
        final LinearLayout Layout1, Layout2, Layout3, Layout1_1, Layout1_2, Layout2_1, Layout2_2, Layout3_1,Layout3_2;

        Refresh = (Button)findViewById(R.id.refresh);

        Eggrice = (ImageButton)findViewById(R.id.eggrice);
        Salad = (ImageButton)findViewById(R.id.salad);
        Salmonrice = (ImageButton)findViewById(R.id.salmonrice);
        Muksha = (ImageButton)findViewById(R.id.muksha);
        Friedrice = (ImageButton)findViewById(R.id.friedrice);
        Beetjuice = (ImageButton)findViewById(R.id.beetjuice);

        Layout1 = (LinearLayout)findViewById(R.id.layout1);
        Layout1_1 = (LinearLayout)findViewById(R.id.layout1_1);
        Layout1_2= (LinearLayout)findViewById(R.id.layout1_2);
        Layout2= (LinearLayout)findViewById(R.id.layout2);
        Layout2_1= (LinearLayout)findViewById(R.id.layout2_1);
        Layout2_2= (LinearLayout)findViewById(R.id.layout2_2);
        Layout3= (LinearLayout)findViewById(R.id.layout3);
        Layout3_1= (LinearLayout)findViewById(R.id.layout3_1);
        Layout3_2= (LinearLayout)findViewById(R.id.layout3_2);


        Cabbage = getIntent().getBooleanExtra("Cabbage", false);
        Littletomato = getIntent().getBooleanExtra("Littletomato", false);
        Salmon = getIntent().getBooleanExtra("Salmon", false);
        Acorn = getIntent().getBooleanExtra("Acorn", false);
        Egg = getIntent().getBooleanExtra("Egg", false);
        Tomato = getIntent().getBooleanExtra("Tomato", false);
        Kimch = getIntent().getBooleanExtra("Kimch", false);
        Tofu = getIntent().getBooleanExtra("Tofu", false);
        Broccoli = getIntent().getBooleanExtra("Broccoli", false);
        Mushroom = getIntent().getBooleanExtra("Mushroom", false);
        Onion = getIntent().getBooleanExtra("Onion", false);
        Chili = getIntent().getBooleanExtra("Chili", false);
        Beet = getIntent().getBooleanExtra("Beet", false);
        Carrot = getIntent().getBooleanExtra("Carrot", false);
        Rice = getIntent().getBooleanExtra("Rice", false);


        Refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Cabbage&Egg&Rice) {
                    Layout1.setVisibility(View.VISIBLE);
                    Layout1_1.setVisibility(View.VISIBLE);
                }
                if(Cabbage&Littletomato&Onion) {
                    Layout1.setVisibility(View.VISIBLE);
                    Layout1_2.setVisibility(View.VISIBLE);
                }
                if(Salmon&Rice&Onion) {
                    Layout2.setVisibility(View.VISIBLE);
                    Layout2_1.setVisibility(View.VISIBLE);
                }
                if(Acorn&Kimch&Egg&Tomato) {
                    Layout2.setVisibility(View.VISIBLE);
                    Layout2_2.setVisibility(View.VISIBLE);
                }
                if(Tofu&Rice&Broccoli&Mushroom&Onion&Chili) {
                    Layout3.setVisibility(View.VISIBLE);
                    Layout3_1.setVisibility(View.VISIBLE);
                }
                if(Beet&Carrot) {
                    Layout3.setVisibility(View.VISIBLE);
                    Layout3_2.setVisibility(View.VISIBLE);
                }


            }
        });
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
