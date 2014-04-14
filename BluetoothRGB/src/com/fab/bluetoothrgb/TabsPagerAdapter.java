package com.fab.bluetoothrgb;
 
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
 

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
        case 2:
            // Games fragment activity
            return new Fragment2();
        }
 
        return null;
    }
 
    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }

}