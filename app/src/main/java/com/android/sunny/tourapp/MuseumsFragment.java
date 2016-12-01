package com.android.sunny.tourapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(R.string.museum_bush_holley, R.string.add_museum_bush_holley));
        locations.add(new Location(R.string.museum_glass_house, R.string.add_museum_glass_house));
        locations.add(new Location(R.string.museum_mark_twain, R.string.add_museum_mark_twain));
        locations.add(new Location(R.string.museum_old_state, R.string.add_museum_old_state_house));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations, R.color.category_museum);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }

}