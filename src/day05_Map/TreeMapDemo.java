package day05_Map;

import java.util.*;

import day04_List.*;

public class TreeMapDemo {
	public static void main(String[] args) {
		ComByName c = new ComByName();
		//����key����
		TreeMap<Student,String> map = new TreeMap<>(c);//�Զ�������
		map.put(new Student("a",21), "beijing");
		map.put(new Student("c",31), "nanjing");
		map.put(new Student("b",41), "dongjing");
		System.out.println(map); 	//Ĭ������ʱʹ��Comparable
		
		
	}
}

class ComByName implements Comparator<Student>{
	public int compare(Student s1,Student s2){
		return s1.getName().compareTo(s2.getName());
	}
}