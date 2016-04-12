package com.example.myweather;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class WeatherIndex extends Activity{
	
	private int imageId;
	private String name;
	private String level;
	private int buttonId;
	private String text;
	
	public WeatherIndex(int imageId,String name,String level,int buttonId,String text){
		
		this.imageId = imageId;
		this.name = name;
		this.level = level;
		this.buttonId = buttonId;
		this.text = text;
		
/*		//定义按钮监听事件
		final TextView weatherIndextext = (TextView)findViewById(R.id.weather_index_text);
		final ImageButton weatherIndexImageButton = (ImageButton)findViewById(buttonId);
		weatherIndexImageButton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				
				//设置点击按钮事件
				if(weatherIndexImageButton.getTag() == "off"){
					weatherIndexImageButton.setImageDrawable(getResources().getDrawable(R.drawable.weather_index_button_on));
					weatherIndexImageButton.setTag("on");
					
					weatherIndextext.setVisibility(View.VISIBLE);
				}else{
					
					weatherIndexImageButton.setImageDrawable(getResources().getDrawable(R.drawable.weather_index_button_off));
					weatherIndexImageButton.setTag("off");
					
					weatherIndextext.setVisibility(View.GONE);
				}
				
			}
			
		});
*/	
	}
	
	public String getName(){
		return name;
	}
	
	public int getImageId(){
		return imageId;
	}
	
	public String getLevel(){
		return level;
	}
	
	public int getButtonId(){
		return buttonId;
	}
	
	public String getTextId(){
		return text;
	}
	


}
