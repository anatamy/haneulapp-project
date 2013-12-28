package com.haneulapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class ImageClickListener implements OnClickListener {

    Context context;
    
    //-----------------------------------------------------------
    // imageID�� Ȯ���ؼ� ������ �̹����� ���ҽ� ID�Դϴ�.
    
    int imageID;
    
    public ImageClickListener(Context context, int imageID) {
        this.context = context;
        this.imageID = imageID;
    }

    public void onClick(View v) {
        Intent intent = new Intent(context, SchoolActivity.class);
        intent.putExtra("image ID", imageID);
        context.startActivity(intent);
    }
}
