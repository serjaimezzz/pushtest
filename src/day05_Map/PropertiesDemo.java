package day05_Map;

import java.util.*;
/**
 * Map的一个子类,表示一组持久的属性,属性列表中的每个键及其对应的值都是一个字符串
 * 键和值固定是String类型的
 * 只能存储键和值都是字符串的键值对
 * @author zhangchi
 *
 */
public class PropertiesDemo {
	public static void main(String[] args) {
		Properties pro = System.getProperties();	//获得当前系统的属性信息
		System.out.println(pro);
		
		//得到所有key的集合
		Set<String> keys = pro.stringPropertyNames();
//		for(String k : keys){
////			String value = pro.getProperty(k);	
//			System.out.println(k + ": " + pro.getProperty(k));
//		}
		
		//修改或添加
		pro.setProperty("user.name", "zzz");	//修改的是集合中的,而不是系统中的
		for(String k:keys){
			System.out.println(k + "," + pro.getProperty(k));
		}
	}
}
