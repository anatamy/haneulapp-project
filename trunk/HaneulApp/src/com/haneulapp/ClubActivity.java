package com.haneulapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class ClubActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_club);
	}
	public void go_biofarm (View v) { 			//바이오팜
		Intent myintent = new Intent(this, ClubActivity.class);
		setContentView(R.layout.biofarm);
		}
	public void go_event (View v) {				//동아리메인
		Intent myintent = new Intent(this, ClubActivity.class);
		setContentView(R.layout.activity_club);
		}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.club, menu);
		return true;
	}

}
