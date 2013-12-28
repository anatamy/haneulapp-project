package com.haneulapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}
	public void go_club1 (View v) {
	    Intent myintent = new Intent(this, ClubActivity.class);
	    startActivity(myintent);								//club
	}

	public void go_event1 (View v) {
	    Intent myintent = new Intent(this, EventActivity.class);
	    startActivity(myintent);								//event
	}
	public void go_school1 (View v) {
	    Intent myintent = new Intent(this, SchoolActivity.class);
	    startActivity(myintent);								//school
	}
	public void go_uniform1 (View v) {
		
	    Intent myintent = new Intent(this, UniformActivity.class);
	    startActivity(myintent);								//uniform
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
