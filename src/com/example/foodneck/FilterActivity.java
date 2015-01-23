package com.example.foodneck;

import android.os.Bundle;
import android.app.Activity;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.ScrollView;

public class FilterActivity extends Activity {
	/*
	 * ListView lv_cat; ScrollView scroll;
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE); // Removes title bar
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_filter);

		/*
		 * lv_cat = (ListView) findViewById(R.id.lv_cat);
		 * 
		 * scroll=(ScrollView)findViewById(R.id.scroll);
		 * //*****************setting adapter for category
		 * list********************* categoryClass cc = new categoryClass();
		 * lv_cat.setAdapter(cc);
		 */

		/*
		 * scroll.setOnTouchListener(new OnTouchListener() {
		 * 
		 * @Override public boolean onTouch(View v, MotionEvent event) { // TODO
		 * Auto-generated method stub
		 * v.getParent().requestDisallowInterceptTouchEvent(true); return false;
		 * } });
		 * 
		 * 
		 * lv_cat.setOnTouchListener(new ListView.OnTouchListener() {
		 * 
		 * @Override public boolean onTouch(View v, MotionEvent event) { int
		 * action = event.getAction(); switch (action) { case
		 * MotionEvent.ACTION_DOWN: // Disallow ScrollView to intercept touch
		 * events. v.getParent().requestDisallowInterceptTouchEvent(true);
		 * break;
		 * 
		 * case MotionEvent.ACTION_UP: // Allow ScrollView to intercept touch
		 * events. v.getParent().requestDisallowInterceptTouchEvent(false);
		 * break; }
		 * 
		 * // Handle ListView touch events. v.onTouchEvent(event); return true;
		 * } });
		 */

	}

	class categoryClass extends BaseAdapter {

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return 6;
		}

		@Override
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub

			View row = convertView;

			if (row == null) {

				LayoutInflater inflater = (LayoutInflater) getApplicationContext()
						.getSystemService(
								getApplicationContext().LAYOUT_INFLATER_SERVICE);
				row = inflater.inflate(R.layout.row_category, parent, false);

			}

			return row;
		}

	}

}
