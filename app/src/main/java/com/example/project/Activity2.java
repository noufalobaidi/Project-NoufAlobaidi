package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Activity2 extends AppCompatActivity {
    private EditText userid, firstname, lastname, emailA, phoneN;
    private Button b;
   private DatabaseReference dref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_activiy);
        userid = findViewById(R.id.add_userid);
        firstname = findViewById(R.id.add_fname);
        lastname = findViewById(R.id.add_lname);
        emailA = (EditText) findViewById(R.id.add_email);
        phoneN = (EditText) findViewById(R.id.add_ph);
        b =  findViewById(R.id.confirm_add);
        dref = FirebaseDatabase.getInstance().getReference().child("users");
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity2.this, "Success", Toast.LENGTH_LONG).show();

               int usid = Integer.parseInt(userid.getText().toString().trim());
               UserPage us = new UserPage(emailA.getText().toString().trim(),firstname.getText().toString().trim(),lastname.getText().toString().trim(),phoneN.getText().toString().trim(),usid);
              dref.push().setValue(us);
           Toast.makeText(Activity2.this,"Success",Toast.LENGTH_LONG).show();

            }
        });
    }
}