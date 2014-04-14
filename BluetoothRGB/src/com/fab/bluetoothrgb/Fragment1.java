package com.fab.bluetoothrgb;

import java.util.Locale;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.format.Time;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
 
public class Fragment1 extends Fragment {
 
	private Button button_fade_color;
	private Button button_const_color;
	private Button button_jump_color;
	private Button button_pulse_color;
	private Button button_set_time;
	private Button button_fade_in;
	private Button button_fade_out;
	private Button button_get_time;
	private SeekBar seekbar_speed;
	
	//private CustomColorPicker picker;
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
    	
    	//View rootView0 = inflater.inflate(R.layout.fragment0, container, false);
        View rootView = inflater.inflate(R.layout.fragment1, container, false);
        
        button_fade_color = (Button) rootView.findViewById(R.id.Button_fade);
        button_const_color = (Button) rootView.findViewById(R.id.button_hsv);
        seekbar_speed = (SeekBar) rootView.findViewById(R.id.seekBar_speed);  
        button_jump_color = (Button) rootView.findViewById(R.id.Button_jump);
        button_pulse_color = (Button) rootView.findViewById(R.id.Button_pulse);
        button_set_time = (Button) rootView.findViewById(R.id.Button_set_time);
        button_fade_in = (Button) rootView.findViewById(R.id.Button_fade_in);
        button_fade_out = (Button) rootView.findViewById(R.id.Button_fade_out);
        button_get_time = (Button) rootView.findViewById(R.id.Button_get_time);

        
        //picker = (CustomColorPicker) rootView0.findViewById(R.id.picker);
        
        button_jump_color.setOnClickListener(new OnClickListener() {
    		
    		@Override
    		public void onClick(View v) {;
    			((MainActivity) getActivity()).sendMessage("32"+'\n');
    		}
    	});
        
        button_fade_color.setOnClickListener(new OnClickListener() {
    		
    		@Override
    		public void onClick(View v) {;
    			((MainActivity) getActivity()).sendMessage("31"+'\n');
    		}
    	});
        
        button_pulse_color.setOnClickListener(new OnClickListener() {
    		
    		@Override
    		public void onClick(View v) {;
    			((MainActivity) getActivity()).sendMessage("35"+'\n');
    		}
    	});
    	
        
        button_const_color.setOnClickListener(new OnClickListener() {
    		
    		@Override
    		public void onClick(View v) {;
    			((MainActivity) getActivity()).sendMessage("30"+'\n');
    		}
    	});
    	
        button_set_time.setOnClickListener(new OnClickListener() {
    		
    		@Override
    		public void onClick(View v) {;
		    	Time today = new Time(Time.getCurrentTimezone());
		    	today.setToNow();		    	  
    			((MainActivity) getActivity()).sendMessage("50"+ String.format(Locale.GERMAN,"%02d", today.hour) + String.format(Locale.GERMAN,"%02d", today.minute) + String.format(Locale.GERMAN,"%02d", today.second)+'\n'  );
    		}
    	});
        
        button_get_time.setOnClickListener(new OnClickListener() {
    		
    		@Override
    		public void onClick(View v) {;
		    	Time today = new Time(Time.getCurrentTimezone());
		    	today.setToNow();		    	  
    			((MainActivity) getActivity()).sendMessage("53" + '\n'  );
    		}
    	});
        
        button_fade_in.setOnClickListener(new OnClickListener() {
    		
    		@Override
    		public void onClick(View v) {;
    			((MainActivity) getActivity()).sendMessage("33"+'\n');
    		}
    	});
    	
        button_fade_out.setOnClickListener(new OnClickListener() {
    		
    		@Override
    		public void onClick(View v) {;
    			((MainActivity) getActivity()).sendMessage("34"+'\n');
    		}
    	});
    	
        
        seekbar_speed.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

			@Override
			public void onProgressChanged(SeekBar arg0, int progress,boolean fromUser) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onStartTrackingTouch(SeekBar arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onStopTrackingTouch(SeekBar arg0) {
				// TODO Auto-generated method stub
				((MainActivity) getActivity()).sendMessage("4"+Integer.toString(arg0.getProgress())+'\n');
			}
    		

    	});
        return rootView;
    }
}