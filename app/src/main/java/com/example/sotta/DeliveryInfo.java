package com.example.sotta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DeliveryInfo extends AppCompatActivity {
    Button mdeliveryback, mdeliverynext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_info);
        mdeliveryback = (Button)findViewById(R.id.btnbck);
        mdeliverynext = (Button)findViewById(R.id.btnnext);
        mdeliverynext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deliveryNext = new Intent(getApplicationContext(),PaymentInfo.class);
                startActivity(deliveryNext);
            }
        });

        mdeliveryback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deliveryBack = new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(deliveryBack);
            }
        });
    }
}