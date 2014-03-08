package com.example.android023_sendsms;

import android.os.Bundle;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsMessage;
import android.util.Log;
import android.widget.Toast;

public class SMSReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Bundle bundle	  	= intent.getExtras();
		SmsMessage[]msgs	= null;
		
		String str	= "cobat";
		if(bundle!=null){
			Object[]pdus	= (Object[])bundle.get("pdus");
			msgs			= new SmsMessage[pdus.length];
			
			Toast.makeText(context, str, Toast.LENGTH_LONG).show();
			Log.d("pesan masuk", str);
			
			Intent broadcastIntent	= new Intent();
			broadcastIntent.setAction("SMS_RECEIVED_ACTION");
			broadcastIntent.putExtra("sms",str);
			context.sendBroadcast(broadcastIntent);
		}
		
	}
	

}
