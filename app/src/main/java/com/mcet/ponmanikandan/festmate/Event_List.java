package com.mcet.ponmanikandan.festmate;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Event_List extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.event_list, container, false);

        String[] listitems = {"Event 1","Event 2","Event 3","Event 4","Event 5","Event 6"};

        ListView list = (ListView) view.findViewById(R.id.listView);


        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(

                getActivity(), android.R.layout.simple_expandable_list_item_1
                ,listitems

        );

        list.setAdapter(listAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getContext(),"Register Below!",Toast.LENGTH_LONG).show();
            }

        });

        return view;

    }


}
