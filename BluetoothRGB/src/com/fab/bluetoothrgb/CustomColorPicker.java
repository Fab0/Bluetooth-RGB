package com.fab.bluetoothrgb;

import java.util.Locale;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.larswerkman.colorpicker.ColorPicker;

public  class CustomColorPicker extends ColorPicker 
implements ColorPicker.OnColorChangedListener{
	
    private Context context;

	public CustomColorPicker(Context context) {
		super(context);
        this.context=context;
	}

	public CustomColorPicker(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.context=context;
	}

	public CustomColorPicker(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		this.context=context;
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
	
		CustomViewPager viewPager;
		/*
		LayoutInflater inflater = (LayoutInflater)   getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE); 
		view = inflater.inflate(R.layout.activity_main, null);
		viewPager = (CustomViewPager) view.findViewById(R.id.pager);
		viewPager.setBlockSwipe(true);
		*/
		viewPager = (CustomViewPager) ((Activity)context).findViewById(R.id.pager);
		viewPager.setBlockSwipe(true);
		super.onTouchEvent(event);

		return true;
	}

	@Override
	public void onColorChanged(int color) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Get the currently selected color.
	 * 
	 * @return The ARGB value of the currently selected color.
	 */
	public String getHSVstring() {
		float[] mHSV = new float[3];
		Color.colorToHSV(super.getColor(), mHSV);
		return '0' + String.format(Locale.GERMAN,"%03d", Math.round(mHSV[0]/360*255)) + String.format(Locale.GERMAN,"%03d", Math.round(mHSV[1]*255))+ String.format(Locale.GERMAN,"%03d", Math.round(mHSV[2]*255)) + '\n'  ;	
	}

}
