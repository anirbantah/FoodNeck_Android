package com.example.foodneck;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Nestedfragment  extends Fragment{
View row;
private static final String KEY_POSITION="position";
	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		inflater = getActivity().getLayoutInflater();
		

		View result=inflater.inflate(R.layout.viewpager_1, container, false);
	   

	    return(result);
	}
	
	
	 static Nestedfragment newInstance(int position) {
		 Nestedfragment frag=new Nestedfragment();
		    Bundle args=new Bundle();

		    args.putInt(KEY_POSITION, position);
		    frag.setArguments(args);
		    
		  
		    return(frag);
		  }

}
