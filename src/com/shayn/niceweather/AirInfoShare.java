package com.shayn.niceweather;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;
import com.shayn.niceweather.R;

public class AirInfoShare extends Activity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.air_info_share);
        
        //设置监听事件，销毁本活动，返回上层
        ImageButton imgButtonAirInfoBack = (ImageButton)findViewById(R.id.back_air_info_share);
        imgButtonAirInfoBack.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				finish();				
			}
        	
        });
	}


}