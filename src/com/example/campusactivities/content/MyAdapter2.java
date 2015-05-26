package com.example.campusactivities.content;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.campusactivities.R;



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

public class MyAdapter2 extends BaseAdapter {
	 private LayoutInflater mInflater;
	 private List<Map<String, Object>> mData;
	 private Context context=null;
	
	
	public MyAdapter2(Context context ) {
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
        map.put("icon", R.drawable.boa);  
        map.put("like", R.drawable.cakecolor);                                               
        map.put("name", "Mitis");
        map.put("comment", "中“锱铢积累”而成的，小说“从他熟悉的时代、熟悉的地方、熟悉的社会阶层取材。但组成故事的人物和情节全属虚构");
        map.put("num", "90");
        map.put("time", "44分钟前");
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("icon", R.drawable.crystal);  
        map.put("like", R.drawable.cakecolor); 
        map.put("name", "Skrillex");
        map.put("comment", "但两个人都没有方鸿渐的经历，倒是作者自己的经历，比如出国留学、担任大学教授，与作品有相合之处，作者可能从他们身上获得了些启示，局发生地变成v去大撒旦擦擦阿达撒打算的确更让她更过分地方二哥突然擦爱上大声地");
        map.put("num", "1000");
        map.put("time", "10分钟前");
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("icon", R.drawable.eunen); 
        map.put("like", R.drawable.cakecolor);  
        map.put("name", "Mitis2");
        map.put("comment", "主线程行政村在周星驰a阿萨德啊发三大武器地v但两个人都没有方鸿渐的经历，倒是作者自己的经历，比如出国留学、担任大学教授，与作品有相合之处，作者可能从他们身上获得了些启示，方啊啊快节奏i才叫做");
        map.put("num", "605");
        map.put("time", "1小时前");
        list.add(map);
        
        map = new HashMap<String, Object>();
        
        map.put("icon", R.drawable.xinyu);               
        map.put("name", "skrillex");
        map.put("like", R.drawable.cakecolor); 
        map.put("comment", "相互倾轧、争风吃醋，种种丑象让赵辛楣、方鸿渐十分反感，先后离开。方鸿渐被学校解聘后，和孙柔嘉一同离开三闾大学，在赵辛楣的劝说下，结婚后回到上海额外企鹅我去的撒旦撒旦撒勖哉沧ughdgd傻傻地房顶上擦擦啊三撒打算洲心");
        map.put("num", "109");
        map.put("time", "2天前");
        list.add(map);
        

        
        return list;
    }
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		
		ViewHolder2 holder = null;
        if (convertView == null) {
             
            holder=new ViewHolder2();  
             
            convertView = mInflater.inflate(R.layout.comment_for_each, null);
            holder.icon = (ImageView)convertView.findViewById(R.id.c_icon);
            holder.like = (ImageView)convertView.findViewById(R.id.c_like);
            holder.name = (TextView)convertView.findViewById(R.id.c_name);
            holder.comment = (TextView)convertView.findViewById(R.id.c_comment);
            holder.num = (TextView)convertView.findViewById(R.id.c_num);
            holder.time = (TextView)convertView.findViewById(R.id.c_time);
            convertView.setTag(holder);
             
        }else {
             
            holder = (ViewHolder2)convertView.getTag();
        }
         
         
        holder.icon.setBackgroundResource((Integer)mData.get(position).get("icon"));
        holder.like.setBackgroundResource((Integer)mData.get(position).get("like"));
        holder.name.setText((String)mData.get(position).get("name"));
        holder.comment.setText((String)mData.get(position).get("comment"));
        holder.num.setText((String)mData.get(position).get("num"));
        holder.time.setText((String)mData.get(position).get("time"));
         
        
              
         
        return convertView;
    }
	
	
	}

	

