package com.example.myweather;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;

//这里面是想自定义首页下方三个按钮的点击事件

public class MenuPressBottom extends Activity {
	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);
	        setContentView(R.layout.menu_bottom);
	        
	        final ImageButton iBBAdd =(ImageButton)findViewById(R.id.image_menu_bottom_add);
	        final ImageButton iBBIndex =(ImageButton)findViewById(R.id.image_menu_bottom_index);
	        final ImageButton iBBTendency =(ImageButton)findViewById(R.id.image_menu_bottom_tendency);
	        
	        iBBAdd.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					if(iBBAdd.getTag() == "off"){
						iBBAdd.setImageDrawable(getResources().getDrawable(R.drawable.menu_bottom_add_on));
						iBBAdd.setTag("on");
						}else{
							iBBAdd.setImageDrawable(getResources().getDrawable(R.drawable.menu_bottom_add));
							iBBAdd.setTag("off");
						}
							
					
				}
	        });
	        
	        iBBIndex.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					if(iBBIndex.getTag() == "off"){
						iBBIndex.setImageDrawable(getResources().getDrawable(R.drawable.menu_bottom_index_on));
						iBBIndex.setTag("on");
						}else{
							iBBIndex.setImageDrawable(getResources().getDrawable(R.drawable.menu_bottom_index));
							iBBIndex.setTag("off");
						}
							
					
				}
	        });
	        
	        iBBTendency.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					if(iBBTendency.getTag() == "off"){
						iBBTendency.setImageDrawable(getResources().getDrawable(R.drawable.menu_bottom_tendency_on));
						iBBTendency.setTag("on");
						}else{
							iBBTendency.setImageDrawable(getResources().getDrawable(R.drawable.menu_bottom_tendency));
							iBBTendency.setTag("off");
						}
							
					
				}
	        });
	        
	    }

}
