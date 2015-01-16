package com.example.foodneck;

import org.w3c.dom.Comment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class NestedFragment1 extends Fragment {

	View row;
	private static final String KEY_POSITION = "position";
	ListView list1;

	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		inflater = getActivity().getLayoutInflater();

		View result = inflater.inflate(R.layout.nestedfrag1, container, false);
		list1 = (ListView) result.findViewById(R.id.list1);
		list1.setAdapter(new CommentAdapter(getActivity()));
		return (result);
	}

	static NestedFragment1 newInstance(int position) {
		NestedFragment1 frag = new NestedFragment1();
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
				v = mInflater.inflate(R.layout.top_user_row, null);
			}

			return v;
		}

	}

}
