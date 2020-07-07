package com.cookandandroid.mobileprogramming_02;

import android.app.Activity;import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Recipe1Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe1);

        final boolean Cabbage , Littletomato ,  Salmon , Acorn , Egg , Tomato , Kimch , Tofu , Broccoli , Mushroom , Onion , Chili , Beet , Carrot , Rice;
        Button Refrigeratorrecipe, Dailyrecipe;

        Refrigeratorrecipe = (Button)findViewById(R.id.refrigeratorrecipe);
        Dailyrecipe = (Button)findViewById(R.id.dailyrecipe);

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

        Refrigeratorrecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Recipe1_1Activity.class);

                if(Cabbage)
                    intent.putExtra("Cabbage", true);
                if(Littletomato)
                    intent.putExtra("Littletomato", true);
                if(Salmon)
                    intent.putExtra("Salmon", true);
                if(Acorn)
                    intent.putExtra("Acorn", true);
                if(Egg)
                    intent.putExtra("Egg", true);
                if(Tomato)
                    intent.putExtra("Tomato", true);
                if(Kimch)
                    intent.putExtra("Kimch", true);
                if(Tofu)
                    intent.putExtra("Tofu", true);
                if(Broccoli)
                    intent.putExtra("Broccoli", true);
                if(Mushroom)
                    intent.putExtra("Mushroom", true);
                if(Onion)
                    intent.putExtra("Onion", true);
                if(Chili)
                    intent.putExtra("Chili", true);
                if(Beet)
                    intent.putExtra("Beet", true);
                if(Carrot)
                    intent.putExtra("Carrot", true);
                if(Rice)
                    intent.putExtra("Rice", true);


                startActivity(intent);
            }
        });

        Dailyrecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Recipe1_2Activity.class);
                startActivity(intent);
            }
        });



    }
}
