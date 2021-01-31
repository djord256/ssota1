package com.example.sotta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    Button personalnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        personalnext = (Button)findViewById(R.id.btnpersonalDetailsNxt);
        personalnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent personalNext = new Intent(getApplicationContext(),DeliveryInfo.class);
                startActivity(personalNext);
            }
        });
    }
}