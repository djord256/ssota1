package com.example.sotta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sbuscrptionchoice extends AppCompatActivity {
    Button btnclassic;
    DrawerLayout drawerLayout;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbuscrptionchoice);
        btnclassic = (Button) findViewById(R.id.btnclassic_pre_order);
        btnclassic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),PaymentInfo.class);
                startActivity(i);
            }
        });
    }
}