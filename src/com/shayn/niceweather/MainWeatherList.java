package com.shayn.niceweather;

import android.app.Activity;

public class MainWeatherList extends Activity{
	
	private String time;
	private String weather;
	
	public MainWeatherList(String time,String weather){
		this.time = time;
		this.weather = weather;
	}
	
	public String getTime(){
		return time;
	}
	
	public String getWeather(){
		return weather;
	}
	

}
