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
	private String[] CityListAddData = {"����","�Ϻ�","����","����","���","����","̨��","���","���ͺ���","�Ĵ�","����","���ɹ�","���Ļ���������","����","����"};
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.city_list);
        
      //��ӳ�����Ϣ
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
