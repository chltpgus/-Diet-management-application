package com.cookandandroid.mobileprogramming_02;

import android.support.v7.app.AppCompatActivity;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class LoginRequest extends StringRequest {
    final static private  String URL = "http://hhjooo.cafe24.com/Login2.php";
    private Map<String,String> parameters;

    public LoginRequest(String userID, String userPassword, Response.Listener<String> listener)
    {
        super(Method.POST,URL,listener,null);
        parameters = new HashMap<>();
        parameters.put("userID",userID);
        parameters.put("userPassword", userPassword);


    }

    @Override

    public Map<String,String>getParams()
    {
        return parameters;
    }
}
