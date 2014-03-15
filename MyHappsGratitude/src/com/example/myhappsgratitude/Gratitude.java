package com.example.myhappsgratitude;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Gratitude extends Activity {
	public final static String EXTRA_MESSAGE = "com.example.myhappsgratitude.MESSAGE";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gratitude);
		// Show the Up button in the action bar.
		setupActionBar();
	}
	
	public void savebutton(View view){
		EditText editText = (EditText)findViewById(R.id.edit_content);
		String message = editText.getText().toString();
		Intent intent = new Intent(this, SavedGratitude.class);
		intent.putExtra(EXTRA_MESSAGE, message);
		startActivity(intent);
	}
	

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}




}
