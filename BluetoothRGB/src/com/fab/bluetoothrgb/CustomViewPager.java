package com.fab.bluetoothrgb;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class CustomViewPager extends ViewPager {

    private boolean blockSwipe = false;
    
    public CustomViewPager(Context context) {
        super(context);
    }

    public CustomViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setBlockSwipe(boolean blockSwipe) {
        this.blockSwipe = blockSwipe;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent arg0) {
        if (blockSwipe)
            return false;
        else 
            return super.onInterceptTouchEvent(arg0);
    }
   
    @Override
    public boolean onTouchEvent(MotionEvent arg0) {
        if (blockSwipe)
            return false;
        else 
            return super.onTouchEvent(arg0);
    }  
    

}
