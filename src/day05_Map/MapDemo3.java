package day05_Map;

import java.util.*;

import day04_List.Student;

public class MapDemo3 {
	public static void main(String[] args) {
		Map<String,List<Student>> school = new HashMap<>();
		
		List<Student> list1 = new ArrayList<>();
		list1.add(new Student("a",10));
		list1.add(new Student("b",30));
		list1.add(new Student("c",20));
		list1.add(new Student("d",60));
		list1.add(new Student("e",20));
		
		List<Student> list2 = new ArrayList<>();
		list1.add(new Student("aa",20));
		list1.add(new Student("bb",20));
		list1.add(new Student("cc",20));
		list1.add(new Student("dd",20));
		list1.add(new Student("ee",20));
		
		school.put("bigdata", list1);
		school.put("py", list2);
		
		Set<String> keys = school.keySet();
		Iterator<String> ite = keys.iterator();
		
		while(ite.hasNext()){
			String classes = ite.next();
			System.out.println(classes);
			
			List<Student> lists = school.get(classes);
			lists.forEach(System.out::println);
		}
		
		
	}
}
