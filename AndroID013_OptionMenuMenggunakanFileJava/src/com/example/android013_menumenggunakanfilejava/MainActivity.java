package com.example.android013_menumenggunakanfilejava;

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
		menu.add("Menu 0");
		menu.add("Menu 1");
		menu.add("Menu 2");
		menu.add("Menu 3");
		menu.add("Menu 4");
		menu.add("Menu 5");
		menu.add("Menu 6");
		menu.add("Menu 7");
		return super.onCreateOptionsMenu(menu);
	}
    
	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		switch (item.getItemId()){
		case 0:{
			Toast.makeText(getApplicationContext(), "Anda Memilih "+item.getTitle().toString(), Toast.LENGTH_SHORT).show();
			break;
		}case 1:{
			Toast.makeText(getApplicationContext(), "Anda Memilih "+item.getTitle().toString(), Toast.LENGTH_SHORT).show();
			break;
		}case 2:{
			Toast.makeText(getApplicationContext(), "Anda Memilih "+item.getTitle().toString(), Toast.LENGTH_SHORT).show();
			break;
		}case 3:{
			Toast.makeText(getApplicationContext(), "Anda Memilih "+item.getTitle().toString(), Toast.LENGTH_SHORT).show();
			break;
		}case 4:{
			Toast.makeText(getApplicationContext(), "Anda Memilih "+item.getTitle().toString(), Toast.LENGTH_SHORT).show();
			break;
		}case 5:{
			Toast.makeText(getApplicationContext(), "Anda Memilih "+item.getTitle().toString(), Toast.LENGTH_SHORT).show();
			break;
		}
		}
		return super.onMenuItemSelected(featureId, item);
	}

    
    
}
