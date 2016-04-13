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
		
		WeatherIndex weatherIndex = getItem(position);//��ȡ����ָ��ʵ��
		View view = LayoutInflater.from(getContext()).inflate(resourceId, null);
		
		//������Ӧ����
		ImageView weatherIndexImageLeft = (ImageView)view.findViewById(R.id.weather_index_image_left);
		TextView weatherIndexName = (TextView)view.findViewById(R.id.weather_index_name);
		TextView weatherIndexLevel = (TextView)view.findViewById(R.id.weather_index_level);
		TextView weatherIndexText = (TextView)view.findViewById(R.id.weather_index_text);
		ImageView weatherIndexImageRight = (ImageView)view.findViewById(R.id.weather_index_image_right);
		
		
		//����Щ����ֵ
		weatherIndexImageLeft.setImageResource(weatherIndex.getImageLeft());
		weatherIndexName.setText(weatherIndex.getName());
		weatherIndexLevel.setText(weatherIndex.getLevel());
		weatherIndexText.setText(weatherIndex.getText());
		weatherIndexImageRight.setImageResource(weatherIndex.getImageRight());

		return view;
	}

}
