package day05_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map û�е�����
 * ����Map:
 * 1.�������е�key
 * 2.�������е�key-value��:
 * 	   �õ�ÿ����ֵ�Զ�Ӧ��ӳ���ϵ����()������,�浽һ��Set������,�����ظü���
 * 	 ʹ�õ�����������Set����,ÿ�α���������һ��Map.Entry���͵�����,�Ӹ�����ֵ���ܵõ�key,Ҳ�ܵõ�value
 * 		Entry��������,�Ƕ�����Map�ڲ���һ����̬�ӿ�,Entry�Ƕ�Map�ڲ���ֵ��ӳ���ϵ������
 * 		���Զ�������Map���ڲ�
 * 3.�������е�value(��Բ�����)
 * 
 * @author zhangchi
 *
 */
public class MapDemo2_traversal {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("����", 99);
		map.put("��ѧ", 98);
		map.put("Ӣ��", 97);
		map.put("����", 96);
		map.put("��ѧ", 95);
		System.out.println(map);	
		
		/**
		 * �������е�key
		 * Set<K> keySet()
		 * �÷����Ὣ��ǰMap�е����е�key����һ��Set���Ϻ󷵻ء�
		 * ��ô�����ü��Ͼ͵��ڱ��������е�key
		 */		
		Set<String> keys=map.keySet();
		for(String key : keys){
			System.out.println(key + "=" + map.get(key));
		}
		System.out.println();
		
		Iterator<String> ite = keys.iterator();
		while(ite.hasNext()){
			String key = ite.next();
			Integer i = map.get(key);
			System.out.println(key+"="+i);
		}
		System.out.println();
		/**
		 * ����ÿһ���ֵ��
		 * Map��ÿһ���ֵ�Զ�����Map���ڲ���:
		 * java.util.Map.Entry��һ��ʵ����ʾ�ġ�
		 * Entry����������:getKey,getValue,���Էֱ��ȡ��һ���ֵ���е�key��value
		 * 
		 * Set<Entry> entrySet
		 * �÷����ὫMap��ÿһ���ֵ��(Entryʵ��)����һ��Set���Ϻ󷵻ء�
		 * Entry:Map��һ���ڲ��ӿ�
		 */
		Set<Entry<String,Integer>> entrySet=map.entrySet();
		
		for(Entry<String,Integer> e:entrySet){
			String key=e.getKey();
			Integer value=e.getValue();
			System.out.println(key+":"+value);
			
		}
		System.out.println();
		
		/**
		 * �������е�value
		 * Collection values()
		 * �÷����Ὣ��ǰMap�����е�value����һ�����Ϻ󷵻ء�
		 */		
		Collection<Integer> values = map.values();
		for(Integer value : values){
			System.out.println("value:"+value);
		}
		
		/**�Դ�����forEachʵ�ֱ���*/
		map.forEach((k,v)->{
			System.out.println(k+"="+v);
		});
		System.out.println();
		
		Set<String> keys1 = map.keySet();
		for (String k : keys1) {
			System.out.println(k+"="+map.get(k));
		}
		
		
	}
}
