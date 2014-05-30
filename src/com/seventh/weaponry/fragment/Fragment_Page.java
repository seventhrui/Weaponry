package com.seventh.weaponry.fragment;


import com.seventh.weaponry.R;
import com.seventh.weaponry.adapter.ListViewItemAdapter;
import com.seventh.weaponry.fun.FunAndFunType;
import com.seventh.weaponry.listener.GridViewItemClickListener;
import com.seventh.weaponry.listener.ListViewItemClickListener;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

/**
 * 
 *
 */
public class Fragment_Page extends Fragment {
	private View rootView = null;
	private GridView gv_funs;
	private ListView lv_funs;

	private static int num = 0;

	public Fragment_Page() {

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		initView(inflater, container);
		return rootView;
	}

	private void initView(LayoutInflater i, ViewGroup c) {
		num = getArguments().getInt("type");
		if (num == 0) {
			rootView = i.inflate(R.layout.fragment_gridview_page, c, false);
			gv_funs = (GridView) rootView.findViewById(R.id.gv_funs);
			SimpleAdapter sladapter = (SimpleAdapter) getGvAdapter();
			gv_funs.setAdapter(sladapter);
			gv_funs.setOnItemClickListener(new GridViewItemClickListener());
		} else if (num == 1){
			rootView = i.inflate(R.layout.fragment_listview_page, c, false);
			lv_funs = (ListView) rootView.findViewById(R.id.lv_funs);
			ListViewItemAdapter lvadapter = getLvAdapter();
			lv_funs.setAdapter(lvadapter);
			lv_funs.setOnItemClickListener(new ListViewItemClickListener());
		}
		String planet = getResources().getStringArray(R.array.planets_array)[num];
		getActivity().setTitle(planet);
	}

	
	/**
	 * Get GridView Adapter
	 * @return SimpleAdapter
	 */
	private SimpleAdapter getGvAdapter() {
		SimpleAdapter sladapter = null;
		sladapter = FunAndFunType.get_1(getActivity().getApplicationContext());
		return sladapter;
	}
	/**
	 * Get ListView Adapter
	 * @return ListViewItemAdapter
	 */
	private ListViewItemAdapter getLvAdapter() {
		ListViewItemAdapter sladapter = null;
		sladapter = FunAndFunType.get_2(getActivity().getApplicationContext());
		return sladapter;
	}
}
