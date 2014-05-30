package com.seventh.weaponry.fun;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.seventh.weaponry.R;
import com.seventh.weaponry.adapter.ListViewItemAdapter;

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
	 * GridView
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
		String[] strs={"��һ", "����", "����", "����", "����"};
		for(int i=0;i<strs.length;i++){
			lsitem.add(strs[i]);
		}
		ListViewItemAdapter lvia=new ListViewItemAdapter(context,lsitem);
		return lvia;
		
	}
	
}
