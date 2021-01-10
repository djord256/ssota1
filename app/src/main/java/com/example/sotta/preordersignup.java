package com.example.sotta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class preordersignup extends AppCompatActivity {
  Button personalnext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preordersignup);
        personalnext = (Button) findViewById(R.id.btnpersonalDetailsNxt);
        Intent go = new Intent(preordersignup.this,DeliveryInfo.class);
        startActivity(go);
    }
}