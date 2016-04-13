package com.shayn.niceweather;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;



public class MainActivity extends Activity {
	private String[] weatherListData = {"����һ","���ڶ�","������","������","������",""};
	private String[] weatherTendencyData = {"����1 ","����2","����3","����4","����5"};
	
	private List<WeatherIndex> weatherIndexList = new ArrayList<WeatherIndex>();
	private List<MainWeatherList> mainWeatherList = new ArrayList<MainWeatherList>();
	

	 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        
        
        //������¼�������������ݲ���ʾ����
        ArrayAdapter<String> weatherListAdapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,weatherListData);
        ListView weatherListlistView = (ListView)findViewById(R.id.weather_list);
        weatherListlistView.setAdapter(weatherListAdapter);
 
        
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
					
					//ͬʱ��������ť��λ
					iBBTendency.setImageDrawable(getResources().getDrawable(R.drawable.menu_bottom_tendency));
					iBBTendency.setTag("off");
					iBBIndex.setImageDrawable(getResources().getDrawable(R.drawable.menu_bottom_index));
					iBBIndex.setTag("off");
					
					//�ر��������ƺ�����ָ��
					View weatherTendencyView = (View)findViewById(R.id.view_weather_tendency);
					weatherTendencyView.setVisibility(View.GONE);
					weatherTendencyView.setTag("gone");

					View weatherIndexView = (View)findViewById(R.id.view_weather_index);
					weatherIndexView.setVisibility(View.GONE);
					weatherIndexView.setTag("gone");					
					
					
					//�򿪳����б�
					Intent addCityIntent = new Intent(MainActivity.this,CityList.class);
					startActivity(addCityIntent);
					
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
					
					//������ö������а�ť�ļ����¼�
					
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
					
					//�ر�����ָ��
					View weatherIndexView = (View)findViewById(R.id.view_weather_index);
					weatherIndexView.setVisibility(View.GONE);
					weatherIndexView.setTag("gone");
					
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
        
        //���ý������ָ��ҳ��
        final ImageButton imgButtonIntoAirInfo = (ImageButton)findViewById(R.id.into_air_info);
        imgButtonIntoAirInfo.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intoAirInfoIntent = new Intent(MainActivity.this,AirInfo.class);
				startActivity(intoAirInfoIntent);
				
			}
        	
        });
        
        //�����Ƕ�̬¼������ָ�����ݲ������Զ���ListView
        initWeatherIndex();//��ʼ������
        WeatherIndexAdapter weatherIndexAdapterMain = new WeatherIndexAdapter(MainActivity.this,R.layout.weather_index_item,weatherIndexList);
        ListView listView = (ListView)findViewById(R.id.weather_index);
        listView.setAdapter(weatherIndexAdapterMain);
        
        //������ָ��ÿһ���������ü����¼�
        listView.setOnItemClickListener(new OnItemClickListener(){
        	@Override
        	public void onItemClick(AdapterView<?> parent,View view,int position,long id){
        		WeatherIndex weatherIndex = weatherIndexList.get(position);
        		
        		Toast.makeText(MainActivity.this,weatherIndex.getName(),Toast.LENGTH_SHORT).show();
        		//Toast.makeText(MainActivity.this,weatherIndex.getImageRight(),Toast.LENGTH_SHORT).show();
        		//ϣ�������ť��ʾ���ص�TextView������û��ʵ��2016��4��13�� 14:13:45
        		
        	}
        });
        
        //��̬¼����ҳ������Ϣ�б���ʼ��
        initMainWeatherList();//��ʼ������
        MainWeatherListAdapter mainWeatherListAdapter = new MainWeatherListAdapter(MainActivity.this,R.layout.main_weather_list_item,mainWeatherList);
        ListView mainWeatherListView =(ListView)findViewById(R.id.weather_list);
        mainWeatherListView.setAdapter(mainWeatherListAdapter);
        
    }

    //������ָ����ʼ��
    private void initWeatherIndex(){
    	WeatherIndex sunblock = new WeatherIndex(R.drawable.index_sunblock,"��ɹָ��","level",R.drawable.weather_index_button_off,"text1","gone");
    	weatherIndexList.add(sunblock);
    	WeatherIndex dress = new WeatherIndex(R.drawable.index_dress,"����ָ��","level",R.drawable.weather_index_button_off,"text2","gone");
    	weatherIndexList.add(dress);
    	WeatherIndex exercise = new WeatherIndex(R.drawable.index_exercise,"�˶�ָ��","level",R.drawable.weather_index_button_off,"text3","gone");
    	weatherIndexList.add(exercise);
    	WeatherIndex car = new WeatherIndex(R.drawable.index_car,"ϴ��ָ��","level",R.drawable.weather_index_button_off,"text4","gone");
    	weatherIndexList.add(car);
    	WeatherIndex field = new WeatherIndex(R.drawable.index_field,"��ɹָ��","level",R.drawable.weather_index_button_off,"text5","gone");
    	weatherIndexList.add(field);
    }

    	

    //����ҳ������Ϣ�б��ʼ��
    private void initMainWeatherList(){
    	MainWeatherList day1 = new MainWeatherList("����һ��5/2","����ת�� 15~20��");
    	mainWeatherList.add(day1);
    	MainWeatherList day2 = new MainWeatherList("���ڶ���6/2","����ת�� 15~20��");
    	mainWeatherList.add(day2);
    	MainWeatherList day3 = new MainWeatherList("��������7/2","����ת�� 15~20��");
    	mainWeatherList.add(day3);
    	MainWeatherList day4 = new MainWeatherList("�����ģ�8/2","����ת�� 15~20��");
    	mainWeatherList.add(day4);
    	MainWeatherList day5 = new MainWeatherList("�����壬9/2","����ת�� 15~20��");
    	mainWeatherList.add(day5);
    	MainWeatherList day6 = new MainWeatherList("��������10/2","����ת�� 15~20��");
    	mainWeatherList.add(day6);
    }
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
