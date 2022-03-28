package com.example.onboardtwo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

@SuppressLint("CustomSplashScreen")
public class SplashScreen extends AppCompatActivity {
Handler handler;
SharedPreferences onBoardingScreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        handler=new Handler();
        handler.postDelayed(() -> {
            onBoardingScreen=getSharedPreferences("onBoardingScreen",MODE_PRIVATE);
            boolean isFirstTime=onBoardingScreen.getBoolean("firstTime",true);
            if(isFirstTime){
                SharedPreferences.Editor editor =onBoardingScreen.edit();
                editor.putBoolean("firstTime",false);
                editor.apply();

                Intent intent=new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);

            }else {

                Intent intent=new Intent(SplashScreen.this,UserDashboard.class);
                startActivity(intent);
            }
            finish();


        },5000);
    }
}