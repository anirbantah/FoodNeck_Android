package com.example.foodneck;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MenuActivity extends Activity {
	ListView list1;
	HorizontalScrollView horizentalscrollview;
	TextView menulist, menubook, backtext;
	ImageView backimage;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.menu);
		horizentalscrollview=(HorizontalScrollView)findViewById(R.id.horizentalview);
		ImageView addmenu=(ImageView)findViewById(R.id.addmenu);
		
		backimage=(ImageView)findViewById(R.id.backimage);
		backimage.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(MenuActivity.this,MainActivity
						.class);
				startActivity(i);
			}
		});
		addmenu.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(MenuActivity.this,AddMenu.class);
				startActivity(i);
			}
		});
		LinearLayout topLinearLayout = new LinearLayout(this);
		
	        topLinearLayout.setOrientation(LinearLayout.HORIZONTAL); 
	        topLinearLayout.setDividerPadding(10);
	     for (int i = 0; i < 15; i++){



	            final ImageView imageView = new ImageView (this);

	            imageView.setTag(i);
	            Bitmap largeIcon = BitmapFactory.decodeResource(getResources(), R.drawable.pic);
	        
	            imageView.setImageBitmap(largeIcon);

	            topLinearLayout.addView(imageView);



	        }
	     horizentalscrollview.addView(topLinearLayout);
		Typeface font_regular = Typeface.createFromAsset(
				getApplicationContext().getAssets(), "LatoRegular.ttf");
		Typeface font_bold = Typeface.createFromAsset(getApplicationContext()
				.getAssets(), "LatoBold.ttf");
		menulist = (TextView) findViewById(R.id.menulist);
		menubook = (TextView) findViewById(R.id.menubook);
		backtext = (TextView) findViewById(R.id.backtext);
		menulist.setTypeface(font_bold);
		menubook.setTypeface(font_bold);
		backtext.setTypeface(font_regular);
		list1 = (ListView) findViewById(R.id.list1);
		list1.setAdapter(new CommentAdapter(MenuActivity.this));
backtext.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(MenuActivity.this,MainActivity
						.class);
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
				v = mInflater.inflate(R.layout.menu_row, null);
				TextView foodname = (TextView) v.findViewById(R.id.foodname);
				TextView cost = (TextView) v.findViewById(R.id.cost);
				TextView likes = (TextView) v.findViewById(R.id.likes);
				TextView photos = (TextView) v.findViewById(R.id.photos);
				Typeface font_regular = Typeface.createFromAsset(
						getApplicationContext().getAssets(), "LatoRegular.ttf");
				Typeface font_bold = Typeface.createFromAsset(
						getApplicationContext().getAssets(), "LatoBold.ttf");

				foodname.setTypeface(font_bold);
				cost.setTypeface(font_bold);
				likes.setTypeface(font_regular);
				photos.setTypeface(font_regular);

			}

			return v;
		}

	}

}
