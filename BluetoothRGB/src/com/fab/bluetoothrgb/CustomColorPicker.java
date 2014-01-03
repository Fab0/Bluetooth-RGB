package com.fab.bluetoothrgb;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;

import com.larswerkman.colorpicker.ColorPicker;

public  class CustomColorPicker extends ColorPicker 
implements ColorPicker.OnColorChangedListener{

	public CustomColorPicker(Context context) {
		super(context);
	}

	public CustomColorPicker(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public CustomColorPicker(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		/*
		CustomViewPager viewPager;
		View view; 
		LayoutInflater inflater = (LayoutInflater)   getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE); 
		view = inflater.inflate(R.layout.activity_main, null);
		viewPager = (CustomViewPager) view.findViewById(R.id.pager);
		viewPager.setBlockSwipe(true);
		*/
		super.onTouchEvent(event);
		//viewPager.setBlockSwipe(false);
		return true;
	}

	@Override
	public void onColorChanged(int color) {
		// TODO Auto-generated method stub
		
	}

}
