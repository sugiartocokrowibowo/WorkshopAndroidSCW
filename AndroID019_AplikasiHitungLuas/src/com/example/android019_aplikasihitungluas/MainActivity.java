package com.example.android019_aplikasihitungluas;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	EditText editText1, editText2, editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        editText1	= (EditText)findViewById(R.id.editText1);
        editText2	= (EditText)findViewById(R.id.editText2);
        editText3	= (EditText)findViewById(R.id.editText3);
        
        Button	button1		= (Button)findViewById(R.id.button1);
        
        button1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				double p	= Double.parseDouble(editText1.getText().toString().trim());
				double l	= Double.parseDouble(editText2.getText().toString().trim());
				double L	= p*l;
				editText3.setText(String.valueOf(L));
				
			}        	
        });
        
    }    
    
}
