package com.example.foodneck;



import com.viewpagerindicator.CirclePageIndicator1;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class HomeFragmentpeople extends Fragment{
	ViewPager pager;
	QuotesAdapter mequest;
	ListView list1;
	@Override
	public View onCreateView(LayoutInflater inflater,
			ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		inflater = getActivity().getLayoutInflater();

		View row = inflater.inflate(R.layout.homepeople, container, false);
		mequest = new QuotesAdapter(getActivity(), getFragmentManager());
		pager = (ViewPager) row.findViewById(R.id.pager);
		pager.setAdapter(mequest);
		//pager.setOnPageChangeListener(new WalkthroughPageChangeListener1());
		pager.setCurrentItem(1);
		
		CirclePageIndicator1	indicator = (CirclePageIndicator1) row.findViewById(R.id.indicator);
	indicator.setViewPager(pager);
		list1=(ListView)row.findViewById(R.id.list1);
		list1.setAdapter(new CommentAdapter_(getActivity()));
		list1.setOnTouchListener(new OnTouchListener() {
			// Setting on Touch Listener for handling the touch inside
			// ScrollView
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// Disallow the touch request for parent scroll on touch of
				// child view
				v.getParent().requestDisallowInterceptTouchEvent(true);
				return false;
			}
		});
		return row;
	}
	
	
	public class QuotesAdapter extends FragmentStatePagerAdapter {
		Context ctxt = null;

		public QuotesAdapter(Context ctxt, FragmentManager mgr) {
			super(mgr);
			this.ctxt = ctxt;
		}

		@Override
		public int getCount() {
			return (3);
		}

		@Override
		public Fragment getItem(int position) {
			
			System.out.println(position);
			return (NestedFragmentPeolple.newInstance(position));
		}

		
		
		/*
		 * @Override public String getPageTitle(int position) {
		 * return(Nestedfragment.getTitle(ctxt, position)); }
		 */
	}
	
	
	

	public class CommentAdapter_ extends BaseAdapter {

		private Context context;

		public CommentAdapter_(Context context) {
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
				v = mInflater.inflate(R.layout.viewpager_2_row, null);
			}

			return v;
		}

	}
}
