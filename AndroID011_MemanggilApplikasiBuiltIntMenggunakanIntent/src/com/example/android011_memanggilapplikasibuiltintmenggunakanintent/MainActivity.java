package com.example.android011_memanggilapplikasibuiltintmenggunakanintent;

import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	int request_code	= 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button b1	= (Button) findViewById(R.id.button1);		
		b1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent	= new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
				startActivity(intent);
			}
			
		});
		
		Button b2	= (Button) findViewById(R.id.button2);
		b2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent	= new Intent(android.content.Intent.ACTION_DIAL, Uri.parse("tel:+6285255557738"));
				startActivity(intent);
			}
			
		});
		
		Button b3	= (Button) findViewById(R.id.button3);		
		b3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent	= new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:-5.134854,+119.487872"));
				startActivity(intent);
			}
			
		});
		
		Button b4	= (Button) findViewById(R.id.button4);
		b4.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent	= new Intent(android.content.Intent.ACTION_PICK);
				intent.setType(ContactsContract.Contacts.CONTENT_TYPE);
				startActivityForResult(intent, request_code);
			}
			
		});
	}
	
	public void onActivityResult(int requestCode, int resultCode, Intent data){
		if(requestCode==request_code&&resultCode==RESULT_OK){
			Toast.makeText(getBaseContext(), data.getData().toString(), Toast.LENGTH_SHORT).show();
			Intent intent	= new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(data.getData().toString()));
			startActivity(intent);
		}
	}

    
}
