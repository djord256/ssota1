package com.example.sotta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
         ImageView msottalogo;
         Animation top;
         public static int SPLASH_SCREEN = 2500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        msottalogo = (ImageView)findViewById(R.id.sottalogo);
        msottalogo.setAnimation(top);

        top = AnimationUtils.loadAnimation(this,R.anim.top);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashoff = new Intent(MainActivity2.this,getStarted.class);
                startActivity(splashoff);
                finish();
            }
        },SPLASH_SCREEN);
    }
}