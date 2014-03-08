package com.example.android016_iconmenu;

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
    public boolean onOptionsItemSelected(MenuItem item)
    {
         
        switch (item.getItemId())
        {
        case R.id.menu_bookmark:
            // Single menu item is selected do something
            // Ex: launching new activity/screen or show alert message
            Toast.makeText(getApplicationContext(), "Bookmark is Selected", Toast.LENGTH_SHORT).show();
            return true;
 
        case R.id.menu_save:
            Toast.makeText(getApplicationContext(), "Save is Selected", Toast.LENGTH_SHORT).show();
            return true;
 
        case R.id.menu_search:
            Toast.makeText(getApplicationContext(), "Search is Selected", Toast.LENGTH_SHORT).show();
            return true;
 
        case R.id.menu_share:
            Toast.makeText(getApplicationContext(), "Share is Selected", Toast.LENGTH_SHORT).show();
            return true;
 
        case R.id.menu_delete:
            Toast.makeText(getApplicationContext(), "Delete is Selected", Toast.LENGTH_SHORT).show();
            return true;
 
        case R.id.menu_preferences:
            Toast.makeText(getApplicationContext(), "Preferences is Selected", Toast.LENGTH_SHORT).show();
            return true;
 
        default:
            return super.onOptionsItemSelected(item);
        }
    }
    
}
