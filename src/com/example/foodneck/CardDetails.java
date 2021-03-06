package com.example.foodneck;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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

public class CardDetails extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.card_details);
		
		ListView list=(ListView)findViewById(R.id.list);
		list.setAdapter(new CommentAdapter_(CardDetails.this));
		ImageView backimage=(ImageView)findViewById(R.id.backimage);
		backimage.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(CardDetails.this,MainActivity
						.class);
				startActivity(i);
			}
		});
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
				v = mInflater.inflate(R.layout.cards_row, null);
				
				ImageView resurenticon=(ImageView)v.findViewById(R.id.resurenticon);
			
			}

			return v;
		}

	}
}
