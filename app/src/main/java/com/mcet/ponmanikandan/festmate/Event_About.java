package com.mcet.ponmanikandan.festmate;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Event_About extends Fragment {



    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Intent i = getActivity().getIntent();
        int position = i.getIntExtra("pos",0);

        Integer[] eventPoster = {R.drawable.sample1,R.drawable.sample2};



        View rootView = inflater.inflate(R.layout.event_about, container, false);

        ImageView imageView = (ImageView) rootView.findViewById(R.id.TitlePoster);
        imageView.setImageResource(eventPoster[position]);

        return rootView;

    }

}
