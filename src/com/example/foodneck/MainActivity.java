package com.example.foodneck;

import org.w3c.dom.Text;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.navdrawer.SimpleSideDrawer;

public class MainActivity extends FragmentActivity {
	public static ImageView image1, image2, image3;
	ImageView peopleicon, homeicon, placesicon;

	LayoutInflater inflater;
	TextView hometext, placetext, peopletext;
	LinearLayout mycoupons, bookmark, recent_lin, editlin, rateus_lin,aboutus,resturanrt,signout_lin;
	ImageView leftmenu;
	RelativeLayout people, home, place;
	private DrawerLayout mDrawerLayout;
	View mCustomView;

	ActionBar mActionBar;
	boolean forction = false;
	TextView bookmarktext, name, username, recent, mycoptext, edittext,
			signout, rateus, sendfeedback, addres, about;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		/*
		 * requestWindowFeature(Window.FEATURE_NO_TITLE);
		 * getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
		 * WindowManager.LayoutParams.FLAG_FULLSCREEN);
		 */

		getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
		setContentView(R.layout.activity_main);
		rateus_lin = (LinearLayout) findViewById(R.id.rateus_lin);

		recent_lin = (LinearLayout) findViewById(R.id.recent_lin);
		editlin = (LinearLayout) findViewById(R.id.editlin);
		recent_lin.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, Redeem.class);
				startActivity(i);
			}
		});
		rateus_lin.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, Resturantlist.class);
				startActivity(i);

			}
		});
		editlin.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, Cards.class);
				startActivity(i);
			}
		});
		sendfeedback = (TextView) findViewById(R.id.sendfeedback);
		bookmarktext = (TextView) findViewById(R.id.bookmarktext);
		recent = (TextView) findViewById(R.id.recent);
		mycoptext = (TextView) findViewById(R.id.mycoptext);
		edittext = (TextView) findViewById(R.id.edittext);
		signout = (TextView) findViewById(R.id.signout);
		rateus = (TextView) findViewById(R.id.rateus);
		addres = (TextView) findViewById(R.id.addres);
		about = (TextView) findViewById(R.id.about);
		name = (TextView) findViewById(R.id.name);
		username = (TextView) findViewById(R.id.username);
		Typeface font_regular = Typeface.createFromAsset(
				getApplicationContext().getAssets(), "LatoRegular.ttf");
		Typeface font_bold = Typeface.createFromAsset(getApplicationContext()
				.getAssets(), "LatoBold.ttf");

		name.setTypeface(font_bold);
		bookmarktext.setTypeface(font_bold);
		recent.setTypeface(font_bold);
		mycoptext.setTypeface(font_bold);
		edittext.setTypeface(font_bold);
		signout.setTypeface(font_bold);
		rateus.setTypeface(font_bold);
		addres.setTypeface(font_bold);
		about.setTypeface(font_bold);
		sendfeedback.setTypeface(font_bold);

		username.setTypeface(font_bold);

		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		hometext = (TextView) findViewById(R.id.hometext);
		placetext = (TextView) findViewById(R.id.placetext);
		peopletext = (TextView) findViewById(R.id.peopletext);
		/*
		 * image1 = (ImageView) findViewById(R.id.image1); image2 = (ImageView)
		 * findViewById(R.id.image2); image3 = (ImageView)
		 * findViewById(R.id.image3);
		 */
		leftmenu = (ImageView) findViewById(R.id.leftmenu);
		image1 = (ImageView) findViewById(R.id.image1);
		image2 = (ImageView) findViewById(R.id.image2);
		image3 = (ImageView) findViewById(R.id.image3);
		people = (RelativeLayout) findViewById(R.id.people);
		home = (RelativeLayout) findViewById(R.id.home);
		place = (RelativeLayout) findViewById(R.id.places);
		peopleicon = (ImageView) findViewById(R.id.peopleicon);
		homeicon = (ImageView) findViewById(R.id.homeicon);
		placesicon = (ImageView) findViewById(R.id.placesicon);

		mActionBar = getActionBar();

		LayoutInflater mInflater = LayoutInflater.from(this);

		mCustomView = mInflater.inflate(R.layout.main_actionbar, null);
		ImageView imageButton = (ImageView) mCustomView
				.findViewById(R.id.leftmenu);
		mycoupons = (LinearLayout) findViewById(R.id.mycoupons);
		bookmark = (LinearLayout) findViewById(R.id.bookmark);
		signout_lin=(LinearLayout)findViewById(R.id.signout_lin);
		
		signout_lin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, FilterActivity.class);
				startActivity(i);
			}
		});
		bookmark.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, MenuActivity.class);
				startActivity(i);
			}
		});
		
		TextView newres=(TextView)findViewById(R.id.newres);
		newres.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, NewRestaurent.class);
				startActivity(i);
			}
		});
		
		TextView usercards=(TextView)findViewById(R.id.usercards);
		newres.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, UserCards.class);
				startActivity(i);
			}
		});
		
		TextView trendingpost=(TextView)findViewById(R.id.trendingpost);
		trendingpost.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, Trandingpost.class);
				startActivity(i);
			}
		});
		TextView review=(TextView)findViewById(R.id.review);
		review.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, MenuActivity.class);
				startActivity(i);
			}
		});
		mycoupons.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, Coupons.class);
				startActivity(i);
			}
		});
		imageButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View view) {

				if (forction == false) {
					forction = true;
					mDrawerLayout.openDrawer(Gravity.START);

				} else {
					forction = false;
					mDrawerLayout.closeDrawers();
				}

			}
		});
		mActionBar.setDisplayShowHomeEnabled(false);
		mActionBar.setDisplayShowTitleEnabled(false);
		mActionBar.setCustomView(mCustomView);
		mActionBar.setDisplayShowCustomEnabled(true);

		people.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				peopletext.setTextColor(Color.parseColor("#000000"));
				hometext.setTextColor(Color.parseColor("#989898"));
				placetext.setTextColor(Color.parseColor("#989898"));
				peopleicon.setBackground(getResources().getDrawable(
						R.drawable.people1));
				homeicon.setBackground(getResources().getDrawable(
						R.drawable.home1));
				placesicon.setBackground(getResources().getDrawable(
						R.drawable.place1));
				image2.setVisibility(View.INVISIBLE);
				image1.setVisibility(View.VISIBLE);
				image3.setVisibility(View.INVISIBLE);
				
				
				
				
				FragmentTransaction fragmentTransaction;
				FragmentManager fragmentManager = getSupportFragmentManager();
				fragmentTransaction = fragmentManager.beginTransaction();
				HomeFragmentpeople ls_fragment = new HomeFragmentpeople();

				fragmentTransaction.replace(R.id.fragmentcontainer, ls_fragment);
				fragmentTransaction.commit();

				
				
				
				
			}
		});
		home.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				peopletext.setTextColor(Color.parseColor("#989898"));
				hometext.setTextColor(Color.parseColor("#000000"));
				placetext.setTextColor(Color.parseColor("#989898"));
				peopleicon.setBackground(getResources().getDrawable(
						R.drawable.people));
				homeicon.setBackground(getResources().getDrawable(
						R.drawable.home));
				placesicon.setBackground(getResources().getDrawable(
						R.drawable.place));
				image2.setVisibility(View.VISIBLE);
				image1.setVisibility(View.INVISIBLE);
				image3.setVisibility(View.INVISIBLE);
				
				FragmentTransaction fragmentTransaction;
				FragmentManager fragmentManager = getSupportFragmentManager();
				fragmentTransaction = fragmentManager.beginTransaction();
				HomeFragment ls_fragment = new HomeFragment();

				fragmentTransaction.replace(R.id.fragmentcontainer, ls_fragment);
				fragmentTransaction.commit();

			}
		});
		resturanrt=(LinearLayout)findViewById(R.id.resturanrt);
		resturanrt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, TradingTags.class);
				startActivity(i);
			}
		});
		aboutus=(LinearLayout)findViewById(R.id.aboutus);
		aboutus.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, EditProfile.class);
				startActivity(i);
			}
		});
		place.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				peopletext.setTextColor(Color.parseColor("#989898"));
				hometext.setTextColor(Color.parseColor("#989898"));
				placetext.setTextColor(Color.parseColor("#000000"));
				peopleicon.setBackground(getResources().getDrawable(
						R.drawable.people));
				homeicon.setBackground(getResources().getDrawable(
						R.drawable.home1));
				placesicon.setBackground(getResources().getDrawable(
						R.drawable.place1));
				image2.setVisibility(View.INVISIBLE);
				image1.setVisibility(View.INVISIBLE);
				image3.setVisibility(View.VISIBLE);
			}
		});
		FragmentTransaction fragmentTransaction;
		FragmentManager fragmentManager = getSupportFragmentManager();
		fragmentTransaction = fragmentManager.beginTransaction();
		HomeFragment ls_fragment = new HomeFragment();

		fragmentTransaction.replace(R.id.fragmentcontainer, ls_fragment);
		fragmentTransaction.commit();

		leftmenu.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

			}
		});

	}

}