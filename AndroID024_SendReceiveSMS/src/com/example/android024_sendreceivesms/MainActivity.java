package com.example.android024_sendreceivesms;

import android.os.Bundle;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	Button button1;
	EditText editText1, editText2;
	
	IntentFilter intentFilter;
	BroadcastReceiver	intentReceiver	= new BroadcastReceiver(){

		@Override
		public void onReceive(Context context, Intent intent) {
			Toast.makeText(getApplicationContext(),	intent.getExtras().getShort("sms"),Toast.LENGTH_LONG).show();			
		}
		
	};
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		intentFilter	= new IntentFilter();
		intentFilter.addAction("SMS_RECEIVED_ACTION");			
		
		editText1	= (EditText)findViewById(R.id.editText1);
		editText2	= (EditText)findViewById(R.id.editText2);
		button1	= (Button)findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener(){			

			@Override
			public void onClick(View view) {
				String notlp 	= editText1.getText().toString();
				String isisms 	= editText2.getText().toString();		
				try {
					
					SmsManager smsManager = SmsManager.getDefault();
					smsManager.sendTextMessage(notlp, null, isisms, null, null);
					Toast.makeText(getApplicationContext(), "SMS Sent!",Toast.LENGTH_LONG).show();
					
					/*
					Intent intent	= new Intent(android.content.Intent.ACTION_VIEW);
					intent.putExtra("address", notlp);
					intent.putExtra("sms_body", isisms);
					intent.setType("vnd.android-dir/mms-sms");
					startActivity(intent);
					*/
				  } catch (Exception e) {
					Toast.makeText(getApplicationContext(),	"SMS faild, please try again later!",Toast.LENGTH_LONG).show();
					e.printStackTrace();
				  }
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
