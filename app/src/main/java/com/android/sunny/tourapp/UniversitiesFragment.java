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
public class UniversitiesFragment extends Fragment {


    public UniversitiesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(R.string.university_CCSU, R.string.add_university_CCSU));
        locations.add(new Location(R.string.university_CCSU, R.string.add_university_UCONN));
        locations.add(new Location(R.string.university_yale, R.string.add_university_yale));
        locations.add(new Location(R.string.university_wesleyan, R.string.add_mall_westfarms));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations, R.color.category_universities);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }

}