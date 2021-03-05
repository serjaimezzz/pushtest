package day05_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * java.util.Map
 * Map看起来像是一个多行两列的表格，以key-value对的形式存放元素,允许key(null)-value(null)
 * 在Map中key不允许重复(重复是依靠key的equals判断),value可以重复
 * 常用的实现类为:HashMap
 * @author zhangchi
 *
 */
public class MapDemo1 {
	public static void main(String[] args) {	
		//int value=map.put("语文", 99).intValue();
		Map<String,Integer> map=new HashMap<String,Integer>();
		Integer value=map.put("语文", 99);	//返回的是上一次添加的相同key名的键值对的值
		prt("value1:"+value);		//全新key的返回值是null,要调null返回int value,会引发空指针异常
		
		value=map.put("语文", 90);//替换原value
		prt("value2:"+value);//key不能重复
		System.out.println(map);
		/*
		 * V put(K k,V v)
		 * 将给定的key-value对存入Map
		 * 由于Map要求不允许key重复，所以使用Map已有的key存入一个新的value时的操作是替换value，
		 * 那么返回值为该key原来对应的value。若是一个新的key，则返回值为null。
		 * 
		 * V putIfAbsent(K key,V value)
		 * 如果集合中key值不存在,则添加
		 */		
		map.putIfAbsent("数学", 98);
		map.putIfAbsent("英语", 97);
		/*
		 *	void putAll()
		 *	把接收的集合中的所有键值对添加到当前集合中 
		 */
		Map<String,Integer> m = new HashMap<>();
		m.putIfAbsent("物理", 96);
		m.putIfAbsent("化学", 99);
		m.putIfAbsent("物理", 90);
		System.out.println(map);
		map.putAll(m);		//把m全部放在map中
		System.out.println(map);
		
		/*
		 * V get(K k)
		 * 根据给定的key获取对应的value,若当前Map中没有给定的key,则返回值为null
		 */
		value=map.get("体育");	//当前key不存在,返回null
		prt("体育"+value);
		value=map.get("数学");
		prt("数学:"+value);
		
		//如果不存在替换成所给的值,如果存在保持原值
		value = map.getOrDefault("体育", 110);
		prt("value:"+value);
		
		/*
		 * V remove(K k)
		 * 删除给定的key所对应的key-value对。
		 * 返回值为被删除的key-value对中的value
		 */
		value=map.remove("数学");
		System.out.println("old:"+value);
		System.out.println(map);	
		
		boolean b = map.remove("化学",99);	//key-value都匹配时删除,成功删除返回true
		prt("b:"+b);
		
		//default V replace(K key, V value)
		map.replace("英语",100);	//更改key的value值
		System.out.println(map);
		
		//boolean replace(K key, V oldValue, V newValue)
		map.replace("物理", 96,80 );
		System.out.println(map);
		
		/** map.replaceAll(function);
		   void replaceAll
		   (BiFunction <? super K  ,  ? super V  ,  ? extends V> function)
		 集合中的每个键值对会依次传给参数K,V
		   返回值用来替换原来的值
		*/
		map.replaceAll((k,v) -> {
			if("物理".equals(k))
			return 0;
			return v;
		}
		);
		System.out.println("all:"+map);
		
		//int size()
		prt("size:"+map.size());
		
		//查询所有的值
		Collection<Integer> val = map.values();
		for (Integer integer : val) {
			System.out.println("val:"+integer);
		}
		System.out.println();
		
		/*
		 * 查询是否包含所查询的键/值
		 */
		map.containsKey("");
		map.containsValue(90);
		System.out.println("isEmpty:"+map.isEmpty());
		
	}
	
	public static void prt(String str){
		System.out.println(str);
	}
	
}
