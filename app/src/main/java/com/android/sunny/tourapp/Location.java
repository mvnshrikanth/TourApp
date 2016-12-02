package com.android.sunny.tourapp;

/**
 * Created by Sunny on 11/29/2016.
 */

public class Location {

    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Constant value that represents no image was provided for this word
     */
    private int mLocationId;
    private int mLocationAddrsId;
    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Location(int locationId, int locationAddrsId, int imageResourceId) {
        mImageResourceId = imageResourceId;
        mLocationAddrsId = locationAddrsId;
        mLocationId = locationId;
    }

    public Location(int locationId, int locationAddrsId) {
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

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}

