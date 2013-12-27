package com.haneulapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.PopupWindow;

public class UniformActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_uniform);
	
	 final Button btnOpenPopup = (Button)findViewById(R.id.openpopup_uniform);
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
     		
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.uniform, menu);
		return true;
	}

}
