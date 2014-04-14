package com.fab.bluetoothrgb;


import android.graphics.Color;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.larswerkman.colorpicker.ColorPicker.OnColorChangedListener;
import com.larswerkman.colorpicker.SVBar;

 
public class Fragment0 extends Fragment implements OnColorChangedListener {
	
	private CustomColorPicker picker;
	private SVBar svBar;
	private Button button;
	private TextView text;
	private View rootView_0;
	private View rootView_2;
	private long millis_start;
	private long millis;
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
    	millis_start = System.currentTimeMillis();
    	
 
    	rootView_0 = inflater.inflate(R.layout.fragment0, container, false);
    	rootView_2 = inflater.inflate(R.layout.fragment2, container, false);
         
    	picker = (CustomColorPicker) rootView_0.findViewById(R.id.picker);
    	svBar = (SVBar) rootView_0.findViewById(R.id.svbar);
    	button = (Button) rootView_0.findViewById(R.id.button1);
    	text = (TextView) rootView_0.findViewById(R.id.textView1);
    	

    	
    	picker.addSVBar(svBar);
    	picker.setOnColorChangedListener(this);
    	button.setOnClickListener(new OnClickListener() {
    		
    		@Override
    		public void onClick(View v) {;
    			text.setTextColor(picker.getColor());
    			text.setText(picker.getHSVstring());
    			picker.setOldCenterColor(picker.getColor());
    			((MainActivity) getActivity()).sendMessage(picker.getHSVstring());
    		}
    	});
        
        return rootView_0;
    }

	@Override
	public void onColorChanged(int color) {
		// TODO Auto-generated method stub
		millis=System.currentTimeMillis()-millis_start;
		if(millis>100)
		{
			((MainActivity) getActivity()).sendMessage(picker.getHSVstring(color));	
			millis_start=System.currentTimeMillis();
		}
		
		//((TextView) rootView_2.findViewById(R.id.editText_red)).setText(Integer.toString(Color.red(color)));
	}
}