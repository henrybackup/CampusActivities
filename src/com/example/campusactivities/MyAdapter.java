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
        map.put("title", "一起看星星");                                               
        map.put("time", "时间:今晚9.30开始");
        map.put("place", "地点:华软足球场草坪");
        map.put("discribe", "描述:一起开始一场浪漫的邂逅吧");
        map.put("num", "520");
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("icon", R.drawable.crystal);  
        map.put("title", "明天有人去爬白云山吗");                                               
        map.put("time", "时间:早上10点");
        map.put("place", "地点:天河客运站集合");
        map.put("discribe", "描述:听习大大的话，早睡早起锻炼身体！");
        map.put("num", "13");
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("icon", R.drawable.bbb);  
        map.put("title", "观战WCG,顺便去旅游");                                               
        map.put("time", "时间:2月10号集合");
        map.put("place", "地点:韩国釜山");
        map.put("discribe", "描述:想看faker被人吊打吗，哼哼");
        map.put("num", "1360");
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("icon", R.drawable.eunen);  
        map.put("title", "最近好冷，有人去烧烤吗");                                               
        map.put("time", "时间:星期6下午一点");
        map.put("place", "地点:珠江学院，水汀");
        map.put("discribe", "描述:烧鸡翅我最喜欢吃了！");
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

	

