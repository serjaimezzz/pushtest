package day04_List;

import java.util.ArrayList;
import java.util.List;

/**
 * List集合提供了一对重载的add,remove方法
 * void add(int index,E e)
 * 将给定元素插入到指定位置。
 * 
 * E remove(int index)
 * 从集合中删除指定位置的元素,并将其返回
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
