package com.example.android002_simpleactivity;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	String tag	= "Event";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(tag, "Dalam Event onCreate()");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d(tag, "Dalam Event onDestroy()");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.d(tag, "Dalam Event onPause()");
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d(tag, "Dalam Event onRestart()");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.d(tag, "Dalam Event onResume()");
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.d(tag, "Dalam Event onStart()");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.d(tag, "Dalam Event onStop()");
	}
    
}
