package com.example.android007_dialog;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	CharSequence[]items	= {"Android","iPhone","Buah Berry"};
	boolean[]checkedItems	= new boolean[items.length];
	
	private ProgressDialog _progressDialog;
	private int _progress	= 0;
	private Handler _progressHandler;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btn1	= (Button)findViewById(R.id.button1);
		btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				showDialog(0);
			}
		});
		
		Button btn2	= (Button)findViewById(R.id.button2);
		btn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				showDialog(1);
				_progress	= 0;
				_progressDialog.setProgress(0);
				_progressHandler.sendEmptyMessage(0);
			}
		});
		
		
		_progressHandler = new Handler(){
			public void handleMessage(Message msg){
				super.handleMessage(msg);
				if(_progress>=100){
					_progressDialog.dismiss();
				}else{
					_progress++;
					_progressDialog.incrementProgressBy(1);
					_progressHandler.sendEmptyMessageDelayed(0, 100);
				}
			}
		};
	}	
	
	@Override
	protected Dialog onCreateDialog(int id){
		switch(id){
		case 0:return new AlertDialog.Builder(this).setIcon(R.drawable.ic_launcher).setTitle("Dialog dg text sederhana")
				.setPositiveButton("OK",new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(getBaseContext(), "Ok diklick", Toast.LENGTH_SHORT).show();
						
					}
				})
				
				.setNegativeButton("Batal",new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(getBaseContext(), "Batal diklick", Toast.LENGTH_SHORT).show();
						
					}
				})
				
				.setMultiChoiceItems(items, checkedItems, new DialogInterface.OnMultiChoiceClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which, boolean isChecked) {
						Toast.makeText(getBaseContext(), items[which]+(isChecked?"dicentang!":"tidakdicentang!"), Toast.LENGTH_SHORT).show();
						
					}
				})
				.create();
		
		case 1: _progressDialog	= new ProgressDialog(this);
				_progressDialog.setIcon(R.drawable.ic_launcher);
				_progressDialog.setTitle("Proses Download data...");
				_progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
				_progressDialog.setButton(DialogInterface.BUTTON_POSITIVE , "Sembunyi",
						new DialogInterface.OnClickListener(){

							@Override
							public void onClick(DialogInterface dialog,	int which) {
								Toast.makeText(getBaseContext(), "Sembunyikan Klick", Toast.LENGTH_SHORT).show();								
							}
					
						});
					
				_progressDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Batal",
						new DialogInterface.OnClickListener(){
					
						@Override
						public void onClick(DialogInterface dialog, int whichButton){
							Toast.makeText(getBaseContext(), "Batal Klick", Toast.LENGTH_SHORT).show();
						}
					});
					
				return _progressDialog;
		}
		return null;
	}

    
}
