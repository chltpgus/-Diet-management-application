package com.cookandandroid.mobileprogramming_02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends Activity {

    Button btnRecipe,btnRefrige,btnCalendar,btnExercise;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        final boolean Cabbage , Littletomato ,  Salmon , Acorn , Egg , Tomato , Kimch , Tofu , Broccoli , Mushroom , Onion , Chili , Beet , Carrot , Rice;

        btnRecipe = findViewById(R.id.btnRecipe);
        btnCalendar = findViewById(R.id.btnCalendar);
        btnRefrige = findViewById(R.id.btnRefrige);
        btnExercise = findViewById(R.id.btnExercise);

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


        btnRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Recipe1Activity.class);

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

        btnCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Calendar1Activity.class);
                startActivity(intent);
            }
        });

        btnRefrige.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Refrige1Activity.class);

                if(Cabbage)
                    intent.putExtra("cabbage", true);
                if(Littletomato)
                    intent.putExtra("littletomato", true);
                if(Salmon)
                    intent.putExtra("salmon", true);
                if(Acorn)
                    intent.putExtra("acorn", true);
                if(Egg)
                    intent.putExtra("egg", true);
                if(Tomato)
                    intent.putExtra("tomato", true);
                if(Kimch)
                    intent.putExtra("kimch", true);
                if(Tofu)
                    intent.putExtra("tofu", true);
                if(Broccoli)
                    intent.putExtra("broccoli", true);
                if(Mushroom)
                    intent.putExtra("mushroom", true);
                if(Onion)
                    intent.putExtra("onion", true);
                if(Chili)
                    intent.putExtra("chili", true);
                if(Beet)
                    intent.putExtra("beet", true);
                if(Carrot)
                    intent.putExtra("carrot", true);
                if(Rice)
                    intent.putExtra("rice", true);

                startActivity(intent);

            }
        });
        btnExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Exercise0Activity.class);
                startActivity(intent);
            }
        });
    }
}
