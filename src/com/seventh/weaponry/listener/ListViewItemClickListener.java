package com.seventh.weaponry.listener;

import com.seventh.weaponry.R;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class ListViewItemClickListener implements ListView.OnItemClickListener {
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		TextView tv=(TextView) arg1.findViewById(R.id.tv_lv_ItemText);
		String s = tv.getText().toString();
		Log.v("----a---->>", s);
	}
}
