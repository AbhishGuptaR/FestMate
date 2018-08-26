package com.mcet.ponmanikandan.festmate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Menu_Screen extends AppCompatActivity {

    Menu_Adapter Menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_screen);

        ListView eventList = (ListView) findViewById(R.id.eventList);

        String[] eventNames= {"Uddeshah","Varnam"};

        String[] eventDescription = {"Learn! Innovate! Compete!","Dance! Music! Colors!"};

        Integer[] eventPoster = {R.drawable.sample1,R.drawable.sample2};

        Menu = new Menu_Adapter(Menu_Screen.this,eventNames,eventDescription,eventPoster);

        eventList.setAdapter(Menu);


    }
}
