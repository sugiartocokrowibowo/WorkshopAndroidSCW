package com.example.android006_notificationmanager;

import android.os.Bundle;
import android.app.Activity;
import android.app.NotificationManager;
import android.view.Menu;

public class Notifikasi extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_notification);
		NotificationManager nm	= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		nm.cancel(getIntent().getExtras().getInt("idNotifikasi"));

	}	

}
