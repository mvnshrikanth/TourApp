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
public class MallsFragment extends Fragment {


    public MallsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(R.string.mall_buckland, R.string.add_mall_buckland));
        locations.add(new Location(R.string.mall_enfield, R.string.add_mall_enfield));
        locations.add(new Location(R.string.mall_holyoke, R.string.add_mall_holyoke));
        locations.add(new Location(R.string.mall_westfarms, R.string.add_mall_westfarms));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations, R.color.category_malls);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }

}