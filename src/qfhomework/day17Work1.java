package qfhomework;

import java.util.*;

public class day17Work1 {
	public static void main(String[] args) {
		//统计key-value中  value重复的次数
		/*Map<Integer,String>
		 * put(Integer,String)
		 * V get(i)
		 * 
		 * for循环+if(true)count++:boolean containsValue(Object value)
		 */
//		Scanner scan = new Scanner(System.in);
//		System.out.println("请输入字符串:");
		String str = "abccaabdsswaabbsc";
		String[] arr = str.split("");
//		for (String string : arr) {
//			System.out.println(string);
//		}
		Map<Integer,String> map = new HashMap<>();
		Map<String,Integer> map1 = new HashMap<>();
		for(int i = 0;i < arr.length;i++){	
			map1.putIfAbsent(arr[i], i);	//获取字符的种类存到map1
		}
		for (int i = 0; i < arr.length; i++) {
			map.put(i, arr[i]);					//把字符存到map的value
		}
		List<String> list = new ArrayList<>();
		Set<String> keys = map1.keySet();
		Iterator<String> ite = keys.iterator();
		while(ite.hasNext()){
			String key = ite.next();
			list.add(key);				//把键值都放在list中
//			System.out.println(key);
//			System.out.println(list);
		}
		
		String[] arr1 = list.toArray(new String[list.size()]); //list集合转数组arr1存放value种类
//		for (String string : arr1) {			//a b c s d w
//			System.out.println("arr1:"+string);
//		}
		int[] count =new int[arr1.length];
		
//		System.out.println(map);
		for(int j = 0;j <arr1.length; j++){
			for(int i = 0;i < map.size();i++){
				if(map.get(i).equals(arr1[j])){
//					System.out.println("arr1:"+arr1[j]);
					count[j] = count[j]+1;					
				}
			}
			System.out.println(arr1[j]+","+count[j]);
		}

	}
}
