package com.seventh.weaponry.adapter;

import java.util.List;

import com.seventh.weaponry.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListViewItemAdapter extends BaseAdapter {
	
	private Context context;
	private LayoutInflater layoutInflater;
	private List<String> list;

	// ���췽��������list���ݵľ�����һ�����ݵ���Ϣ
	public ListViewItemAdapter(Context context, List<String> list) {
		this.context = context;
		layoutInflater = LayoutInflater.from(context);
		this.list = list;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return this.list != null ? this.list.size() : 0;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return this.list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			convertView = layoutInflater.inflate(
					R.layout.item_listview, null);
		}
		TextView tv_itemtext = (TextView) convertView
				.findViewById(R.id.tv_lv_ItemText);
		
		tv_itemtext.setText(list.get(position).toString());
		
		return convertView;
	}

}
