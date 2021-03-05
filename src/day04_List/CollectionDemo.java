package day04_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

import day02_Integer.Point;
import day04_List.*;

/**
 * java.util.Collection	--�ӿ�
 * java.util.Collections:���ϵĹ����࣬�ṩ�˺ܶ���ڲ������ϵķ������Ƿ����ľ���ʵ��
 * ���ϣ����ڴ洢��ͬ���͵Ķ���,ֻ�ܴ洢�������͵Ķ���,������ӵĶ���ĸ�������ʱ,���ϵ������᲻������
 * �ṩ��ά�����ϵ���ز������������������ӽӿ�:
 * List: ���ظ���
 * Set : ���򲻿��ظ���	(�洢���ݺ��û�������ݵ�˳��һ��)
 * Ԫ���Ƿ��ظ�������Ԫ������equals�����ȽϵĽ�������ġ� 
 * @author zhangchi
 *
 */
public class CollectionDemo {

	public static void main(String[] args) {
		Collection c = new ArrayList();		
		/** 
		 * boolean add(E e)
		 * �򼯺������Ԫ�ء�
		 * ��Ԫ�سɹ���ӵ����Ϻ󷵻�true
		 */
		boolean flag = c.add("one");	//�з���ֵ,�����ؽ���,��ӳɹ�����true
		System.out.println("flag:"+flag);
		c.add("two");
		c.add("three");
		c.add("four");
//		c.add(666);
		c.add("java1");
		c.add("java2");
		System.out.println("c:"+c);
		
		/*
		 * boolean addAll(Collection <? extends E>c )
		 */
		Collection c2 = new ArrayList();
		c2.add(999);
		c2.add(888);
		prt("c2:"+c2);
		
		c.addAll(c2);//��999�ӵ�c��
		prt("c:"+c);
		
		/**
		 * boolean remove(Object o)	ɾ��ָ������
		 * boolean removeAll((Collection<?> c)	ɾ���ڼ����е�(����)�ڵ�Ԫ��
		 * boolean removeIf(Predicate<? super E> filter) ɾ�� boolean test(T t)Ϊtrue��Ԫ��
		 */
		c.remove("four");//ɾ��ָ������
		c.removeAll(c2);//ɾ��c2��c�е�Ԫ��
		prt("c:"+c);
		
		c.removeIf( t -> ((String)t).startsWith("t") );//t ���ν��ռ����е�ÿ������
						//Object����ת��ΪString,ɾ����java��ͷ���ַ���
		prt("c:"+c);
		
		/**
		 * int size()
		 * ���ص�ǰ���ϵ�Ԫ�ظ���
		 */
		System.out.println("c.size():"+c.size());//��length��ͬ�������size�Ƕ��
		

		/**
		 * boolean isEmpty()
		 * �жϵ�ǰ�����Ƿ��ǿռ�
		 */
		boolean isEmpty=c.isEmpty();
		System.out.println("�ü����Ƿ��ǿռ�:"+isEmpty);
		
		/**
		 * boolean contains(Object o);
		 * �жϼ������Ƿ����Ԫ��o
		 * �����ж��Ƿ����ָ��Ԫ�� ������Ԫ�ص�equals�ȽϵĽ����
		 * ֻҪ��������Ԫ�������Ԫ�رȽ�Ϊtrue,����Ϊ������
		 */
		boolean b = c.contains(" ");//Ԫ��������д��equals����
		prt("contains:"+b);
	

		/**
		 * boolean equals(Object o)
		 * ��д��equals����,�Ƚ����������д洢�Ķ����Ƿ�һ��
		 */
		Collection c1 = new ArrayList();
		c1.add("c1");
		boolean b2 = c.equals(c1);
		prt("b2:"+b2);
		
		
		/**
		 * void clear()
		 * ��ռ���Ԫ��
		 */
		System.out.println("��ռ���");
		c.clear();
		System.out.println("size:"+c.size());
		System.out.println("�ü����Ƿ��ǿռ�:"+c.isEmpty());
		/**
		 * ���ϴ��Ԫ�ش�ŵ���Ԫ�ص�����(��ַ)
		 * @author zhangchi
		 *
		 */
		Point p = new Point(1, 2);
		c.add(p);
		System.out.println("p:" + p);
		System.out.println(c);
		
		p.setX(2);
		System.out.println("p:"+p);
		System.out.println(c);
		
	
	}
	
	public static void prt(Object str){
		System.out.println(str);
	}
}
