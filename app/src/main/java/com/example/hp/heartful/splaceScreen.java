package com.example.hp.heartful;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class splaceScreen extends AppCompatActivity {
    private static int SplashTime=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(splaceScreen.this,home.class);
   startActivity(intent);
                finish();
            }
        }, SplashTime);
    }
}
