package com.example.myweather;

import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class CityList extends Activity{
	private String[] CityListAddData = {"北京","上海","广州","西安","香港","澳门","台湾","天津","呼和浩特","四川","湖南","内蒙古","宁夏回族自治区","云南","江西"};
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.city_list);
        
      //添加城市信息
        ArrayAdapter<String> CityListAddAdapter = new ArrayAdapter<String>(CityList.this,android.R.layout.simple_list_item_1,CityListAddData);
        ListView CityListAddView = (ListView)findViewById(R.id.city_list_add);
        CityListAddView.setAdapter(CityListAddAdapter); 
        
        final ImageButton backImageButton = (ImageButton)findViewById(R.id.back);
        backImageButton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				finish();
				
			}
        	
        });

	}
}
