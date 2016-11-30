package com.android.sunny.tourapp;

/**
 * Created by Sunny on 11/29/2016.
 */

public class Location {

    private int mLocationId;

    private int mLocationAddrsId;

    private int mImageResourceId;

    public void word(int locationId, int locationAddrsId, int imageResourceId) {
        mImageResourceId = imageResourceId;
        mLocationAddrsId = locationAddrsId;
        mLocationId = locationId;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public int getmLocationId() {
        return mLocationId;
    }

    public int getmLocationAddrsId() {
        return mLocationAddrsId;
    }

}

