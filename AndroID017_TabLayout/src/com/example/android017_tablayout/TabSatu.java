package com.example.android017_tablayout;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TabSatu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tab_satu);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tab_satu, menu);
		return true;
	}

}