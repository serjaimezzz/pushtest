package day04_List;

import java.util.ArrayList;
import java.util.Comparator;

import day04_List.*;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student("张三",21));
		list.add(new Student("李四",22));
		list.add(new Student("王五",23));
		list.add(new Student("赵六",24));
		list.add(new Student("王五",23));
		list.add(new Student("王五",23));
		System.out.println(list);
		
		ArrayList list2 = removeDup(list);		
		System.out.println(list2);
				
	}
	
	//去重
	public static ArrayList removeDup(ArrayList list){
		ArrayList list2 = new ArrayList();			//创建新List用于存放不重复的元素
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);	//获取集合中指定下标的元素--每个new出来的Student对象
//			System.out.println(obj);
//			System.out.println(!list2.contains(obj));
			//判断集合是否包含该对象
			if(!list2.contains(obj)){		//默认调用System中的contains方法
				list2.add(obj);				//在Student中重写equals方法
//			return list2;		
			}
		}
		return list2;		
	}
	
}



