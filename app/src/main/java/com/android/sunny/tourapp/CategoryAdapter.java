package com.android.sunny.tourapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MallsFragment();
        } else if (position == 1) {
            return new MuseumsFragment();
        } else if (position == 2) {
            return new NationalParksFragment();
        } else {
            return new UniversitiesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_malls);
        } else if (position == 1) {
            return mContext.getString(R.string.category_museums);
        } else if (position == 2) {
            return mContext.getString(R.string.category_nationalparks);
        } else {
            return mContext.getString(R.string.category_universities);
        }
    }
}
