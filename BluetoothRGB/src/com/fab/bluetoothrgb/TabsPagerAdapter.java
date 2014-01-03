package com.fab.bluetoothrgb;
 
import com.fab.bluetoothrgb.Fragment0;
import com.fab.bluetoothrgb.Fragment1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
 
public class TabsPagerAdapter extends FragmentPagerAdapter {
 	
    public TabsPagerAdapter(FragmentManager fm) {
    	super(fm);
    }
 
    @Override
    public Fragment getItem(int index) {
 
        switch (index) {
        case 0:
            // Top Rated fragment activity
            return new Fragment0();
        case 1:
            // Games fragment activity
            return new Fragment1();
        }
 
        return null;
    }
 
    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 2;
    }

}