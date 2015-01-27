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

public class Followes extends Activity {
ListView listView1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_followes);
		listView1=(ListView)findViewById(R.id.listView1);
		listView1.setAdapter(new CommentAdapter_(Followes.this));
		
		ImageView imageView1=(ImageView)findViewById(R.id.imageView1);
		imageView1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Followes.this,MainActivity
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
				v = mInflater.inflate(R.layout.followers_row, null);
				
				ImageView resurenticon=(ImageView)v.findViewById(R.id.resurenticon);
			
			}

			return v;
		}

	}
}
