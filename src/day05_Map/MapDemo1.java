package day05_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * java.util.Map
 * Map����������һ���������еı����key-value�Ե���ʽ���Ԫ��,����key(null)-value(null)
 * ��Map��key�������ظ�(�ظ�������key��equals�ж�),value�����ظ�
 * ���õ�ʵ����Ϊ:HashMap
 * @author zhangchi
 *
 */
public class MapDemo1 {
	public static void main(String[] args) {	
		//int value=map.put("����", 99).intValue();
		Map<String,Integer> map=new HashMap<String,Integer>();
		Integer value=map.put("����", 99);	//���ص�����һ����ӵ���ͬkey���ļ�ֵ�Ե�ֵ
		prt("value1:"+value);		//ȫ��key�ķ���ֵ��null,Ҫ��null����int value,��������ָ���쳣
		
		value=map.put("����", 90);//�滻ԭvalue
		prt("value2:"+value);//key�����ظ�
		System.out.println(map);
		/*
		 * V put(K k,V v)
		 * ��������key-value�Դ���Map
		 * ����MapҪ������key�ظ�������ʹ��Map���е�key����һ���µ�valueʱ�Ĳ������滻value��
		 * ��ô����ֵΪ��keyԭ����Ӧ��value������һ���µ�key���򷵻�ֵΪnull��
		 * 
		 * V putIfAbsent(K key,V value)
		 * ���������keyֵ������,�����
		 */		
		map.putIfAbsent("��ѧ", 98);
		map.putIfAbsent("Ӣ��", 97);
		/*
		 *	void putAll()
		 *	�ѽ��յļ����е����м�ֵ����ӵ���ǰ������ 
		 */
		Map<String,Integer> m = new HashMap<>();
		m.putIfAbsent("����", 96);
		m.putIfAbsent("��ѧ", 99);
		m.putIfAbsent("����", 90);
		System.out.println(map);
		map.putAll(m);		//��mȫ������map��
		System.out.println(map);
		
		/*
		 * V get(K k)
		 * ���ݸ�����key��ȡ��Ӧ��value,����ǰMap��û�и�����key,�򷵻�ֵΪnull
		 */
		value=map.get("����");	//��ǰkey������,����null
		prt("����"+value);
		value=map.get("��ѧ");
		prt("��ѧ:"+value);
		
		//����������滻��������ֵ,������ڱ���ԭֵ
		value = map.getOrDefault("����", 110);
		prt("value:"+value);
		
		/*
		 * V remove(K k)
		 * ɾ��������key����Ӧ��key-value�ԡ�
		 * ����ֵΪ��ɾ����key-value���е�value
		 */
		value=map.remove("��ѧ");
		System.out.println("old:"+value);
		System.out.println(map);	
		
		boolean b = map.remove("��ѧ",99);	//key-value��ƥ��ʱɾ��,�ɹ�ɾ������true
		prt("b:"+b);
		
		//default V replace(K key, V value)
		map.replace("Ӣ��",100);	//����key��valueֵ
		System.out.println(map);
		
		//boolean replace(K key, V oldValue, V newValue)
		map.replace("����", 96,80 );
		System.out.println(map);
		
		/** map.replaceAll(function);
		   void replaceAll
		   (BiFunction <? super K  ,  ? super V  ,  ? extends V> function)
		 �����е�ÿ����ֵ�Ի����δ�������K,V
		   ����ֵ�����滻ԭ����ֵ
		*/
		map.replaceAll((k,v) -> {
			if("����".equals(k))
			return 0;
			return v;
		}
		);
		System.out.println("all:"+map);
		
		//int size()
		prt("size:"+map.size());
		
		//��ѯ���е�ֵ
		Collection<Integer> val = map.values();
		for (Integer integer : val) {
			System.out.println("val:"+integer);
		}
		System.out.println();
		
		/*
		 * ��ѯ�Ƿ��������ѯ�ļ�/ֵ
		 */
		map.containsKey("");
		map.containsValue(90);
		System.out.println("isEmpty:"+map.isEmpty());
		
	}
	
	public static void prt(String str){
		System.out.println(str);
	}
	
}
