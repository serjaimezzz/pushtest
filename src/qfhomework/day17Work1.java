package qfhomework;

import java.util.*;

public class day17Work1 {
	public static void main(String[] args) {
		//ͳ��key-value��  value�ظ��Ĵ���
		/*Map<Integer,String>
		 * put(Integer,String)
		 * V get(i)
		 * 
		 * forѭ��+if(true)count++:boolean containsValue(Object value)
		 */
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�������ַ���:");
		String str = "abccaabdsswaabbsc";
		String[] arr = str.split("");
//		for (String string : arr) {
//			System.out.println(string);
//		}
		Map<Integer,String> map = new HashMap<>();
		Map<String,Integer> map1 = new HashMap<>();
		for(int i = 0;i < arr.length;i++){	
			map1.putIfAbsent(arr[i], i);	//��ȡ�ַ�������浽map1
		}
		for (int i = 0; i < arr.length; i++) {
			map.put(i, arr[i]);					//���ַ��浽map��value
		}
		List<String> list = new ArrayList<>();
		Set<String> keys = map1.keySet();
		Iterator<String> ite = keys.iterator();
		while(ite.hasNext()){
			String key = ite.next();
			list.add(key);				//�Ѽ�ֵ������list��
//			System.out.println(key);
//			System.out.println(list);
		}
		
		String[] arr1 = list.toArray(new String[list.size()]); //list����ת����arr1���value����
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
