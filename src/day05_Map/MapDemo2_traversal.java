package day05_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map 没有迭代器
 * 遍历Map:
 * 1.遍历所有的key
 * 2.遍历所有的key-value对:
 * 	   得到每个键值对对应的映射关系类型()的数据,存到一个Set集合中,并返回该集合
 * 	 使用迭代器遍历该Set集合,每次遍历出的是一个Map.Entry类型的数据,从该数据值既能得到key,也能得到value
 * 		Entry数据类型,是定义在Map内部的一个静态接口,Entry是对Map内部键值对映射关系的描述
 * 		所以定义在了Map的内部
 * 3.遍历所有的value(相对不常用)
 * 
 * @author zhangchi
 *
 */
public class MapDemo2_traversal {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("语文", 99);
		map.put("数学", 98);
		map.put("英语", 97);
		map.put("物理", 96);
		map.put("化学", 95);
		System.out.println(map);	
		
		/**
		 * 遍历所有的key
		 * Set<K> keySet()
		 * 该方法会将当前Map中的所有的key存入一个Set集合后返回。
		 * 那么遍历该集合就等于遍历了所有的key
		 */		
		Set<String> keys=map.keySet();
		for(String key : keys){
			System.out.println(key + "=" + map.get(key));
		}
		System.out.println();
		
		Iterator<String> ite = keys.iterator();
		while(ite.hasNext()){
			String key = ite.next();
			Integer i = map.get(key);
			System.out.println(key+"="+i);
		}
		System.out.println();
		/**
		 * 遍历每一组键值对
		 * Map中每一组键值对都是由Map的内部类:
		 * java.util.Map.Entry的一个实例表示的。
		 * Entry有两个方法:getKey,getValue,可以分别获取这一组键值对中的key与value
		 * 
		 * Set<Entry> entrySet
		 * 该方法会将Map中每一组键值对(Entry实例)存入一个Set集合后返回。
		 * Entry:Map的一个内部接口
		 */
		Set<Entry<String,Integer>> entrySet=map.entrySet();
		
		for(Entry<String,Integer> e:entrySet){
			String key=e.getKey();
			Integer value=e.getValue();
			System.out.println(key+":"+value);
			
		}
		System.out.println();
		
		/**
		 * 遍历所有的value
		 * Collection values()
		 * 该方法会将当前Map中所有的value存入一个集合后返回。
		 */		
		Collection<Integer> values = map.values();
		for(Integer value : values){
			System.out.println("value:"+value);
		}
		
		/**自带方法forEach实现遍历*/
		map.forEach((k,v)->{
			System.out.println(k+"="+v);
		});
		System.out.println();
		
		Set<String> keys1 = map.keySet();
		for (String k : keys1) {
			System.out.println(k+"="+map.get(k));
		}
		
		
	}
}
