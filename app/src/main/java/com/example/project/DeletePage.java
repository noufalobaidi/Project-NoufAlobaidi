package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DeletePage extends AppCompatActivity {
    private EditText userid;
    private Button bttn;
    private DatabaseReference dbr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        userid = findViewById(R.id.del_txt);
        bttn  = findViewById(R.id.del_but);
        dbr = FirebaseDatabase.getInstance().getReference().child("users");
        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dbr.getRoot().getKey() == userid.getText().toString())
                {
                    Toast.makeText(DeletePage.this, "Successfully Deleted", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}