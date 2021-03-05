package day04_List;

import java.util.ArrayList;
/**
 * ArrayList 后缀List是父接口,ArrayList是有序的可重复的
 * 底层数据结构是数组,数组内存是连续的,所以便于数据的查找,不便于数据的增删
 * @author zhangchi
 *
 */
public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(true);
		al.add("sql");
		al.add("bigdata");
		al.add("bigdata");				
		System.out.println(al);
		ArrayList al2 = new ArrayList();	//创建ArrayList存储不重复的元素
		for(int i = 0;i < al.size() ; i++){
			Object obj = al.get(i);
			//判断新集合是否包含该对象
			//final class String{}实现了Comparable,有自带的compareTo方法
			//String str = str.compareTo(anotherString);
			if(!al2.contains(obj))
				al2.add(obj);
		}
		System.out.println(al2);
		
		
	}
}
