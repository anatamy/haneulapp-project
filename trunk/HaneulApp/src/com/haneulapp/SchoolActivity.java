package com.haneulapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.PopupWindow;

public class SchoolActivity extends Activity {

public void activity_club(View v) {

		
		Intent myintent = new Intent(this, ClubActivity.class);
			startActivity(getIntent());
			finish();
		 }

public void activity_event(View v) {

	
	Intent myintent = new Intent(this, EventActivity.class);
		startActivity(getIntent());
		finish();
	 }
public void activity_school(View v) {

	
	Intent myintent = new Intent(this, SchoolActivity.class);
		startActivity(getIntent());
		finish();
	 }
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_school);
		//팝업윈도우 구현
		 final Button btnOpenPopup = (Button)findViewById(R.id.openpopup_school);
	        btnOpenPopup.setOnClickListener(new Button.OnClickListener(){
	        	 public void onClick(View arg0) {
	        		    LayoutInflater layoutInflater 
	        		     = (LayoutInflater)getBaseContext()
	        		      .getSystemService(LAYOUT_INFLATER_SERVICE);  
	        		    View popupView = layoutInflater.inflate(R.layout.popup, null);  
	        		             final PopupWindow popupWindow = new PopupWindow(
	        		               popupView, 
	        		               LayoutParams.WRAP_CONTENT,  
	        		                     LayoutParams.WRAP_CONTENT);  
	        		             
	        		             Button btnDismiss = (Button)popupView.findViewById(R.id.dismiss);
	        		             btnDismiss.setOnClickListener(new Button.OnClickListener(){

	        		     @Override
	        		     public void onClick(View v) {
	        		      // TODO Auto-generated method stub
	        		      popupWindow.dismiss();
	        		     }});
	        		               
	        		             popupWindow.showAsDropDown(btnOpenPopup, 50, -30);
	        		         
	        		             
	        		   }});
	        		    }
	        		}