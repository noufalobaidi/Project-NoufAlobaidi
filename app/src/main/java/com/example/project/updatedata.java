package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class updatedata extends AppCompatActivity {
    Button bttn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
         bttn=(Button)findViewById(R.id.button);
         EditText updt_name=(EditText) findViewById(R.id.updt_name);
         EditText updt_id=(EditText) findViewById(R.id.updt_id);
         EditText updt_lastname=(EditText) findViewById(R.id.updt_lastname);
         EditText upd_email1=(EditText) findViewById(R.id.upd_email1);
         EditText upd_pn=(EditText) findViewById(R.id.upd_pn);

         bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fname=updt_name.getText()+"";
                String lname=updt_lastname.getText()+"";
                String phone=upd_pn.getText()+"";
                String email=upd_email1.getText()+"";
                String uid=updt_id.getText()+"";
                HashMap<String,Object> map=new HashMap<>();

                if (uid.isEmpty()){
                    Toast.makeText(updatedata.this,"Please fill in the UID field for this operation.",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (!fname.isEmpty()){
                    map.put("firstName",fname);
                }
                if (!lname.isEmpty()){
                    map.put("lastName",lname);
                }
                if (!phone.isEmpty()){
                    map.put("phoneNumber",phone);
                }
                if (!email.isEmpty()){
                    map.put("emailAddress",email);
                }
                if (!uid.isEmpty()){
                    map.put("userId",Integer.valueOf(uid));
                }
                update(Integer.valueOf(uid),map);
            }
        });

    }}