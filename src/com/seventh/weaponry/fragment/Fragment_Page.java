package com.seventh.weaponry.fragment;

import java.util.HashMap;

import com.seventh.weaponry.R;
import com.seventh.weaponry.fun.FunAndFunType;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

/**
 * 
 *
 */
public class Fragment_Page extends Fragment {
	private View rootView=null;
	private GridView gv_funs;
	
	private static int num=0;
    public Fragment_Page() {
    	
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_page, container, false);
        initView();
        initListener();
        return rootView;
    }
    private void initView(){
    	num=getArguments().getInt("type");
    	gv_funs=(GridView) rootView.findViewById(R.id.gv_funs);
    	SimpleAdapter sladapter=getGvAdapter(num);
    	gv_funs.setAdapter(sladapter);
    	String planet = getResources().getStringArray(R.array.planets_array)[num];
        getActivity().setTitle(planet);
    }
    private void initListener(){
    	gv_funs.setOnItemClickListener(oicl);
    }
    /**
     * GridView µã»÷¼àÌý
     */
    OnItemClickListener oicl=new OnItemClickListener() {
		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			HashMap<String, Object> item = (HashMap<String, Object>) arg0.getItemAtPosition(arg2);
			String imgName = (String) item.get("ItemText");
			Toast.makeText(getActivity().getApplicationContext(), imgName, Toast.LENGTH_SHORT).show();
		}
	};
    private SimpleAdapter getGvAdapter(int type){
		SimpleAdapter sladapter=null;
		switch (type){
		case 0:
			sladapter=FunAndFunType.get_1(getActivity().getApplicationContext());
			break;
		case 1:
			sladapter=FunAndFunType.get_2(getActivity().getApplicationContext());
			break;
		case 2:
			sladapter=FunAndFunType.get_3(getActivity().getApplicationContext());
			break;
		case 3:
			sladapter=FunAndFunType.get_4(getActivity().getApplicationContext());
			break;
		case 4:
			sladapter=FunAndFunType.get_5(getActivity().getApplicationContext());
			break;
		case 5:
			sladapter=FunAndFunType.get_6(getActivity().getApplicationContext());
			break;
		case 6:
			sladapter=FunAndFunType.get_7(getActivity().getApplicationContext());
			break;
		}
		return sladapter;
	}
}
