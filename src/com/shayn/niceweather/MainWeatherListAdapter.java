package com.shayn.niceweather;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MainWeatherListAdapter extends ArrayAdapter<MainWeatherList> {
	private int resourceId;
	
	public MainWeatherListAdapter(Context context,int textViewResourceId,List<MainWeatherList> objects){
		super(context,textViewResourceId,objects);
		resourceId = textViewResourceId;
	}


@Override
public View getView(int position,View convertView,ViewGroup parent){
	
	MainWeatherList mainWeatherList = getItem(position);//获取主页天气列表指数实例
	View view = LayoutInflater.from(getContext()).inflate(resourceId, null);
	
	//创建相应对象
	TextView mainWeatherListTime = (TextView)view.findViewById(R.id.main_weather_list_time);
	TextView mainWeatherListWeather = (TextView)view.findViewById(R.id.main_weather_list_weather);
	
	//对这些对象赋值
	mainWeatherListTime.setText(mainWeatherList.getTime());
	mainWeatherListWeather.setText(mainWeatherList.getWeather());
	return view;
}

}