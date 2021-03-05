package day10_Sync;

import java.util.*;

/**
 * 将集合或Map转换为线程安全的
 * @author zhangchi
 *
 */
public class SyncDemo5 {

	public static void main(String[] args) {
		 List<String> list=new ArrayList<String>();
		 list.add("one");
		 list.add("two");
		 list.add("three");
		 list.add("four");
		 System.out.println(list);
		 /**
		  * 将给定集合转换为线程安全的集合
		  * Collections.synchronizedList(List list)
		  */
		 list = Collections.synchronizedList(list);
		 System.out.println(list);
		
		 Set<String> set=new HashSet<String>(list);
		 /**
		  * 将给定的Set集合转换为线程安全的
		  */
		 Collections.synchronizedSet(set);
		 System.out.println(set);
		 
		 Map<String,Integer> map=new HashMap<String,Integer>();
		 map.put("语文", 99);
		 map.put("数学", 91);
		 map.put("英语", 92);
		 //将给定的Map集合转换为线程安全的
		 Collections.synchronizedMap(map);
		 System.out.println(map);
		 
		 /*
		  * API手册上有说明
		  * 就算是线程安全的集合，那么其中对于元素的操作，如:add,remove等方法都是互斥的,都有同步 
		  * 一个线程在往集合中添加元素时,其他线程无法同时增删集合中的元素
		  * 
		  * 但是增删方法不会与迭代器遍历做互斥，需要自行维护互斥关系。
		  * 遍历不会和增删互斥
		  * 
		  */
		 
		 
	}
	
}
