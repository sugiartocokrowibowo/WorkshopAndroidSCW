package com.example.android020_texttospeech;

import java.util.Locale;

import android.os.Bundle;
import android.app.Activity;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnInitListener {
	
	EditText editText;
	TextToSpeech texttospeech;
	Button	button1;
	Button	button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText	= (EditText)findViewById(R.id.editText1);
        texttospeech= new TextToSpeech(this, this);
        
        button1		= (Button)findViewById(R.id.button1);
        button2		= (Button)findViewById(R.id.button2);
        
        button1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				sayIt();
				
			}
        	
        });
        
        button2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				editText.setText("");
				
			}
        	
        });
        
    }
    
    private void sayIt() {

        String text = editText.getText().toString();
        if (text.equals("")){
     	   Toast.makeText(MainActivity.this, "Please Type Text First !", Toast.LENGTH_SHORT).show();
        }else{
     	   texttospeech.speak(text, TextToSpeech.QUEUE_FLUSH, null);
        }
    }

	@Override
	public void onInit(int status) {
		if (status == TextToSpeech.SUCCESS) {

	           int result = texttospeech.setLanguage(Locale.CHINESE);

	           if (result == TextToSpeech.LANG_MISSING_DATA
	                   || result == TextToSpeech.LANG_NOT_SUPPORTED) {
	               Log.e("TTS", "This Language is not supported");
	           } else {
	        	   button1.setEnabled(true);
	             //  speakOut();
	           }

	       } else {
	           Log.e("TTS", "Initilization Failed!");
	       }		
	}
	
	@Override
	   public void onDestroy() {	      
	       if (texttospeech != null) {
	           texttospeech.stop();
	           texttospeech.shutdown();
	       }
	       super.onDestroy();
	   }
    
}
