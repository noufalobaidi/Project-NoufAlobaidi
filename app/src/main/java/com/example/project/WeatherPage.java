package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WeatherPage extends AppCompatActivity {
    private TextView temp,city,descp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        temp=findViewById(R.id.Temp);
        city = findViewById(R.id.city);
        findweather();
    }
    public void findweather()
    {
        String url = "http://api.openweathermap.org/data/2.5/weather?q=London&appid=98d8b87892a5dad85cd5576ae1b00c70";
        JsonObjectRequest jor=new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONObject main_object = response.getJSONObject("main");
                    JSONArray array = response.getJSONArray("weather");
                    JSONObject object = array.getJSONObject(0);
                    temp.setText(String.valueOf(main_object.getDouble("temp")));
                    city.setText(response.getString("city"));
                    descp.setText(object.getString("description"));

                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        RequestQueue req = Volley.newRequestQueue(this);
        req.add(jor);

    }
}