package com.example.android024_sendreceivesms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

public class SMSReceiver extends BroadcastReceiver {	

	@Override
	public void onReceive(Context context, Intent intent) {
		
		Bundle bundle		= intent.getExtras();
		SmsMessage[]msgs	= null;
		
		String str			= "";
		if(bundle!=null){
			Object[]pdus	= (Object[])bundle.get("pdus");
			msgs			= new SmsMessage[pdus.length];
			for(int i=0;i<msgs.length;i++){
				msgs[i]		= SmsMessage.createFromPdu((byte[])pdus[i]);
				str			+= "SMS dari "+msgs[i].getOriginatingAddress()+" : ";
				str			+= msgs[i].getMessageBody().toString()+"\n";
				Toast.makeText(context,	str,Toast.LENGTH_LONG).show();
				
				Intent broadcastIntent	= new Intent();
				broadcastIntent.setAction("SMS_RECEIVED_ACTION");
				broadcastIntent.putExtra("sms",str);
				context.sendBroadcast(broadcastIntent);
				
			}
		}
		
		
		throw new UnsupportedOperationException("Not yet implemented");
	}
}
