package com.shayn.niceweather;

import android.app.Activity;


public class WeatherIndex extends Activity{
	
	private int imageLeft;
	private String name;
	private String level;
	private int imageRight;
	private String text;
	private String textTag;
	
	public WeatherIndex(int imageLeft,String name,String level,int imageRight,String text,String textTag){
		
		this.imageLeft = imageLeft;
		this.name = name;
		this.level = level;
		this.imageRight = imageRight;
		this.text = text;
		//this.textId = textId;
	}
	
	public String getName(){
		return name;
	}
	
	public int getImageLeft(){
		return imageLeft;
	}
	
	public String getLevel(){
		return level;
	}
	
	public int getImageRight(){
		return imageRight;
	}
	
	public String getText(){
		return text;
	}
	
	/*public int getTextId(){
		return textId;
	}*/
	
	public String getTextTag(){
		return textTag;
	}
	


}
