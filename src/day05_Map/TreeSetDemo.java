package day05_Map;

import java.util.Comparator;
import java.util.TreeSet;

import day05_Map.*;

/**
 * TreeSet:���򲻿��ظ�,���Զ���ӵĶ����������
 * �ײ�ʹ�õ����ݽṹ��:������
 * @author zhangchi
 *
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		
		AComparator ac = new AComparator();//����ʹ��Comparator,���û����ʹ��Comparable ---from TreeMap.class
		TreeSet<Animal> ts = new TreeSet<>(ac);
		/*
		 * �򼯺�����ӵĶ��������������ʵ��Comparable�ӿ��е�int compareTo()����
		 * TreeSet���Ͼ��ǵ�����ӵĶ����compareTo������ȷ��˭��˭С,�Ӷ�ʵ��������
		 * compareTo:
		 * ������ֵΪ0ʱ,��Ϊ��ͬһ������,�����뼯��(��֤����Ψһ�ķ�ʽ)
		 */
		ts.add(new Animal(1,"a"));//δ��дʱ,java.lang.ClassCastException
		ts.add(new Animal(2,"a"));
		ts.add(new Animal(3,"x"));
		ts.add(new Animal(2,"e"));
		System.out.println(ts);		//����ʹ��Comparator���������
		
		
		
	}
	}
	/**
	 * �����е�
	 * �Զ���һ�ֱȽϴ�С�ķ���:����дһ����,����ʵ�ֵ��ǱȽϴ�С
	 */
class AComparator implements Comparator{
	public int compare(Object o1,Object o2){
		if(!(o1 instanceof Animal))
			throw new ClassCastException();
		if(!(o2 instanceof Animal))
			throw new ClassCastException();
		Animal a1 = (Animal)o1;
		Animal a2 = (Animal)o2;
		return a1.getName().compareTo(a2.getName());
	}


}
