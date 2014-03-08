package com.example.android_terimasms;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.Menu;

public class MainActivity extends Activity {
	
	IntentFilter intentFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent	= new Intent(this, SMSReceiver.class);
        startActivity(intent);
    }   
    
}
