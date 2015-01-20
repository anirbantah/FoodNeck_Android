package com.example.foodneck;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class Cards extends Activity {
	ViewPager pager;
	public static int MAX_VIEWS = 4;
	ImageView backimage;
	TextView backtext, all, review, photo, discussion, shortby;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.cards);
		all = (TextView) findViewById(R.id.all);
		review = (TextView) findViewById(R.id.review);
		photo = (TextView) findViewById(R.id.photo);
		discussion = (TextView) findViewById(R.id.discussion);
		shortby = (TextView) findViewById(R.id.shortby);

		Typeface font_regular = Typeface.createFromAsset(
				getApplicationContext().getAssets(), "LatoRegular.ttf");
		Typeface font_bold = Typeface.createFromAsset(getApplicationContext()
				.getAssets(), "LatoBold.ttf");
		all.setTypeface(font_regular);
		review.setTypeface(font_regular);
		photo.setTypeface(font_regular);
		shortby.setTypeface(font_bold);
		discussion.setTypeface(font_regular);
		pager = (ViewPager) findViewById(R.id.pager);
		pager.setAdapter(new WalkthroughPagerAdapter());
		backimage = (ImageView) findViewById(R.id.backimage);
		backtext = (TextView) findViewById(R.id.backtext);

		backtext.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Cards.this, MainActivity.class);
				startActivity(i);
			}
		});

		backimage.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Cards.this, MainActivity.class);
				startActivity(i);
			}
		});

	}

	class WalkthroughPagerAdapter extends PagerAdapter {

		@Override
		public int getCount() {
			return MAX_VIEWS;
		}

		@Override
		public boolean isViewFromObject(View view, Object object) {
			return view == (View) object;
		}

		@SuppressWarnings("deprecation")
		@Override
		public Object instantiateItem(View container, int position) {
			Log.e("walkthrough", "instantiateItem(" + position + ");");

			LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View imageViewContainer = inflater
					.inflate(R.layout.cards_row, null);
			Typeface font_regular = Typeface.createFromAsset(
					getApplicationContext().getAssets(), "LatoRegular.ttf");
			Typeface font_bold = Typeface.createFromAsset(
					getApplicationContext().getAssets(), "LatoBold.ttf");
			TextView kfcres = (TextView)imageViewContainer. findViewById(R.id.kfcres);
			TextView location = (TextView) imageViewContainer.findViewById(R.id.location);

			TextView test = (TextView)imageViewContainer. findViewById(R.id.test);

			TextView service = (TextView)imageViewContainer. findViewById(R.id.service);

			TextView presentation = (TextView) imageViewContainer.findViewById(R.id.presentation);

			TextView atmos = (TextView)imageViewContainer. findViewById(R.id.atmos);
			TextView des = (TextView)imageViewContainer. findViewById(R.id.des);

			des.setTypeface(font_regular);
			test.setTypeface(font_regular);
			service.setTypeface(font_regular);
			presentation.setTypeface(font_regular);
			atmos.setTypeface(font_regular);

			kfcres.setTypeface(font_regular);
			location.setTypeface(font_regular);
			((ViewPager) container).addView(imageViewContainer);
			return imageViewContainer;
		}

		@Override
		public void destroyItem(ViewGroup container, int position, Object object) {
			((ViewPager) container).removeView((View) object);
		}
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub

	}

}
