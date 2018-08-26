package com.mcet.ponmanikandan.festmate;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Menu_Adapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] maintitle;
    private final String[] subtitle;
    private final Integer[] imgid;

    public Menu_Adapter(Activity context, String[] maintitle, String[] subtitle, Integer[] imgid) {
        super(context, R.layout.menu_layout, maintitle);

        // TODO Auto-generated constructor stub
        this.context=context;
        this.maintitle=maintitle;
        this.subtitle=subtitle;
        this.imgid=imgid;

    }

    public View getView(final int position, View view, ViewGroup parent) {

        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.menu_layout, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.eventname);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.eventimage);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.eventdescription);

        titleText.setText(maintitle[position]);
        imageView.setImageResource(imgid[position]);
        subtitleText.setText(subtitle[position]);

        rowView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(getContext(), Event_Showcase.class);
                i.putExtra("pos", position);
                context.startActivity(i);

            }

        });

        return rowView;

    }
}