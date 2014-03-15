package com.example.testapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;


	public class StartSceen extends Activity {
		RelativeLayout rl;
		TextView tv;
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_start_sceen);
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