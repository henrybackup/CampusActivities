package com.newversion.campusactivities;

import android.app.Activity;
import android.opengl.Visibility;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewStub;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

import com.example.campusactivities.R;

public class NewVersionCreateActivity extends Activity {
	private TextView go_where;
	private TextView detail;
	private EditText detailEditText;
	private int go_where_memory = 1;
	private int detail_memory = 1;
	private ViewStub viewStub;
	private View inflatedView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.newversion_create_activity);
		detail = (TextView) findViewById(R.id.tx_detail);
		go_where = (TextView) findViewById(R.id.tx_where);
		detailEditText = (EditText) findViewById(R.id.ed_detail);
		detail.setOnClickListener(new OnClickListener() {
			// 这里需要实现的功能是：点一下展开，再点一下缩回。注意逻辑。。
			@Override
			public void onClick(View v) {
			

				if (detail_memory == 1) {
					detailEditText.setVisibility(View.VISIBLE);
					detail_memory = 0;
				} else {
					detailEditText.setVisibility(View.GONE);
					detail_memory = 1;
				}

			}
		});
		go_where.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				viewStub = (ViewStub) findViewById(R.id.stub_where);
				if (viewStub != null) {
					inflatedView = viewStub.inflate();
				}
				if (go_where_memory == 1) {

					inflatedView.setVisibility(View.VISIBLE);
					go_where_memory = 0;
				}

				else {
					inflatedView.setVisibility(View.GONE);
					inflatedView.destroyDrawingCache();
					go_where_memory = 1;
				}
				
			}
		});
	}
}
