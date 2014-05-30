package com.seventh.weaponry.fun;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.seventh.weaponry.R;
import com.seventh.weaponry.adapter.ListViewItemAdapter;

import android.content.Context;
import android.widget.SimpleAdapter;
/**
 * 开始菜单元素
 *
 */
public class FunAndFunType {
	static ArrayList<HashMap<String, Object>> lstImageItem =null;
	/**
	 * 功能类型列表
	 * @return
	 */
	public static List<String> getFunList(){
		List<String> funlist=new ArrayList<String>();
		funlist.add("一");
		funlist.add("二");
		funlist.add("三");
		funlist.add("四");
		funlist.add("五");
		funlist.add("六");
		funlist.add("七");
		return funlist;
	}
	/**
	 * GridView
	 * @param context
	 * @return
	 */
	public static SimpleAdapter get_1(Context context){
		lstImageItem = new ArrayList<HashMap<String, Object>>();
		Integer[] mIds = { R.drawable.ic_1,R.drawable.ic_1, R.drawable.ic_1, R.drawable.ic_1 };
		String[] mNames = { "一一", "一二", "一三", "一四" };
		for (int i = 0; i < mIds.length; i++) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("ItemImage", mIds[i]);// 添加图像资源的ID
			map.put("ItemText", mNames[i]);// 按序号做ItemText
			lstImageItem.add(map);
		}
		SimpleAdapter saImageItems = new SimpleAdapter(context, lstImageItem,
				R.layout.item_gridview,
				new String[] { "ItemImage", "ItemText" }, new int[] {
						R.id.ItemImage, R.id.ItemText });
		return saImageItems;
	}
	
	/**
	 * ListView
	 * @param context
	 * @return
	 */
	public static ListViewItemAdapter get_2(Context context){
		List<String> lsitem=new ArrayList<String>();
		String[] strs={"二一", "二二", "二三", "二四", "二五"};
		for(int i=0;i<strs.length;i++){
			lsitem.add(strs[i]);
		}
		ListViewItemAdapter lvia=new ListViewItemAdapter(context,lsitem);
		return lvia;
		
	}
	
}
