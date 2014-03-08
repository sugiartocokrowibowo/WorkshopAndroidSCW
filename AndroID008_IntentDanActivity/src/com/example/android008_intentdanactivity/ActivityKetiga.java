package com.example.android008_intentdanactivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ActivityKetiga extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ketiga);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_ketiga, menu);
		return true;
	}

}
