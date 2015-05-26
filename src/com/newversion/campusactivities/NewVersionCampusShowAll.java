package com.newversion.campusactivities;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.ViewConfiguration;
import android.view.Window;

import com.example.campusactivities.R;
import com.newversion.fragment.HotFragment;
import com.newversion.fragment.LatestFragment;
import com.newversion.tabstrip.PagerSlidingTabStrip;

public class NewVersionCampusShowAll extends FragmentActivity {
	private HotFragment hotFragment;

	private LatestFragment latestFragment;

	private PagerSlidingTabStrip tabs;

	private DisplayMetrics dm;
	private MenuItem createActivityItem;
	private MenuItem myActivityItem;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.newversion_campus_show_all);

		setOverflowShowingAlways();
		dm = getResources().getDisplayMetrics();
		ViewPager pager = (ViewPager) findViewById(R.id.pager);
		tabs = (PagerSlidingTabStrip) findViewById(R.id.tabs);
		pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));

		tabs.setViewPager(pager);
		setTabsValue();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		getMenuInflater().inflate(R.menu.campus_activities, menu);
		initItemView(menu);
		createActivityItem
				.setOnMenuItemClickListener(new OnMenuItemClickListener() {

					@Override
					public boolean onMenuItemClick(MenuItem item) {
						// TODO Auto-generated method stub
						Intent intent = new Intent();
						intent.setClass(NewVersionCampusShowAll.this,
								NewVersionCreateActivity.class);
						startActivity(intent);
						return false;
					}
				});
		return true;
	}

	public void initItemView(Menu menu) {

		createActivityItem = menu.findItem(R.id.create_activity);
		myActivityItem = menu.findItem(R.id.my_activity);

	}

	private void setTabsValue() {
		// 设置Tab是自动填充满屏幕的
		tabs.setShouldExpand(true);

		// 设置Tab的分割线是透明的
		// tabs.setDividerColor(Color.TRANSPARENT);
		// 设置Tab底部线的高度
		tabs.setUnderlineHeight((int) TypedValue.applyDimension(
				TypedValue.COMPLEX_UNIT_DIP, 0, dm));
		// 设置Tab Indicator的高度
		// tabs.setIndicatorHeight((int) TypedValue.applyDimension(
		// TypedValue.COMPLEX_UNIT_DIP, 4, dm));
		// 设置Tab标题文字的大小
		tabs.setTextSize((int) TypedValue.applyDimension(
				TypedValue.COMPLEX_UNIT_SP, 16, dm));
		// 设置Tab Indicator的颜色
		tabs.setIndicatorColor(Color.TRANSPARENT);
		// 设置选中Tab文字的颜色 (这是我自定义的一个方法)
		tabs.setSelectedTextColor(Color.parseColor("#FFFFFF"));

		// 自己定义的，666666！
		tabs.setSelectedTextBackground(Color.parseColor("#8DEEEE"));
		// 取消点击Tab时的背景色
		// tabs.setTabBackground(0);
		tabs.setBackgroundColor(Color.parseColor("#FFFFFF"));
		tabs.setTextColor(Color.parseColor("#8DEEEE"));

	}

	@Override
	public boolean onMenuOpened(int featureId, Menu menu) {
		if (featureId == Window.FEATURE_ACTION_BAR && menu != null) {
			if (menu.getClass().getSimpleName().equals("MenuBuilder")) {
				try {
					Method m = menu.getClass().getDeclaredMethod(
							"setOptionalIconsVisible", Boolean.TYPE);
					m.setAccessible(true);
					m.invoke(menu, true);
				} catch (Exception e) {
				}
			}
		}
		return super.onMenuOpened(featureId, menu);
	}

	public class MyPagerAdapter extends FragmentPagerAdapter {

		public MyPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		private final String[] titles = { "热门", "最新" };

		@Override
		public CharSequence getPageTitle(int position) {
			return titles[position];
		}

		@Override
		public int getCount() {
			return titles.length;
		}

		@Override
		public Fragment getItem(int position) {
			switch (position) {
			case 0:
				if (hotFragment == null) {
					hotFragment = new HotFragment();
				}
				return hotFragment;
			case 1:
				if (latestFragment == null) {
					latestFragment = new LatestFragment();
				}
				return latestFragment;

			default:
				return null;
			}
		}

	}

	private void setOverflowShowingAlways() {
		try {
			ViewConfiguration config = ViewConfiguration.get(this);
			Field menuKeyField = ViewConfiguration.class
					.getDeclaredField("sHasPermanentMenuKey");
			menuKeyField.setAccessible(true);
			menuKeyField.setBoolean(config, false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
