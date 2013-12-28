package com.haneulapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;
 
public class SchoolActivity extends Activity {
    
    //------------------------------------------------------------
    // imageIDs �迭�� GridView �並 �����ϴ� �̹��� ���ϵ��� ���ҽ� ID���� ����ϴ�.
    
    private int[] imageIDs = new int[] {
        R.drawable.school_1_gym,
        R.drawable.school_1_health,
        R.drawable.school_1_main,
        R.drawable.school_1_park,
        R.drawable.school_1_road_bot,
        R.drawable.school_1_road_inside_a,
        R.drawable.school_1_road_inside,
        R.drawable.school_1_road,
        R.drawable.school_1_stair,
        R.drawable.school_1_stone,
        R.drawable.school_1_toilet,
    };
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school);

        GridView gridViewImages = (GridView)findViewById(R.id.gridViewImages);
        ImageGridAdapter imageGridAdapter = new ImageGridAdapter(this, imageIDs);
        gridViewImages.setAdapter(imageGridAdapter);
    }
} 