package com.example.myweather;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;


public class MainActivity extends Activity {
	private String[] weatherListData = {"����һ","���ڶ�","������","������","������","������","������"};
	private String[] weatherTendencyData = {"���� ","����","����","����","����","����","����"};
	private String[] weatherIndexData = {"��ɹָ��","����ָ��","�˶�ָ��","ϴ��ָ��","��ɹָ��"};
	 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        
        
        //������¼�������������ݲ���ʾ����
        ArrayAdapter<String> weatherListAdapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,weatherListData);
        ListView weatherListlistView = (ListView)findViewById(R.id.weather_list);
        weatherListlistView.setAdapter(weatherListAdapter);
        
        
        //����¼�뵱������ָ��
        ArrayAdapter<String> weatherIndexAdapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,weatherIndexData);
        ListView weatherLindexListView = (ListView)findViewById(R.id.weather_index);
        weatherLindexListView.setAdapter(weatherIndexAdapter);
        
        //����¼����������
        
        ArrayAdapter<String> weatherTendencyAdapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,weatherTendencyData);
        ListView weatherTendencyListView = (ListView)findViewById(R.id.weather_tendency);
        weatherTendencyListView.setAdapter(weatherTendencyAdapter);    
        
        //���尴ť�����¼�
        final ImageButton iBBAdd =(ImageButton)findViewById(R.id.image_menu_bottom_add);
        final ImageButton iBBIndex =(ImageButton)findViewById(R.id.image_menu_bottom_index);
        final ImageButton iBBTendency =(ImageButton)findViewById(R.id.image_menu_bottom_tendency);   
        
        //��ӳ���
        iBBAdd.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				if(iBBAdd.getTag() == "off"){
					iBBAdd.setImageDrawable(getResources().getDrawable(R.drawable.menu_bottom_add_on));
					iBBAdd.setTag("on");
					//ͬʱ��������ť��λ
					iBBTendency.setImageDrawable(getResources().getDrawable(R.drawable.menu_bottom_tendency));
					iBBTendency.setTag("off");
					iBBIndex.setImageDrawable(getResources().getDrawable(R.drawable.menu_bottom_index));
					iBBIndex.setTag("off");
					}else{
						iBBAdd.setImageDrawable(getResources().getDrawable(R.drawable.menu_bottom_add));
						iBBAdd.setTag("off");
					}
						
				
			}
        });
    
        //ָ��
        iBBIndex.setOnClickListener(new OnClickListener(){
        
			@Override
			public void onClick(View v) {
				if(iBBIndex.getTag() == "off"){
					iBBIndex.setImageDrawable(getResources().getDrawable(R.drawable.menu_bottom_index_on));
					iBBIndex.setTag("on");
					//ͬʱ��������ť��λ
					iBBTendency.setImageDrawable(getResources().getDrawable(R.drawable.menu_bottom_tendency));
					iBBTendency.setTag("off");
					iBBAdd.setImageDrawable(getResources().getDrawable(R.drawable.menu_bottom_add));
					iBBAdd.setTag("off");
					//�ر���������ͼ
					View weatherTendencyView = (View)findViewById(R.id.view_weather_tendency);
					weatherTendencyView.setVisibility(View.GONE);
					weatherTendencyView.setTag("gone");
					
					View weatherIndexView = (View)findViewById(R.id.view_weather_index);
					weatherIndexView.setVisibility(View.VISIBLE);
					weatherIndexView.setTag("visibe");
					}else{
						iBBIndex.setImageDrawable(getResources().getDrawable(R.drawable.menu_bottom_index));
						iBBIndex.setTag("off");
						View weatherIndexView = (View)findViewById(R.id.view_weather_index);
						weatherIndexView.setVisibility(View.GONE);
						weatherIndexView.setTag("gone");
					}
						
				
			}
        });
        
        //����
        iBBTendency.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				if(iBBTendency.getTag() == "off"){
					iBBTendency.setImageDrawable(getResources().getDrawable(R.drawable.menu_bottom_tendency_on));
					iBBTendency.setTag("on");
					
					//ͬʱ��������ť��λ
					iBBAdd.setImageDrawable(getResources().getDrawable(R.drawable.menu_bottom_add));
					iBBAdd.setTag("off");
					iBBIndex.setImageDrawable(getResources().getDrawable(R.drawable.menu_bottom_index));
					iBBIndex.setTag("off");
					
					View weatherTendencyView = (View)findViewById(R.id.view_weather_tendency);
					weatherTendencyView.setVisibility(View.VISIBLE);
					weatherTendencyView.setTag("visibe");
					}else{
						iBBTendency.setImageDrawable(getResources().getDrawable(R.drawable.menu_bottom_tendency));
						iBBTendency.setTag("off");
						View weatherTendencyView = (View)findViewById(R.id.view_weather_tendency);
						weatherTendencyView.setVisibility(View.GONE);
						weatherTendencyView.setTag("gone");
					}
						
				
			}
        });
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
