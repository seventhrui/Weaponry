package com.seventh.weaponry.listener;

import java.util.HashMap;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class GridViewItemClickListener implements GridView.OnItemClickListener {
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		HashMap<String, Object> item = (HashMap<String, Object>) arg0
				.getItemAtPosition(arg2);
		String imgName = (String) item.get("ItemText");
		Log.v("----aaa--->>", imgName);
	}
}
