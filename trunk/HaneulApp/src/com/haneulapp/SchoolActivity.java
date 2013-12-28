package com.haneulapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;
 
public class SchoolActivity extends Activity {
    
    //------------------------------------------------------------
    // imageIDs 배열은 GridView 뷰를 구성하는 이미지 파일들의 리소스 ID들을 담습니다.
    
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
        R.drawable.school_2_201,
        R.drawable.school_2_computer,
        R.drawable.school_2_main1,
        R.drawable.school_2_main2,
        R.drawable.school_2_media1,
        R.drawable.school_2_media2,
        R.drawable.school_2_principle,
        R.drawable.school_2_road,
        R.drawable.school_2_teacher,
        R.drawable.school_3_bio,
        R.drawable.school_3_homebase,
        R.drawable.school_3_main,
        R.drawable.school_3_phy,
        R.drawable.school_3_road1,
        R.drawable.school_3_road2,
        R.drawable.school_3_road3,
        R.drawable.school_3_store,
        R.drawable.school_3_wall,
        R.drawable.school_4_5_call,
        R.drawable.school_4_5_garden,
        R.drawable.school_4_5_library,
        R.drawable.school_4_5_media,
        R.drawable.school_4_5_music,
        R.drawable.school_4_5_outside_ab,
        R.drawable.school_4_5_sleep,
        R.drawable.school_4_5_stair,
        R.drawable.school_4_5_upstair,
        
        
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