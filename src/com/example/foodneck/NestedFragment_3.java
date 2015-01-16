package com.example.foodneck;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class NestedFragment_3 extends Fragment {
	private static final String KEY_POSITION = "position";
TextView kfcres,loc,test,service,presentation,atmos,details,food1,food2,food3,food4,food5,food6;
	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		inflater = getActivity().getLayoutInflater();

		View result = inflater.inflate(R.layout.viewpager_2, container, false);

		ListView list1 = (ListView) result.findViewById(R.id.list1);
		list1.setAdapter(new CommentAdapter(getActivity()));
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

		Typeface font_regular = Typeface.createFromAsset(
				getActivity().getAssets(), "LatoRegular.ttf");
		Typeface font_bold = Typeface.createFromAsset(getActivity()
				.getAssets(), "LatoBold.ttf");
		kfcres=(TextView)result.findViewById(R.id.kfcres);
		loc=(TextView)result.findViewById(R.id.loc);
		test=(TextView)result.findViewById(R.id.test);
		service=(TextView)result.findViewById(R.id.service);
		presentation=(TextView)result.findViewById(R.id.presentation);
		atmos=(TextView)result.findViewById(R.id.atmos);
		details=(TextView)result.findViewById(R.id.details);
		food1=(TextView)result.findViewById(R.id.food1);
		food2=(TextView)result.findViewById(R.id.food2);
		food3=(TextView)result.findViewById(R.id.food3);
		food4=(TextView)result.findViewById(R.id.food4);
		food5=(TextView)result.findViewById(R.id.food5);
		food6=(TextView)result.findViewById(R.id.food6);
		
		food1.setTypeface(font_regular);
		
		food2.setTypeface(font_regular);
		food3.setTypeface(font_regular);
		food4.setTypeface(font_regular);
		food5.setTypeface(font_regular);
		food6.setTypeface(font_regular);
		kfcres.setTypeface(font_regular);
		loc.setTypeface(font_regular);
		
		test.setTypeface(font_regular);
		service.setTypeface(font_regular);
		presentation.setTypeface(font_regular);
		atmos.setTypeface(font_regular);
		details.setTypeface(font_regular);
		return (result);
	}

	static NestedFragment_3 newInstance(int position) {
		NestedFragment_3 frag = new NestedFragment_3();
		Bundle args = new Bundle();

		args.putInt(KEY_POSITION, position);
		frag.setArguments(args);

		return (frag);
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
				v = mInflater.inflate(R.layout.viewpager_2_row, null);
				TextView name=(TextView)v.findViewById(R.id.name);
				
				TextView date=(TextView)v.findViewById(R.id.date);
				TextView bellowname=(TextView)v.findViewById(R.id.bellowname);
				TextView desc=(TextView)v.findViewById(R.id.desc);
				TextView likes=(TextView)v.findViewById(R.id.likes);
				
				TextView comment=(TextView)v.findViewById(R.id.comment);
				

				Typeface font_regular = Typeface.createFromAsset(
						getActivity().getAssets(), "LatoRegular.ttf");
				Typeface font_bold = Typeface.createFromAsset(getActivity()
						.getAssets(), "LatoBold.ttf");
				
				name.setTypeface(font_bold);
				date.setTypeface(font_bold);
				bellowname.setTypeface(font_bold);
				desc.setTypeface(font_regular);
				likes.setTypeface(font_bold);
				comment.setTypeface(font_bold);
			}

			return v;
		}

	}

}
