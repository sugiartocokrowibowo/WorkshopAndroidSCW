package com.example.android015_contexmenu;

import android.os.Bundle;
import android.app.Activity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textview	= (TextView)findViewById(R.id.textView1);
        textview.setOnCreateContextMenuListener(this);
    }
    
    @Override
	public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {		
		super.onCreateContextMenu(menu, v, menuInfo);
		MenuInflater inflater	= getMenuInflater();
		inflater.inflate(R.menu.main, menu);
	}


    @Override
	public boolean onContextItemSelected(MenuItem item) {
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
		}
		}
		return super.onContextItemSelected(item);
	} 

    
}
