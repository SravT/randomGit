package com.example.myhappsgratitude;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class SavedGratitude extends Activity {

	TextView tv1;
	TextView tv2;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent intent = getIntent();
		SharedPreferences grats = getSharedPreferences("grats", MODE_APPEND);
		Editor edit = grats.edit();
		setContentView(R.layout.activity_saved_gratitude);
		tv1 = (TextView)findViewById(R.id.Grat_ID);
		tv1.setText(R.string.GratitudeString);
		tv1.setText(40);
		tv2 = (TextView)findViewById(R.id.TEXT_STATUS_ID);
		String message = intent.getStringExtra(Gratitude.EXTRA_MESSAGE);
		edit.putString("message",message);
		edit.commit();
		tv2.setText(message);

		
		// Show the Up button in the action bar.
		setupActionBar();
	}
	
	/*protected void onStop(){
		super.onStop();
		
	}*/
	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.saved_gratitude, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
