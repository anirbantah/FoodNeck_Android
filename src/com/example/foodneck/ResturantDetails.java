package com.example.foodneck;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class ResturantDetails extends Activity {
ImageView back;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.resturantdetails);
		back=(ImageView)findViewById(R.id.back);
		back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		
		ListView menulist1=(ListView)findViewById(R.id.menulist);
		menulist1.setAdapter(new CommentAdapter_(ResturantDetails.this));
		
		ListView cardlist=(ListView)findViewById(R.id.list);
		ListView dealslist=(ListView)findViewById(R.id.dealslist);
		dealslist.setAdapter(new CommentAdapter_deals(ResturantDetails.this));
		cardlist.setAdapter(new CommentAdapter_comment(ResturantDetails.this));
		
		
	}
	public class CommentAdapter_ extends BaseAdapter {

		private Context context;

		public CommentAdapter_(Context context) {
			super();

			this.context = context;
		}

		@Override
		public int getCount() {

			return 3;
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
				
			
			}

			return v;
		}

	}
	
	
	public class CommentAdapter_deals extends BaseAdapter {

		private Context context;

		public CommentAdapter_deals(Context context) {
			super();

			this.context = context;
		}

		@Override
		public int getCount() {

			return 3;
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
				v = mInflater.inflate(R.layout.deals_row, null);
				
			
			}

			return v;
		}

	}
	
	
	
	public class CommentAdapter_comment extends BaseAdapter {

		private Context context;

		public CommentAdapter_comment(Context context) {
			super();

			this.context = context;
		}

		@Override
		public int getCount() {

			return 3;
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
				v = mInflater.inflate(R.layout.viewpager_2_row, null);
				
				
			}

			return v;
		}

	}
	

}
