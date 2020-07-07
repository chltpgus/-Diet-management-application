package com.cookandandroid.mobileprogramming_02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Exercise0Activity extends Activity {

    Button btnExer1, btnExer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise);

        btnExer1 = (Button)findViewById(R.id.btnExer1);
        btnExer2 = (Button)findViewById(R.id.btnExer2);

        btnExer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Exercise1Activity.class);
                startActivity(intent);
            }
        });

        btnExer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Exercise2Activity.class);
                startActivity(intent);
            }
        });
    }
}
