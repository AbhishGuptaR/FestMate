package com.mcet.ponmanikandan.festmate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuAdapter;

import java.util.Timer;
import java.util.TimerTask;

public class Splash_Screen extends AppCompatActivity {

    Timer Time;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        // This is to Hide the Title Name
        getSupportActionBar().hide();

        // This is to Set The Action Bar Color
        //Actionbar_Color.darkenStatusBar(this, R.color.colorStart);

        // This is to create a Start Screen
        Time = new Timer();
        Time.schedule(new TimerTask() {
            @Override
            public void run() {

                Intent intent = new Intent(Splash_Screen.this, LoginActivity.class);
                startActivity(intent);
                finish();

            }
        }, 3000);




    }
}
