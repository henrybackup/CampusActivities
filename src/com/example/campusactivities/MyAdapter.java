package com.example.campusactivities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
	 private LayoutInflater mInflater;
	 private List<Map<String, Object>> mData;
	 private Context context=null;
	
	
	public MyAdapter(Context context ) {
		 this.mInflater = LayoutInflater.from(context);
		 this.mData=getData();
		 this.context=context;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mData.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}
	private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
 
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("icon", R.drawable.aaa);  
        map.put("title", "һ������");                                               
        map.put("time", "ʱ��:����9.30��ʼ");
        map.put("place", "�ص�:�������򳡲�ƺ");
        map.put("discribe", "����:һ��ʼһ�����������˰�");
        map.put("num", "520");
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("icon", R.drawable.crystal);  
        map.put("title", "��������ȥ������ɽ��");                                               
        map.put("time", "ʱ��:����10��");
        map.put("place", "�ص�:��ӿ���վ����");
        map.put("discribe", "����:��ϰ���Ļ�����˯����������壡");
        map.put("num", "13");
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("icon", R.drawable.bbb);  
        map.put("title", "��սWCG,˳��ȥ����");                                               
        map.put("time", "ʱ��:2��10�ż���");
        map.put("place", "�ص�:������ɽ");
        map.put("discribe", "����:�뿴faker���˵����𣬺ߺ�");
        map.put("num", "1360");
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("icon", R.drawable.eunen);  
        map.put("title", "������䣬����ȥ�տ���");                                               
        map.put("time", "ʱ��:����6����һ��");
        map.put("place", "�ص�:�齭ѧԺ��ˮ͡");
        map.put("discribe", "����:�ռ�������ϲ�����ˣ�");
        map.put("num", "520");
        list.add(map);
        

        
        return list;
    }
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		
		ViewHolder holder = null;
        if (convertView == null) {
             
            holder=new ViewHolder();  
             
            convertView = mInflater.inflate(R.layout.each_activities_item, null);
            holder.icon = (ImageView)convertView.findViewById(R.id.cia_icon);
            holder.title = (TextView)convertView.findViewById(R.id.cia_title);
            holder.time = (TextView)convertView.findViewById(R.id.cia_time);
            holder.place = (TextView)convertView.findViewById(R.id.cia_place);
            holder.discribe = (TextView)convertView.findViewById(R.id.cia_discribe);
            holder.num = (TextView)convertView.findViewById(R.id.cia_num);
           
            convertView.setTag(holder);
             
        }else {
             
            holder = (ViewHolder)convertView.getTag();
        }
         
         
        holder.icon.setBackgroundResource((Integer)mData.get(position).get("icon"));
        holder.title.setText((String)mData.get(position).get("title"));
        holder.time.setText((String)mData.get(position).get("time"));
        holder.place.setText((String)mData.get(position).get("place"));
        holder.discribe.setText((String)mData.get(position).get("discribe"));
        holder.num.setText((String)mData.get(position).get("num"));
         
        
              
         
        return convertView;
    }
	
	
	}

	

