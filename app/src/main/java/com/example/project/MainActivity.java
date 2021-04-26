package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button addbttn,deletebttn,updatebttn,viewbttn,weather;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            addbttn = (Button)findViewById(R.id.Add);
        deletebttn = (Button)findViewById(R.id.Delete);
        updatebttn = (Button)findViewById(R.id.Update);
        viewbttn = (Button)findViewById(R.id.view);
         weather = (Button) findViewById(R.id.WeatherPage);
        addbttn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intt = new Intent(MainActivity.this, Activity2.class);
                    startActivity(intt);
                }
            });
        weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, WeatherPage.class));
            }
        });
        deletebttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DeletePage.class));

            }
        });
        updatebttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, updatedata.class));

            }
        });
    }

}






