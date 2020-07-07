package com.cookandandroid.mobileprogramming_02;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RefrigeRequest extends StringRequest {

    final static private  String URL = "http://hhjooo.cafe24.com/registerfood.php";
    private Map<String,String> parameters;

    public  RefrigeRequest(int cabbage, int littletomato, int salmon, int acorn,  int egg,int tomato, int kimch, int tofu, int broccoli,
                           int mushroom, int onion, int chilli, int beet, int carrot, int rice,
                            Response.Listener<String> listener)
    {
        super(Method.POST,URL,listener,null);
        parameters = new HashMap<>();
        parameters.put("cabbage",cabbage+"");
        parameters.put("littletomato", littletomato+"");
        parameters.put("salmon", salmon+"");
        parameters.put("acorn", acorn +"");
        parameters.put("egg", egg +"");
        parameters.put("tomato", tomato +"");
        parameters.put("kimch", kimch +"");
        parameters.put("tofu", tofu +"");
        parameters.put("broccoli", broccoli +"");
        parameters.put("mushroom", mushroom +"");
        parameters.put("onion", onion +"");
        parameters.put("chilli", chilli +"");
        parameters.put("beet", beet +"");
        parameters.put("carrot", carrot +"");
        parameters.put("rice", rice +"");


    }

    @Override

    public Map<String,String>getParams(){
        return parameters;
    }
}
