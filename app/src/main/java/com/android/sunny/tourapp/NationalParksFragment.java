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
public class NationalParksFragment extends Fragment {


    public NationalParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(R.string.npark_cockaponset, R.string.add_npark_cockaponset));
        locations.add(new Location(R.string.npark_enders, R.string.add_npark_enders));
        locations.add(new Location(R.string.npark_pachaug, R.string.add_npark_pachaug));
        locations.add(new Location(R.string.npark_topsmead, R.string.add_npark_topsmead));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations, R.color.category_nationalparks);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        return rootView;

    }

}