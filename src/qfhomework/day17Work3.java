package qfhomework;

import java.util.*;
import java.util.Map.Entry;

public class day17Work3 {
	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<>();
		Map<String,Integer> map1 = new HashMap<>();
		map.put("a", 60);
		map.put("b", 42);
		map.put("c", 70);
		map.put("d", 32);
		int sum = 0,d = 0,count = 0;	//sum:�ܷ�,d:�������ܷ�,count:����������
		//Set<Entry<K,V>> s = map.entrySet() 	//�ڲ���ʵ�ֱ���
		Set<Entry<String,Integer>> ent = map.entrySet();	//�Ƚ�key-value����Set��
		for(Entry<String,Integer> e:ent){
			String key = e.getKey();
			Integer value = e.getValue();
			if(value >= 60){
				map1.put(key, value);
			}
			if(value < 60){
				map1.put(key, value);
				d += value;
				count++;
			}
			sum += value;
		}
		System.out.println("1:"+map1+",2:"+map1.keySet()+",sum:"+sum);
		System.out.println("avr:"+(double)(sum/4));
		System.out.println("d:"+d+",count:"+count+",avrD:"+(double)(d/count));
		
	}
}

class Student{
	String name;
	int avrScore;
	Student(){}
	Student(String name,int avrScore){
		this.name = name;
		this.avrScore = avrScore;
	}
}
