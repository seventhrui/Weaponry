package com.seventh.weaponry.fun;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.seventh.weaponry.R;

import android.content.Context;
import android.widget.SimpleAdapter;
/**
 * ��ʼ�˵�Ԫ��
 *
 */
public class FunAndFunType {
	static ArrayList<HashMap<String, Object>> lstImageItem =null;
	/**
	 * ���������б�
	 * @return
	 */
	public static List<String> getFunList(){
		List<String> funlist=new ArrayList<String>();
		funlist.add("һ");
		funlist.add("��");
		funlist.add("��");
		funlist.add("��");
		funlist.add("��");
		funlist.add("��");
		funlist.add("��");
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
		String[] mNames = { "һһ", "һ��", "һ��", "һ��" };
		for (int i = 0; i < mIds.length; i++) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("ItemImage", mIds[i]);// ���ͼ����Դ��ID
			map.put("ItemText", mNames[i]);// �������ItemText
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
		String[] mNames = { "��һ", "����", "����", "����", "����" };
		for (int i = 0; i < mIds.length; i++) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("ItemImage", mIds[i]);// ���ͼ����Դ��ID
			map.put("ItemText", mNames[i]);// �������ItemText
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
		String[] mNames = { "��һ", "����", "����", "����", "����","����" };
		for (int i = 0; i < mIds.length; i++) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("ItemImage", mIds[i]);// ���ͼ����Դ��ID
			map.put("ItemText", mNames[i]);// �������ItemText
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
		String[] mNames = { "��һ", "�Ķ�", "����", "����"};
		for (int i = 0; i < mIds.length; i++) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("ItemImage", mIds[i]);// ���ͼ����Դ��ID
			map.put("ItemText", mNames[i]);// �������ItemText
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
		String[] mNames = { "��һ", "���", "����", "����","����"};
		for (int i = 0; i < mIds.length; i++) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("ItemImage", mIds[i]);// ���ͼ����Դ��ID
			map.put("ItemText", mNames[i]);// �������ItemText
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
		String[] mNames = { "��һ", "����"};
		for (int i = 0; i < mIds.length; i++) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("ItemImage", mIds[i]);// ���ͼ����Դ��ID
			map.put("ItemText", mNames[i]);// �������ItemText
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
		String[] mNames = { "��һ", "�߶�","����","����","����"};
		for (int i = 0; i < mIds.length; i++) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("ItemImage", mIds[i]);// ���ͼ����Դ��ID
			map.put("ItemText", mNames[i]);// �������ItemText
			lstImageItem.add(map);
		}
		SimpleAdapter saImageItems = new SimpleAdapter(context, lstImageItem,
				R.layout.item_grid_startmenu,
				new String[] { "ItemImage", "ItemText" }, new int[] {
						R.id.ItemImage, R.id.ItemText });
		return saImageItems;
	}
}
