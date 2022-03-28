package com.example.onboardtwo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class UserDashboard extends AppCompatActivity {
Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_dashboard);
        button=findViewById(R.id.nextActivity);
        button.setOnClickListener(v -> Openactivitytwo());
    }
    public void Openactivitytwo(){
        Intent intent=new Intent(this,login.class);
        startActivity(intent);
    }
}