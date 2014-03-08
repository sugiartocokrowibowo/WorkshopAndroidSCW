package com.example.android023_sendsms;

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

	Button buttonSend;
	EditText textPhoneNo;
	EditText textSMS;
	
	IntentFilter intentFilter;
	BroadcastReceiver	intentReceiver	= new BroadcastReceiver(){

		@Override
		public void onReceive(Context context, Intent intent) {
			Toast.makeText(getApplicationContext(),	intent.getExtras().getShort("sms"),Toast.LENGTH_LONG).show();			
		}
		
	};
	
	
 
	@Override
	protected void onPause() {
		this.registerReceiver(intentReceiver, intentFilter);
		super.onPause();
	}



	@Override
	protected void onResume() {
		this.unregisterReceiver(intentReceiver);
		super.onResume();
	}



	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		intentFilter	= new IntentFilter();
		intentFilter.addAction("SMS_RECEIVED_ACTION");		
 
		buttonSend = (Button) findViewById(R.id.buttonSend);
		textPhoneNo = (EditText) findViewById(R.id.editTextPhoneNo);
		textSMS = (EditText) findViewById(R.id.editTextSMS);
 
		buttonSend.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View v) {
 
			  String phoneNo = textPhoneNo.getText().toString();
			  String sms = textSMS.getText().toString();
 
			  try {
				SmsManager smsManager = SmsManager.getDefault();
				smsManager.sendTextMessage(phoneNo, null, sms, null, null);
				Toast.makeText(getApplicationContext(), "SMS Sent!",Toast.LENGTH_LONG).show();
			  } catch (Exception e) {
				Toast.makeText(getApplicationContext(),	"SMS faild, please try again later!",Toast.LENGTH_LONG).show();
				e.printStackTrace();
			  }
 
			}
		});
	}
    
}
