package day05_Map;

import java.util.*;

import day04_List.*;
/**
 * 什么情况下使用Map:存在映射关系
 * 一个学生对象key对应一个value地址
 * 保证key不重复的原理和HashSet是一样的: 	int hashCode() 	boolean equals(Object obj)
 * @author zhangchi
 *
 */
public class MapDemo4 {
	public static void main(String[] args) {
		
		HashMap<Student,String> map = new HashMap<>();
		map.put(new Student("a",21), "beijing");
		map.put(new Student("b",31), "nanjing");
		map.put(new Student("b",41), "dongjing");
		
		Set<Map.Entry<Student, String>> en = map.entrySet();
		Iterator<Map.Entry<Student, String>> ite = en.iterator();
		
		while(ite.hasNext()){
			Map.Entry<Student, String> entry = ite.next();
			Student stu = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(stu + "=" + value);
		}
		
		
	}
}
