package day05_Map;

import java.util.*;

/**
 * 
 * ���ϵĹ�����:Collections
 * Collections������:	�Ǽ��ϳ��÷����ľ���ʵ�ֵ�class
 * @author zhangchi
 *
 */
public class CollectionsDemo {
	public static void main(String[] args) {
		// <T> boolean addAll(Collection<? super T> c, T... elements)
		List<Integer> list = new ArrayList<>();
		Collections.addAll(list, 1,2,4,12,99);	//��ӵ��������Զ�װ��
		System.out.println(list);
		
		/*
		 * static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll)
		 * �����еĶ�����������ʵ����comparable�ӿ�
		 */
		Integer max = Collections.max(list);
		System.out.println("max:"+max);//99
		
		/*
		 * static <T> T max(Collection<? extends T> coll, Comparator<? super T> comp)
		 * ��Ҫ�ṩ�Զ���ıȽϷ�ʽ,��дComparator��compare����
		 */
		max = Collections.max(list,(t1,t2) -> t2-t1);//����ֵ����������Ϊ˭��t2>t1,t2�ǵ��÷�
		System.out.println("max:"+max);//1
		
		/*
		 * static <T> Comparator<T> reverseOrder() 
		 */
		max = Collections.max(list,Collections.reverseOrder((t1,t2) -> t2-t1));
		System.out.println("max:"+max);
		
		
		List<String> list2 = new ArrayList<>();
		Collections.addAll(list2,"aa","aaa","b","cccc","d");
		String smax = Collections.max(list2);
		System.out.println("smax:"+smax);	//d
		
		/*
		 * static <T> Comparator<T> reverseOrder()
		 * ���غ�Ĭ�ϵķ�ʽ�෴�ıȽϷ�ʽ
		 */
		smax = Collections.max(list2,Collections.reverseOrder());
		System.out.println("smax:"+smax);//aa
		
		//��ת
		Collections.reverse(list2);
		System.out.println("reverse:"+list2);
		
		//�����±�1,2��Ԫ��
		Collections.swap(list2, 1, 2);
		System.out.println("swap:"+list2);
		
		//�������
		Collections.shuffle(list2);
		System.out.println("shuffle:"+list2);
		
		/*
		 * static <T extends Comparable<? super T>> void sort(List<T> list)
		 * ֻ�ܽ���List����
		 */
		Collections.sort(list2);
		System.out.println("sort:"+list2);
		
		//��Ĭ�ϱȽϷ�ʽ�෴������ʽ
		Collections.sort(list2, Collections.reverseOrder());
		
		/*
		 * ����֮���copy
		 * ֻ����copy,�����𿪱��ڴ�,IndexOutOfBoundsException:Source does not fit in dest
		 */
		List<String> list3 = new ArrayList<>();
		Collections.addAll(list3,"","","","","");//""��Ϊ�˿����ڴ�
		Collections.copy(list3, list2);//��list2��Ԫ��copy��list3
		System.out.println("list3:"+list3);
		
	}
}
