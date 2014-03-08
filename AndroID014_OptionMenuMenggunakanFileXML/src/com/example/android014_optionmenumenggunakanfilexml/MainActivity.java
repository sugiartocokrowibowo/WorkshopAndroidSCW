package com.example.android014_optionmenumenggunakanfilexml;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    @Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		switch (item.getItemId()){
		case R.id.item1:{
			Toast.makeText(getApplicationContext(), "Anda Memilih "+item.getTitle().toString(), Toast.LENGTH_SHORT).show();
			break;
		}case R.id.item2:{
			Toast.makeText(getApplicationContext(), "Anda Memilih "+item.getTitle().toString(), Toast.LENGTH_SHORT).show();
			break;
		}case R.id.item3:{
			Toast.makeText(getApplicationContext(), "Anda Memilih "+item.getTitle().toString(), Toast.LENGTH_SHORT).show();
			break;
		}case R.id.item4:{
			Toast.makeText(getApplicationContext(), "Anda Memilih "+item.getTitle().toString(), Toast.LENGTH_SHORT).show();
			break;
		}case R.id.item5:{
			Toast.makeText(getApplicationContext(), "Anda Memilih "+item.getTitle().toString(), Toast.LENGTH_SHORT).show();
			break;
		}
		}
		return super.onMenuItemSelected(featureId, item);
	}

    
}
