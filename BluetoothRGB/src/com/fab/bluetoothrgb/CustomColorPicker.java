package com.fab.bluetoothrgb;

import java.util.Locale;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.media.ToneGenerator;
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
		float x = event.getX() - mTranslationOffset;
		float y = event.getY() - mTranslationOffset;
		CustomViewPager viewPager;
		/*
		LayoutInflater inflater = (LayoutInflater)   getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE); 
		view = inflater.inflate(R.layout.activity_main, null);
		viewPager = (CustomViewPager) view.findViewById(R.id.pager);
		viewPager.setBlockSwipe(true);
		*/
		viewPager = (CustomViewPager) ((Activity)context).findViewById(R.id.pager);
		viewPager.setBlockSwipe(true);

		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			// Check whether the user pressed on the pointer.
			float[] pointerPosition = calculatePointerPosition(mAngle);
			// Check wheter the user pressed on the center.
			if (x >= -mColorWheelRadius-mColorWheelThickness && x <= mColorWheelRadius+mColorWheelThickness
					&& y >= -mColorWheelRadius-mColorWheelThickness && y <= mColorWheelRadius+mColorWheelThickness
					&& !(x >= -mColorCenterRadius && x <= mColorCenterRadius
					&& y >= -mColorCenterRadius && y <= mColorCenterRadius)) {
				mUserIsMovingPointer = true;		
			}
			break;
		}
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
		Color color0; 
		float[] mHSV = new float[3];
		//Color.green(super.getColor());
		super.setOldCenterColor(super.getColor());
		Color.colorToHSV(super.getColor(), mHSV);		
		return '0' + String.format(Locale.GERMAN,"%03d", Math.round(mHSV[0]/360*255))  + '\n' + '1' + String.format(Locale.GERMAN,"%03d", Math.round(mHSV[1]*255)) + '\n' + '2' +  String.format(Locale.GERMAN,"%03d", Math.round(mHSV[2]*255)) + '\n'  ;	
	}
	
	/**
	 * Get the currently selected color.
	 * 
	 * @return The ARGB value of the currently selected color.
	 */
	public String getHSVstring(int color) {
		float[] mHSV = new float[3];
		mSVbar.calculateColor(color);
		Color.colorToHSV(mSVbar.getColor(), mHSV);		
		return '0' + String.format(Locale.GERMAN,"%03d", Math.round(mHSV[0]/360*255))  + '\n' + '1' + String.format(Locale.GERMAN,"%03d", Math.round(mHSV[1]*255)) + '\n' + '2' +  String.format(Locale.GERMAN,"%03d", Math.round(mHSV[2]*255)) + '\n'  ;	
	}

}
