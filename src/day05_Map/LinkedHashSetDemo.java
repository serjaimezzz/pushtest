package day05_Map;

import java.util.*;
/**
 * List:有序可重复
 * Set:无序,不可重复
 * LinkedHashSet:有序不可重复
 * LinkedHashMap:
 * @author zhangchi
 *
 */
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		/**
		 * 链表 + 哈希表	实现的存储,保证了有序
		 */
		LinkedHashSet ls = new LinkedHashSet();
		ls.add("hello");
		ls.add("bigdata");
		ls.add("sql");
		System.out.println(ls);
		
		LinkedHashMap lm = new LinkedHashMap();
		lm.put("name", "zhangchi");
		lm.put("age", "22");
		
		//得到线程安全的各种集合对象
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		
		
		Set<String> set = Collections.synchronizedSet(new HashSet<String>());
			
		//返回多线程安全的Map
		Map<String,String> map = Collections.synchronizedMap(new HashMap<String,String>());
		
	}
}
