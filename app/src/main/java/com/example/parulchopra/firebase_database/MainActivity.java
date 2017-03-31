package com.example.parulchopra.firebase_database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {
Button B1;
    private Firebase mref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(this);
        mref = new Firebase("https://fir-database-63fdc.firebaseio.com/");

     B1 = (Button)findViewById(R.id.B1);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Firebase child = mref.child("NAME");
                child.setValue("parul");
            }
        });

    }
}
