package com.cookandandroid.mobileprogramming_02;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Scanner;

public class Exercise1Activity extends Activity {

    Button btn1,btn2;
    EditText input;
    String kcal;
    Integer result;
    TextView textResult;
    RadioGroup Group1;
    RadioButton Rwalk,Rstairs,Rmount,Rswim,Ryoga,Rbox,Rroof,Rbic,Rrun,Rsquart,Rcycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise1);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        input = (EditText) findViewById(R.id.input);
        textResult = (TextView) findViewById(R.id.textResult);
        Group1 = (RadioGroup) findViewById(R.id.Group1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(btn1.isClickable()==true){
                    Group1.setVisibility(View.VISIBLE);
                    btn2.setVisibility(View.VISIBLE);

                }
                else{
                    Group1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);

                }

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Rwalk = (RadioButton) findViewById(R.id.Rwalk);
                Rstairs = (RadioButton) findViewById(R.id.Rstairs);
                Rmount = (RadioButton) findViewById(R.id.Rmount);
                Rswim = (RadioButton) findViewById(R.id.Rswim);
                Ryoga = (RadioButton) findViewById(R.id.Ryoga);
                Rbox = (RadioButton) findViewById(R.id.Rbox);
                Rroof = (RadioButton) findViewById(R.id.Rroof);
                Rbic = (RadioButton) findViewById(R.id.Rbic);
                Rrun = (RadioButton) findViewById(R.id.Rrun);
                Rsquart = (RadioButton) findViewById(R.id.Rsquart);
                Rcycle = (RadioButton) findViewById(R.id.Rcycle);

                kcal = input.getText().toString();
                result = Integer.parseInt(kcal);

                int walk= result/10*3;
                int stairsrun= result/100*16;
                int mountbic=result/100*14;
                int swim=result/100*12;
                int yoga=result/2;
                int boxroof=result/100*11;
                int squartcycle= result/100*16;

                if(btn2.isClickable()==true){
                    textResult.setVisibility(View.VISIBLE);
                }
                else{
                    textResult.setVisibility(View.INVISIBLE);
                }

                switch (Group1.getCheckedRadioButtonId()){
                    case R.id.Rwalk:
                        textResult.setText("도보 걷기" +walk+"분");
                        break;
                    case R.id.Rstairs:
                        textResult.setText("계단오르기"+stairsrun+"분");
                        break;
                    case R.id.Rswim:
                        textResult.setText("수영"+swim+"분");
                        break;
                    case R.id.Rmount:
                        textResult.setText("등산"+mountbic+"분");
                        break;
                    case R.id.Ryoga:
                        textResult.setText("요가"+yoga+"분");
                        break;
                    case R.id.Rbox:
                        textResult.setText("복싱"+boxroof+"분");
                        break;
                    case R.id.Rroof:
                        textResult.setText("줄넘기"+boxroof+"회");
                        break;
                    case R.id.Rbic:
                        textResult.setText("자전거타기"+mountbic+"분");
                        break;
                    case R.id.Rrun:
                        textResult.setText("달리기"+stairsrun+"분");
                        break;
                    case R.id.Rsquart:
                        textResult.setText("스쿼트"+squartcycle+"회");
                        break;
                    case R.id.Rcycle:
                        textResult.setText("사이클"+squartcycle+"분");
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"원하는 운동을 선택하세요",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}