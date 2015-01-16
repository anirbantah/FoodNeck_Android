package com.example.foodneck;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Coupons extends Activity {
	ListView list1;

	ImageView backimage;
	TextView backtext, shortby, loc, locname, kfcres;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.coupons);
		Typeface font_regular = Typeface.createFromAsset(
				getApplicationContext().getAssets(), "LatoRegular.ttf");
		Typeface font_bold = Typeface.createFromAsset(getApplicationContext()
				.getAssets(), "LatoBold.ttf");
		shortby = (TextView) findViewById(R.id.shortby);

		shortby.setTypeface(font_bold);

		list1 = (ListView) findViewById(R.id.list1);
		list1.setDivider(new ColorDrawable(0x00000000)); // 0xAARRGGBB
		list1.setDividerHeight(10);
		list1.setAdapter(new CommentAdapter(Coupons.this));
		backimage = (ImageView) findViewById(R.id.backimage);
		backtext = (TextView) findViewById(R.id.backtext);

		backtext.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Coupons.this, MainActivity.class);
				startActivity(i);
			}
		});

		backimage.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Coupons.this, MainActivity.class);
				startActivity(i);
			}
		});

	}

	public class CommentAdapter extends BaseAdapter {

		private Context context;

		public CommentAdapter(Context context) {
			super();

			this.context = context;
		}

		@Override
		public int getCount() {

			return 10;
		}

		@Override
		public Integer getItem(int position) {
			return position;
		}

		@Override
		public long getItemId(int arg0) {
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View v = convertView;
			if (v == null) {
				LayoutInflater mInflater = (LayoutInflater) context
						.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				v = mInflater.inflate(R.layout.coupons_row, null);
				Typeface font_regular = Typeface.createFromAsset(
						getApplicationContext().getAssets(), "LatoRegular.ttf");
				Typeface font_bold = Typeface.createFromAsset(
						getApplicationContext().getAssets(), "LatoBold.ttf");

				kfcres = (TextView) v.findViewById(R.id.kfcres);
				loc = (TextView) v.findViewById(R.id.loc);
				locname = (TextView) v.findViewById(R.id.locname);

				TextView freeice = (TextView) v.findViewById(R.id.freeice);

				TextView terms = (TextView) v.findViewById(R.id.terms);

				TextView text1 = (TextView) v.findViewById(R.id.text1);

				TextView text2 = (TextView) v.findViewById(R.id.text2);

				TextView text3 = (TextView) v.findViewById(R.id.text3);

				TextView text4 = (TextView) v.findViewById(R.id.text4);
				
				TextView exp = (TextView) v.findViewById(R.id.exp);
				
				TextView redeem = (TextView) v.findViewById(R.id.redeem);

				freeice.setTypeface(font_regular);
				terms.setTypeface(font_regular);
				text1.setTypeface(font_regular);
				text2.setTypeface(font_regular);
				text3.setTypeface(font_regular);
				text4.setTypeface(font_regular);
				
				exp.setTypeface(font_bold);
				
				redeem.setTypeface(font_bold);

				kfcres.setTypeface(font_bold);
				loc.setTypeface(font_regular);
				locname.setTypeface(font_regular);

			}

			return v;
		}

	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub

	}

}
