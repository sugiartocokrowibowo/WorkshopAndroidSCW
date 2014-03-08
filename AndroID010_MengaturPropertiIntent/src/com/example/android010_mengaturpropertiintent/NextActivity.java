package com.example.android010_mengaturpropertiintent;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NextActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_next);
		String namaDefault	= "";
		Bundle extras	= getIntent().getExtras();
		if(extras!=null){
			namaDefault=extras.getString("nama");
		}

		EditText txt_username	= (EditText) findViewById(R.id.editText1);
		txt_username.setHint(namaDefault);
		
		Button btn	= (Button) findViewById(R.id.button1);
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent data = new Intent();
				EditText txt_username	= (EditText) findViewById(R.id.editText1);
				data.setData(Uri.parse(txt_username.getText().toString()));
				setResult(RESULT_OK, data);
				
				finish();				
			}
		});

	}

}
