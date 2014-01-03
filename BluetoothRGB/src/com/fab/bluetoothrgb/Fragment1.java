package com.fab.bluetoothrgb;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
 
public class Fragment1 extends Fragment {
 
	private Button button_fade_color;
	private Button button_const_color;
	private CustomColorPicker picker;
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
    	
    	View rootView0 = inflater.inflate(R.layout.fragment0, container, false);
        View rootView = inflater.inflate(R.layout.fragment1, container, false);
        
        button_fade_color = (Button) rootView.findViewById(R.id.button_fade);
        button_const_color = (Button) rootView.findViewById(R.id.button_hsv);
        
        picker = (CustomColorPicker) rootView0.findViewById(R.id.picker);
        
        button_fade_color.setOnClickListener(new OnClickListener() {
    		
    		@Override
    		public void onClick(View v) {;
    			((MainActivity) getActivity()).sendMessage("11");
    		}
    	});
    	
        button_const_color.setOnClickListener(new OnClickListener() {
    		
    		@Override
    		public void onClick(View v) {;
    			((MainActivity) getActivity()).sendMessage("10");
    		}
    	});
        return rootView;
    }
}