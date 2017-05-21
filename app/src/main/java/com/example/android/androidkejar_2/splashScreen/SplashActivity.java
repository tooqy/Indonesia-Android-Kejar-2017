package com.example.android.androidkejar_2.splashScreen;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.androidkejar_2.MainActivity;
import com.example.android.androidkejar_2.R;
import com.example.android.androidkejar_2.home.HomeActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, HomeActivity.class));
                finish(); // Untuk dispose dan hilang dari display selamanya
            }
        }, 5000);
    }
}
