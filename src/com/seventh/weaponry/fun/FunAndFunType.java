package com.seventh.weaponry.fun;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.seventh.weaponry.R;

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
	 * 1gv
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
				R.layout.item_grid_startmenu,
				new String[] { "ItemImage", "ItemText" }, new int[] {
						R.id.ItemImage, R.id.ItemText });
		return saImageItems;
	}
	
	/**
	 * 2gv
	 * @param context
	 * @return
	 */
	public static SimpleAdapter get_2(Context context){
		lstImageItem = new ArrayList<HashMap<String, Object>>();
		Integer[] mIds = { R.drawable.ic_2, R.drawable.ic_2,R.drawable.ic_2, R.drawable.ic_2, R.drawable.ic_2 };
		String[] mNames = { "二一", "二二", "二三", "二四", "二五" };
		for (int i = 0; i < mIds.length; i++) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("ItemImage", mIds[i]);// 添加图像资源的ID
			map.put("ItemText", mNames[i]);// 按序号做ItemText
			lstImageItem.add(map);
		}
		SimpleAdapter saImageItems = new SimpleAdapter(context, lstImageItem,
				R.layout.item_grid_startmenu,
				new String[] { "ItemImage", "ItemText" }, new int[] {
						R.id.ItemImage, R.id.ItemText });
		return saImageItems;
	}
	
	/**
	 * 3gv
	 * @param context
	 * @return
	 */
	public static SimpleAdapter get_3(Context context){
		lstImageItem = new ArrayList<HashMap<String, Object>>();
		Integer[] mIds = { R.drawable.ic_3, R.drawable.ic_3, R.drawable.ic_3,R.drawable.ic_3, R.drawable.ic_3, R.drawable.ic_3 };
		String[] mNames = { "三一", "三二", "三三", "三四", "三五","三六" };
		for (int i = 0; i < mIds.length; i++) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("ItemImage", mIds[i]);// 添加图像资源的ID
			map.put("ItemText", mNames[i]);// 按序号做ItemText
			lstImageItem.add(map);
		}
		SimpleAdapter saImageItems = new SimpleAdapter(context, lstImageItem,
				R.layout.item_grid_startmenu,
				new String[] { "ItemImage", "ItemText" }, new int[] {
						R.id.ItemImage, R.id.ItemText });
		return saImageItems;
	}
	
	/**
	 * 4gv
	 * @param context
	 * @return
	 */
	public static SimpleAdapter get_4(Context context){
		lstImageItem = new ArrayList<HashMap<String, Object>>();
		Integer[] mIds = { R.drawable.ic_4, R.drawable.ic_4,R.drawable.ic_4, R.drawable.ic_4 };
		String[] mNames = { "四一", "四二", "四三", "四四"};
		for (int i = 0; i < mIds.length; i++) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("ItemImage", mIds[i]);// 添加图像资源的ID
			map.put("ItemText", mNames[i]);// 按序号做ItemText
			lstImageItem.add(map);
		}
		SimpleAdapter saImageItems = new SimpleAdapter(context, lstImageItem,
				R.layout.item_grid_startmenu,
				new String[] { "ItemImage", "ItemText" }, new int[] {
						R.id.ItemImage, R.id.ItemText });
		return saImageItems;
	}
	
	/**
	 * 5gv
	 * @param context
	 * @return
	 */
	public static SimpleAdapter get_5(Context context){
		lstImageItem = new ArrayList<HashMap<String, Object>>();
		Integer[] mIds = { R.drawable.ic_5, R.drawable.ic_5, R.drawable.ic_5,R.drawable.ic_5, R.drawable.ic_5 };
		String[] mNames = { "五一", "五二", "五三", "五四","五五"};
		for (int i = 0; i < mIds.length; i++) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("ItemImage", mIds[i]);// 添加图像资源的ID
			map.put("ItemText", mNames[i]);// 按序号做ItemText
			lstImageItem.add(map);
		}
		SimpleAdapter saImageItems = new SimpleAdapter(context, lstImageItem,
				R.layout.item_grid_startmenu,
				new String[] { "ItemImage", "ItemText" }, new int[] {
						R.id.ItemImage, R.id.ItemText });
		return saImageItems;
	}
	
	/**
	 * 6gv
	 * @param context
	 * @return
	 */
	public static SimpleAdapter get_6(Context context){
		lstImageItem = new ArrayList<HashMap<String, Object>>();
		Integer[] mIds = { R.drawable.ic_6, R.drawable.ic_6 };
		String[] mNames = { "六一", "六二"};
		for (int i = 0; i < mIds.length; i++) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("ItemImage", mIds[i]);// 添加图像资源的ID
			map.put("ItemText", mNames[i]);// 按序号做ItemText
			lstImageItem.add(map);
		}
		SimpleAdapter saImageItems = new SimpleAdapter(context, lstImageItem,
				R.layout.item_grid_startmenu,
				new String[] { "ItemImage", "ItemText" }, new int[] {
						R.id.ItemImage, R.id.ItemText });
		return saImageItems;
	}
	
	/**
	 * 7gv
	 * @param context
	 * @return
	 */
	public static SimpleAdapter get_7(Context context){
		lstImageItem = new ArrayList<HashMap<String, Object>>();
		Integer[] mIds = {R.drawable.ic_7, R.drawable.ic_7, R.drawable.ic_7,R.drawable.ic_7, R.drawable.ic_7 };
		String[] mNames = { "七一", "七二","七三","七四","七五"};
		for (int i = 0; i < mIds.length; i++) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("ItemImage", mIds[i]);// 添加图像资源的ID
			map.put("ItemText", mNames[i]);// 按序号做ItemText
			lstImageItem.add(map);
		}
		SimpleAdapter saImageItems = new SimpleAdapter(context, lstImageItem,
				R.layout.item_grid_startmenu,
				new String[] { "ItemImage", "ItemText" }, new int[] {
						R.id.ItemImage, R.id.ItemText });
		return saImageItems;
	}
}
