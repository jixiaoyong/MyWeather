package com.shayn.niceweather;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.shayn.niceweather.R;

public class WeatherIndexAdapter extends ArrayAdapter<WeatherIndex> {
	
	private int resourceId;
	
	public WeatherIndexAdapter(Context context,int textViewResourceId,List<WeatherIndex> objects){
		super(context,textViewResourceId,objects);
		resourceId = textViewResourceId;
		
	}
	
	@Override
	public View getView(int position,View convertView,ViewGroup parent){
		
		WeatherIndex weatherIndex = getItem(position);//获取气象指数实例
		View view = LayoutInflater.from(getContext()).inflate(resourceId, null);
		
		//创建相应对象
		ImageView weatherIndexImage = (ImageView)view.findViewById(R.id.weather_index_image);
		TextView weatherIndexName = (TextView)view.findViewById(R.id.weather_index_name);
		TextView weather_index_level = (TextView)view.findViewById(R.id.weather_index_level);
		TextView weather_index_text = (TextView)view.findViewById(R.id.weather_index_text);
		
		//对这些对象赋值
		weatherIndexImage.setImageResource(weatherIndex.getImageId());
		weatherIndexName.setText(weatherIndex.getName());
		weather_index_level.setText(weatherIndex.getLevel());
		weather_index_text.setText(weatherIndex.getTextId());
		return view;
	}

}
