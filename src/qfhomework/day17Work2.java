package qfhomework;

import java.util.*;

public class day17Work2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		Map<String,Integer> map = new HashMap<>();
		String[] arr = {"a,6,6,6","b,2,2,2","c,5,5,5"};
//		String[] arr = new String[3];
//		for(int i =0; i < arr.length ; i++){
//			System.out.println("请输入学生姓名和三门课的成绩:");
//			arr[i] = scan.next();
//		}
//		for (String string : arr) {			输入信息
//			System.out.println(string);
//		}
		
		for (int i = 0; i < arr.length; i++) {	//切出key-value放入map
			String[] arr1 = arr[i].split(",");
			map.put(arr1[0], ( Integer.parseInt(arr1[1]) + Integer.parseInt(arr1[2]) + Integer.parseInt(arr1[3]) ));
		}
		System.out.println(map);
		
//		List<Integer> sorted = new ArrayList<>(map.values());	//构造成List仅对value进行排序
//		Collections.sort(sorted);
//		System.out.println("sorted:"+sorted);
		
//		TreeMap<Integer,String> tmap = new TreeMap<>(map);	//TreeMap仅能对key进行排序输出key-value
		
		
		/**
		 * 使用Lambda和Stream表达式进行排序
		 * 就是构造Steam流，传入要排序的Compare
		 */
		map.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
		
	}
}

