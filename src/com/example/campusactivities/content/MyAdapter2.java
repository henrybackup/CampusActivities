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
        map.put("comment", "�С��������ۡ����ɵģ�С˵��������Ϥ��ʱ������Ϥ�ĵط�����Ϥ�����ײ�ȡ�ġ�����ɹ��µ���������ȫ���鹹");
        map.put("num", "90");
        map.put("time", "44����ǰ");
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("icon", R.drawable.crystal);  
        map.put("like", R.drawable.cakecolor); 
        map.put("name", "Skrillex");
        map.put("comment", "�������˶�û�з��轥�ľ��������������Լ��ľ��������������ѧ�����δ�ѧ���ڣ�����Ʒ�����֮�������߿��ܴ��������ϻ����Щ��ʾ���ַ����ر��vȥ���������������������ȷ�����������ֵط�����ͻȻ�����ϴ�����");
        map.put("num", "1000");
        map.put("time", "10����ǰ");
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("icon", R.drawable.eunen); 
        map.put("like", R.drawable.cakecolor);  
        map.put("name", "Mitis2");
        map.put("comment", "���߳������������ǳ�a�����°�������������v�������˶�û�з��轥�ľ��������������Լ��ľ��������������ѧ�����δ�ѧ���ڣ�����Ʒ�����֮�������߿��ܴ��������ϻ����Щ��ʾ�������������i�Ž���");
        map.put("num", "605");
        map.put("time", "1Сʱǰ");
        list.add(map);
        
        map = new HashMap<String, Object>();
        
        map.put("icon", R.drawable.xinyu);               
        map.put("name", "skrillex");
        map.put("like", R.drawable.cakecolor); 
        map.put("comment", "�໥����������Դף����ֳ���������鹡����轥ʮ�ַ��У��Ⱥ��뿪�����轥��ѧУ��Ƹ�󣬺������һͬ�뿪���̴�ѧ��������鹵�Ȱ˵�£�����ص��Ϻ����������ȥ���������������ղ�ughdgdɵɵ�ط����ϲ�����������������");
        map.put("num", "109");
        map.put("time", "2��ǰ");
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

	

