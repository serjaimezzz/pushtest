package day05_Map;

import java.util.*;

import day04_List.*;

public class TreeMapDemo {
	public static void main(String[] args) {
		ComByName c = new ComByName();
		//根据key排序
		TreeMap<Student,String> map = new TreeMap<>(c);//自定义排序
		map.put(new Student("a",21), "beijing");
		map.put(new Student("c",31), "nanjing");
		map.put(new Student("b",41), "dongjing");
		System.out.println(map); 	//默认排序时使用Comparable
		
		
	}
}

class ComByName implements Comparator<Student>{
	public int compare(Student s1,Student s2){
		return s1.getName().compareTo(s2.getName());
	}
}