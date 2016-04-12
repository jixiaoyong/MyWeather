package com.shayn.niceweather;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;
import com.shayn.niceweather.R;

public class AirInfo extends Activity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.air_info);
        
        //设置监听事件，销毁本活动，返回上层
        ImageButton imgButtonAirInfoBack = (ImageButton)findViewById(R.id.back_air_info);
        imgButtonAirInfoBack.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				finish();				
			}
        	
        });
        
        //设置监听事件，点击分享进入分享页面
        ImageButton imgButtonAirInfoShare = (ImageButton)findViewById(R.id.share_air_info);
        imgButtonAirInfoShare.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent AirInfoShareIntent = new Intent(AirInfo.this,AirInfoShare.class);
				startActivity(AirInfoShareIntent);
			}
        	
        });
	}


}