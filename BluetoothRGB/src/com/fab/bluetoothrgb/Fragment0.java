package com.fab.bluetoothrgb;


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
	private View rootView;
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        rootView = inflater.inflate(R.layout.fragment0, container, false);
         
    	picker = (CustomColorPicker) rootView.findViewById(R.id.picker);
    	svBar = (SVBar) rootView.findViewById(R.id.svbar);
    	button = (Button) rootView.findViewById(R.id.button1);
    	text = (TextView) rootView.findViewById(R.id.textView1);
    	

    	
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
        
        return rootView;
    }

	@Override
	public void onColorChanged(int color) {
		// TODO Auto-generated method stub
	}
}