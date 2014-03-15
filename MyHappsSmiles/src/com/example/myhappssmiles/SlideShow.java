package com.example.myhappssmiles;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;

public class SlideShow extends Activity {

	 private ViewFlipper myViewFlipper;
	   // private float initialXPoint;
	    int[] image = {R.drawable.face1,R.drawable.face2,R.drawable.face3,R.drawable.face4, R.drawable.face5, R.drawable.face6};
	    LinearLayout ll;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
      requestWindowFeature(Window.FEATURE_NO_TITLE);
      getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
          WindowManager.LayoutParams.FLAG_FULLSCREEN);
	    setContentView(R.layout.activity_slide_show);
	    ll = (LinearLayout)findViewById(R.id.linearlayout);
	    ll.setBackgroundColor(Color.GRAY);
	    myViewFlipper = (ViewFlipper) findViewById(R.id.myflipper);

	    for (int i = 0; i < image.length; i++) {
	        ImageView imageView = new ImageView(SlideShow.this);
	        imageView.setImageResource(image[i]);
	       imageView.setAdjustViewBounds(true);
	        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
	        imageView.setKeepScreenOn(true);
	        myViewFlipper.setInAnimation(this, R.anim.fade_in);
	        myViewFlipper.setOutAnimation(this, android.R.anim.fade_out);
	        myViewFlipper.addView(imageView);

	    }
	    myViewFlipper.setAutoStart(true);
	    myViewFlipper.setFlipInterval(3000);
	    myViewFlipper.startFlipping();

	
	}
}