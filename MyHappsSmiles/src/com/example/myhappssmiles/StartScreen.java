package com.example.myhappssmiles;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.graphics.Color;

public class StartScreen extends Activity {
	RelativeLayout rl;
	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start_screen);
		rl = (RelativeLayout)findViewById(R.id.RelativeLayout1);	
		rl.setBackgroundColor(Color.GRAY);
		tv = (TextView)findViewById(R.id.textView1);
		tv.setTextColor(Color.YELLOW);
	}
	public void startbutton(View view){
		
		Intent intent = new Intent(this, SlideShow.class);
		startActivity(intent);
		
	}


}
