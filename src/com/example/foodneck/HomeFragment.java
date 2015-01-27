package com.example.foodneck;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.viewpagerindicator.CirclePageIndicator;

public class HomeFragment extends Fragment {
	ViewPager pager;
	LayoutInflater inflater;
	CirclePageIndicator indicator, indicator1;
	View row;
	ListView list2, list3;
	QuotesAdapter mequest;
	QuotesAdapter1 mequest1;
	QuotesAdapter_3 mequest2;
	ViewPager pager1, pager2;
	LinearLayout lin1, lin2, lin3;
	private static final int MAX_VIEWS = 3;
	int abc=3;
	int abc1=5;

	@Override
	public View onCreateView(LayoutInflater inflater,
			ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		inflater = getActivity().getLayoutInflater();
		mequest1 = new QuotesAdapter1(getActivity(), getFragmentManager());
		mequest = new QuotesAdapter(getActivity(), getFragmentManager());
		mequest2 = new QuotesAdapter_3(getActivity(), getFragmentManager());
		row = inflater.inflate(R.layout.homefragment, container, false);
		pager = (ViewPager) row.findViewById(R.id.pager);
		indicator = (CirclePageIndicator) row.findViewById(R.id.indicator);
	
		pager.setAdapter(mequest);
		mequest.notifyDataSetChanged();
	pager.setOnPageChangeListener(new WalkthroughPageChangeListener1());
		//pager.setCurrentItem(1);
		

		indicator.setViewPager(pager);

		pager1 = (ViewPager) row.findViewById(R.id.pager1);
		indicator1 = (CirclePageIndicator) row.findViewById(R.id.indicator1);
	
		pager1.setAdapter(mequest1);
		mequest1.notifyDataSetChanged();
		indicator1.setViewPager(pager1);

		list2 = (ListView) row.findViewById(R.id.list2);
		list2.setAdapter(new CommentAdapter_(getActivity()));
		list3 = (ListView) row.findViewById(R.id.list3);
		list3.setAdapter(new CommentAdapter_(getActivity()));

		lin1 = (LinearLayout) row.findViewById(R.id.lin1);
		lin2 = (LinearLayout) row.findViewById(R.id.lin2);
		lin3 = (LinearLayout) row.findViewById(R.id.lin3);

		pager2 = (ViewPager) row.findViewById(R.id.pager2);
		pager2.setAdapter(mequest2);

		pager2.setOnPageChangeListener(new WalkthroughPageChangeListener());
		
		
		
		list3.setOnTouchListener(new OnTouchListener() {
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

		list2.setOnTouchListener(new OnTouchListener() {
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
			return (abc);
		}

		@Override
		public Fragment getItem(int position) {
			
			System.out.println(position);
			return (Nestedfragment.newInstance(position));
		}

		
		
		/*
		 * @Override public String getPageTitle(int position) {
		 * return(Nestedfragment.getTitle(ctxt, position)); }
		 */
	}

	public class QuotesAdapter1 extends FragmentStatePagerAdapter {
		Context ctxt = null;

		public QuotesAdapter1(Context ctxt, FragmentManager mgr) {
			super(mgr);
			this.ctxt = ctxt;
		}

		@Override
		public int getCount() {
			return (abc1);
		}

		@Override
		public Fragment getItem(int position) {
			return (NestedFragment1.newInstance(position));
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

	public class QuotesAdapter_3 extends FragmentStatePagerAdapter {
		Context ctxt = null;

		public QuotesAdapter_3(Context ctxt, FragmentManager mgr) {
			super(mgr);
			this.ctxt = ctxt;
		}

		@Override
		public int getCount() {
			return (3);
		}

		@Override
		public Fragment getItem(int position) {
			return (NestedFragment_3.newInstance(position));
		}

		/*
		 * @Override public String getPageTitle(int position) {
		 * return(Nestedfragment.getTitle(ctxt, position)); }
		 */
	}

	class WalkthroughPageChangeListener implements
			ViewPager.OnPageChangeListener {

		@Override
		public void onPageScrollStateChanged(int arg0) {

		}

		@Override
		public void onPageScrolled(int arg0, float arg1, int arg2) {
System.out.println(arg0);
			if (arg0 == 0) {
				lin1.setVisibility(View.VISIBLE);
				
				lin1.setBackgroundColor(Color.parseColor("#000000"));
				lin2.setVisibility(View.INVISIBLE);
				lin3.setVisibility(View.INVISIBLE);
			} else if (arg0 == 1) {
				lin2.setVisibility(View.VISIBLE);
				lin1.setBackgroundColor(View.INVISIBLE);
				lin2.setBackgroundColor(Color.parseColor("#000000"));
				lin3.setVisibility(View.INVISIBLE);
			} else if (arg0 == 2) {
				lin3.setVisibility(View.VISIBLE);
				lin1.setBackgroundColor(View.INVISIBLE);
				lin2.setVisibility(View.INVISIBLE);
				lin3.setBackgroundColor(Color.parseColor("#000000"));
			}

		}

		@Override
		public void onPageSelected(int position) {
			// Here is where you should show change the view of page indicator
			switch (position) {

			case MAX_VIEWS - 1:

			default:

			}

		}

	}
	
	
	
	
	
	
	

	class WalkthroughPageChangeListener1 implements
			ViewPager.OnPageChangeListener {

		@Override
		public void onPageScrollStateChanged(int arg0) {

		}

		@Override
		public void onPageScrolled(int arg0, float arg1, int arg2) {

			if (arg0 == 0) {
				MainActivity.image1.setVisibility(View.VISIBLE);
				MainActivity.image2.setVisibility(View.INVISIBLE);
				MainActivity.image3.setVisibility(View.INVISIBLE);
				
			} else if (arg0 == 1) {
				MainActivity.image1.setVisibility(View.INVISIBLE);
				MainActivity.image2.setVisibility(View.VISIBLE);
				MainActivity.image3.setVisibility(View.INVISIBLE);
			} else if (arg0 == 2) {
				MainActivity.image1.setVisibility(View.INVISIBLE);
				MainActivity.image2.setVisibility(View.INVISIBLE);
				MainActivity.image3.setVisibility(View.VISIBLE);
			}

		}

		@Override
		public void onPageSelected(int position) {
			// Here is where you should show change the view of page indicator
			switch (position) {

			case MAX_VIEWS - 1:

			default:

			}

		}
		
		

	}
	
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	
	}
	
	

}
