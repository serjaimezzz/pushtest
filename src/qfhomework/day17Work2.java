package qfhomework;

import java.util.*;

public class day17Work2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		Map<String,Integer> map = new HashMap<>();
		String[] arr = {"a,6,6,6","b,2,2,2","c,5,5,5"};
//		String[] arr = new String[3];
//		for(int i =0; i < arr.length ; i++){
//			System.out.println("������ѧ�����������ſεĳɼ�:");
//			arr[i] = scan.next();
//		}
//		for (String string : arr) {			������Ϣ
//			System.out.println(string);
//		}
		
		for (int i = 0; i < arr.length; i++) {	//�г�key-value����map
			String[] arr1 = arr[i].split(",");
			map.put(arr1[0], ( Integer.parseInt(arr1[1]) + Integer.parseInt(arr1[2]) + Integer.parseInt(arr1[3]) ));
		}
		System.out.println(map);
		
//		List<Integer> sorted = new ArrayList<>(map.values());	//�����List����value��������
//		Collections.sort(sorted);
//		System.out.println("sorted:"+sorted);
		
//		TreeMap<Integer,String> tmap = new TreeMap<>(map);	//TreeMap���ܶ�key�����������key-value
		
		
		/**
		 * ʹ��Lambda��Stream���ʽ��������
		 * ���ǹ���Steam��������Ҫ�����Compare
		 */
		map.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
		
	}
}

