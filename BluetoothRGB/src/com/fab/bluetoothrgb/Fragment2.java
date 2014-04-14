package com.fab.bluetoothrgb;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
 


public class Fragment2 extends Fragment {
	
	private VerticalSeekBar seekbar_red;
	private VerticalSeekBar seekbar_green;
	private VerticalSeekBar seekbar_blue;
	private EditText editText_red;
	private EditText editText_green;
	private EditText editText_blue;
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
    	
        View rootView = inflater.inflate(R.layout.fragment2, container, false);
        
        seekbar_red=(VerticalSeekBar) rootView.findViewById(R.id.verticalSeekBar_red);
        seekbar_green=(VerticalSeekBar) rootView.findViewById(R.id.verticalSeekBar_green);
        seekbar_blue=(VerticalSeekBar) rootView.findViewById(R.id.verticalSeekBar_blue);
        
        editText_red=(EditText) rootView.findViewById(R.id.editText_red);
        editText_green=(EditText) rootView.findViewById(R.id.editText_green);
        editText_blue=(EditText) rootView.findViewById(R.id.editText_blue);
        
        seekbar_red.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

			@Override
			public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
				// TODO Auto-generated method stub
				editText_red.setText(Integer.toString(arg1));
			}

			@Override
			public void onStartTrackingTouch(SeekBar arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onStopTrackingTouch(SeekBar arg0) {
				// TODO Auto-generated method stub
				
			}
    	
        });

        seekbar_green.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

			@Override
			public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
				// TODO Auto-generated method stub
				editText_green.setText(Integer.toString(arg1));
			}

			@Override
			public void onStartTrackingTouch(SeekBar arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onStopTrackingTouch(SeekBar arg0) {
				// TODO Auto-generated method stub
				
			}
    	
        });
        
        seekbar_blue.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

			@Override
			public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
				// TODO Auto-generated method stub
				editText_blue.setText(Integer.toString(arg1));
			}

			@Override
			public void onStartTrackingTouch(SeekBar arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onStopTrackingTouch(SeekBar arg0) {
				// TODO Auto-generated method stub
				
			}
    	
        });
        return rootView;
        
    }
    
}