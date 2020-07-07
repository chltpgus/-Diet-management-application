package com.cookandandroid.mobileprogramming_02;


import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


public class RegisterRequest extends StringRequest {

    final static private  String URL = "http://hhjooo.cafe24.com/Register2.php";
    private Map<String,String> parameters;

    public  RegisterRequest(String userID, String userPassword, String userName, int userWeight, int userKalo,
                            Response.Listener<String> listener)
    {
        super(Method.POST,URL,listener,null);
        parameters = new HashMap<>();
        parameters.put("userID",userID);
        parameters.put("userPassword", userPassword);
        parameters.put("userName", userName);
        parameters.put("userWeight", userWeight +"");
        parameters.put("userKalo", userKalo +"");

    }

    @Override

    public Map<String,String>getParams(){
        return parameters;
    }
}
