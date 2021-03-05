package day05_Map;

import java.util.*;
/**
 * List:������ظ�
 * Set:����,�����ظ�
 * LinkedHashSet:���򲻿��ظ�
 * LinkedHashMap:
 * @author zhangchi
 *
 */
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		/**
		 * ���� + ��ϣ��	ʵ�ֵĴ洢,��֤������
		 */
		LinkedHashSet ls = new LinkedHashSet();
		ls.add("hello");
		ls.add("bigdata");
		ls.add("sql");
		System.out.println(ls);
		
		LinkedHashMap lm = new LinkedHashMap();
		lm.put("name", "zhangchi");
		lm.put("age", "22");
		
		//�õ��̰߳�ȫ�ĸ��ּ��϶���
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		
		
		Set<String> set = Collections.synchronizedSet(new HashSet<String>());
			
		//���ض��̰߳�ȫ��Map
		Map<String,String> map = Collections.synchronizedMap(new HashMap<String,String>());
		
	}
}
