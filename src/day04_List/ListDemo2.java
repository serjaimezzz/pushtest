package day04_List;

import java.util.ArrayList;
import java.util.List;

/**
 * List�����ṩ��һ�����ص�add,remove����
 * void add(int index,E e)
 * ������Ԫ�ز��뵽ָ��λ�á�
 * 
 * E remove(int index)
 * �Ӽ�����ɾ��ָ��λ�õ�Ԫ��,�����䷵��
 * @author zhangchi
 *
 */
public class ListDemo2 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		
		list.add(1, "2");
		System.out.println(list);
		
		String old=list.remove(2);
		System.out.println(list);
		System.out.println("old:"+old);
		
		
		
		
		
		
	}
}
