package com.example.sotta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lottiepage extends AppCompatActivity {
    Button getStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottiepage);

        getStarted = (Button)findViewById(R.id.btnGetStarted);
        getStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent getstarted = new Intent(getApplicationContext(),sbuscrptionchoice.class);
                startActivity(getstarted);
            }
        });
    }
}