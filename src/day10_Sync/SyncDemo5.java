package day10_Sync;

import java.util.*;

/**
 * �����ϻ�Mapת��Ϊ�̰߳�ȫ��
 * @author zhangchi
 *
 */
public class SyncDemo5 {

	public static void main(String[] args) {
		 List<String> list=new ArrayList<String>();
		 list.add("one");
		 list.add("two");
		 list.add("three");
		 list.add("four");
		 System.out.println(list);
		 /**
		  * ����������ת��Ϊ�̰߳�ȫ�ļ���
		  * Collections.synchronizedList(List list)
		  */
		 list = Collections.synchronizedList(list);
		 System.out.println(list);
		
		 Set<String> set=new HashSet<String>(list);
		 /**
		  * ��������Set����ת��Ϊ�̰߳�ȫ��
		  */
		 Collections.synchronizedSet(set);
		 System.out.println(set);
		 
		 Map<String,Integer> map=new HashMap<String,Integer>();
		 map.put("����", 99);
		 map.put("��ѧ", 91);
		 map.put("Ӣ��", 92);
		 //��������Map����ת��Ϊ�̰߳�ȫ��
		 Collections.synchronizedMap(map);
		 System.out.println(map);
		 
		 /*
		  * API�ֲ�����˵��
		  * �������̰߳�ȫ�ļ��ϣ���ô���ж���Ԫ�صĲ�������:add,remove�ȷ������ǻ����,����ͬ�� 
		  * һ���߳��������������Ԫ��ʱ,�����߳��޷�ͬʱ��ɾ�����е�Ԫ��
		  * 
		  * ������ɾ������������������������⣬��Ҫ����ά�������ϵ��
		  * �����������ɾ����
		  * 
		  */
		 
		 
	}
	
}
