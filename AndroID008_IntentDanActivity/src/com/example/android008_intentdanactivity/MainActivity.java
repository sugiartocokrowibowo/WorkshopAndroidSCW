package com.example.android008_intentdanactivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if(keyCode==KeyEvent.KEYCODE_F2){
			this.startActivity(new Intent("android.intent.action.ACTIVITY_KEDUA"));
		}else if(keyCode==KeyEvent.KEYCODE_F3){
			this.startActivity(new Intent("android.intent.action.ACTIVITY_KETIGA"));
		}
		return super.onKeyDown(keyCode, event);
	}

    
}
