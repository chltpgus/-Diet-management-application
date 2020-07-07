package com.cookandandroid.mobileprogramming_02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class Refrige1Activity extends Activity {

    int cabbage , littletomato ,  salmon , acorn , egg , tomato , kimch , tofu , broccoli , mushroom , onion , chilli , beet, carrot , rice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.refrige1);

        final CheckBox Cabbage , Littletomato ,  Salmon , Acorn , Egg , Tomato , Kimch , Tofu , Broccoli , Mushroom , Onion , Chilli , Beet , Carrot , Rice;
        Button MainBack;

        Cabbage = (CheckBox)findViewById(R.id.cabbage);
        Littletomato = (CheckBox)findViewById(R.id.littletomato);
        Salmon = (CheckBox)findViewById(R.id.salmon);
        Acorn = (CheckBox)findViewById(R.id.acorn);
        Egg = (CheckBox)findViewById(R.id.egg);
        Tomato = (CheckBox)findViewById(R.id.tomato);
        Kimch = (CheckBox)findViewById(R.id.kimch);
        Tofu = (CheckBox)findViewById(R.id.tofu);
        Broccoli = (CheckBox)findViewById(R.id.broccoli);
        Mushroom = (CheckBox)findViewById(R.id.mushroom);
        Onion = (CheckBox)findViewById(R.id.onion);
        Chilli = (CheckBox)findViewById(R.id.chilli);
        Beet = (CheckBox)findViewById(R.id.beet);
        Carrot = (CheckBox)findViewById(R.id.carrot);
        Rice = (CheckBox)findViewById(R.id.rice);


        MainBack = (Button)findViewById(R.id.MainBack);



        MainBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

            try {
                JSONObject jsonResponse = new JSONObject(response);
                boolean success = jsonResponse.getBoolean("success");

                if (Cabbage.isChecked())
                    cabbage = 1;


                if (Littletomato.isChecked())
                    littletomato = 1;


                if (Salmon.isChecked())
                    salmon = 1;


                if (Acorn.isChecked())
                    acorn = 1;


                if (Egg.isChecked())
                    egg = 1;


                if (Tomato.isChecked())
                    tomato = 1;


                if (Kimch.isChecked())
                    kimch = 1;


                if (Tofu.isChecked())
                    tofu = 1;


                if (Broccoli.isChecked())
                    broccoli = 1;


                if (Mushroom.isChecked())
                    mushroom = 1;


                if (Onion.isChecked())
                    onion = 1;


                if (Chilli.isChecked())
                    chilli = 1;

                if (Beet.isChecked())
                    beet = 1;


                if (Carrot.isChecked())
                    carrot = 1;


                if (Rice.isChecked())
                    rice = 1;


            } catch (JSONException e){
                e.printStackTrace();
            }
            }
                                    };

                RefrigeRequest refrigeRequest = new RefrigeRequest(cabbage , littletomato ,  salmon , acorn , egg , tomato , kimch , tofu , broccoli , mushroom , onion , chilli , beet , carrot , rice, responseListener);
                RequestQueue queue = Volley.newRequestQueue(Refrige1Activity.this);
                queue.add(refrigeRequest);

                startActivity(intent);

            }
        });

    }
}
