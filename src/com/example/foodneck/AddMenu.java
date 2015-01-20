package com.example.foodneck;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class AddMenu extends Activity{
	ImageView backimage;
	TextView  backtext,addmenutext;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.addmenu);
		
		backtext = (TextView) findViewById(R.id.backtext);
		

		backimage=(ImageView)findViewById(R.id.backimage);
		backimage.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(AddMenu.this,MainActivity
						.class);
				startActivity(i);
			}
		});
		
		backtext.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(AddMenu.this,MainActivity
						.class);
				startActivity(i);
			}
		});
		addmenutext=(TextView)findViewById(R.id.addmenutext);
		Typeface font_regular = Typeface.createFromAsset(
				getApplicationContext().getAssets(), "LatoRegular.ttf");
		Typeface font_bold = Typeface.createFromAsset(getApplicationContext()
				.getAssets(), "LatoBold.ttf");
		backtext.setTypeface(font_regular);
		addmenutext.setTypeface(font_bold);
		
	}

}
