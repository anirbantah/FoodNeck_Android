package com.example.foodneck;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class Redeem extends Activity {
	ImageView backimage;
	TextView backtext;
	TextView toptext, text1, text2, text3, text4, couponstext, bellowtext,
			kfcres, loc, locname, ice, terms, serial1, serial2, serial3,
			serial4,cost;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.redeemcoupons);

		toptext = (TextView) findViewById(R.id.toptext);

		text1 = (TextView) findViewById(R.id.text1);
		text2 = (TextView) findViewById(R.id.text2);
		text3 = (TextView) findViewById(R.id.text3);
		text4 = (TextView) findViewById(R.id.text4);
		couponstext = (TextView) findViewById(R.id.couponstext);
		bellowtext = (TextView) findViewById(R.id.bellowtext);
		kfcres = (TextView) findViewById(R.id.kfcres);
		loc = (TextView) findViewById(R.id.loc);
		locname = (TextView) findViewById(R.id.locname);

		ice = (TextView) findViewById(R.id.ice);
		terms = (TextView) findViewById(R.id.terms);
		serial1 = (TextView) findViewById(R.id.serial1);
		serial2 = (TextView) findViewById(R.id.serial2);
		serial3 = (TextView) findViewById(R.id.serial3);
		serial4 = (TextView) findViewById(R.id.serial4);
		cost=(TextView)findViewById(R.id.cost);
		Typeface font_regular = Typeface.createFromAsset(
				getApplicationContext().getAssets(), "LatoRegular.ttf");
		Typeface font_bold = Typeface.createFromAsset(getApplicationContext()
				.getAssets(), "LatoBold.ttf");
		
		toptext.setTypeface(font_bold);
		text1.setTypeface(font_bold);
		text2.setTypeface(font_bold);
		text3.setTypeface(font_bold);
		text4.setTypeface(font_bold);
		couponstext.setTypeface(font_bold);
		bellowtext.setTypeface(font_bold);
		kfcres.setTypeface(font_bold);
		loc.setTypeface(font_bold);
		locname.setTypeface(font_bold);
		ice.setTypeface(font_bold);
		terms.setTypeface(font_bold);
		cost.setTypeface(font_bold);
		serial1.setTypeface(font_bold);
		serial2.setTypeface(font_bold);
		serial3.setTypeface(font_bold);
		serial4.setTypeface(font_bold);
		
		
		backimage = (ImageView) findViewById(R.id.backimage);
		backtext = (TextView) findViewById(R.id.backtext);

		backtext.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Redeem.this, MainActivity.class);
				startActivity(i);
			}
		});

		backimage.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Redeem.this, MainActivity.class);
				startActivity(i);
			}
		});
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub

	}
}
