package com.example.campusactivities;





import com.example.campusactivities.content.MyAdapter2;

import android.os.Bundle;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

public class CampusActivities extends Activity {
private View v;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activities_content);
//		 MyAdapter adapter=new MyAdapter(this);
//		ListView list=(ListView)findViewById(R.id.cia_listview);
//		list.setAdapter(adapter);
//		
		
		MyAdapter2 adapter2=new MyAdapter2(this);
		ListView list=(ListView)findViewById(R.id.cia_comment_list);
 		LayoutInflater inflater2=getLayoutInflater();
 		v=inflater2.inflate(R.layout.list_head, null);		
 		list.addHeaderView(v); 		
 		list.setAdapter(adapter2);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.campus_activities, menu);
		return true;
	}

}
