package com.haneulapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.PopupWindow;

public class ClubActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_club);
	}


	//µ¿¾Æ¸® ·¹ÀÌ¾Æ¿ô °£ ÀÌµ¿.
	public void go_biofarm (View v) { 			//¹ÙÀÌ¿ÀÆÊ
		Intent myintent = new Intent(this, ClubActivity.class);
		setContentView(R.layout.biofarm);
		}
	public void go_caritas (View v) { 			//Ä«¸®Å¸½º
		Intent myintent = new Intent(this, ClubActivity.class);
		setContentView(R.layout.caritas);
		}
	public void go_volunteather (View v) { 			//±³À°ºÀ»ç
		Intent myintent = new Intent(this, ClubActivity.class);
		setContentView(R.layout.volunteather);
		}
	public void go_archi (View v) { 			//ARCHI
		Intent myintent = new Intent(this, ClubActivity.class);
		setContentView(R.layout.archi);
		}
	public void go_alchemist (View v) { 			//Alchemist
		Intent myintent = new Intent(this, ClubActivity.class);
		setContentView(R.layout.alchemist);
		}
	public void go_blue (View v) { 			//BLUE
		Intent myintent = new Intent(this, ClubActivity.class);
		setContentView(R.layout.blue);
		}
	public void go_onair (View v) { 			//ON AIR
		Intent myintent = new Intent(this, ClubActivity.class);
		setContentView(R.layout.onair);
		}
	public void go_unesco (View v) {		//unesco
		Intent myintent = new Intent(this, ClubActivity.class);
		setContentView(R.layout.unesco);
	}
	public void go_haneul_maru (View v) {		//ÇÏ´Ã¸¶·ç
		Intent myintent = new Intent(this, ClubActivity.class);
		setContentView(R.layout.haneul_maru);
	}
	public void go_isha (View v) {		//Isha
		Intent myintent = new Intent(this, ClubActivity.class);
		setContentView(R.layout.isha);
	}
	public void go_haul (View v) {		//haul
		Intent myintent = new Intent(this, ClubActivity.class);
		setContentView(R.layout.haul);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.club, menu);
		return true;
	}

}