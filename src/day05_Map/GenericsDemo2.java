package day05_Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericsDemo2 {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("java01");
		list1.add("java02");
		list1.add("java03");
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(01);
		list2.add(02);
		list2.add(03);
	}
	
	//û���õ��Ǿ�̬����,������static 
	//��̬����ֻ���Լ��÷���
	public static<E> void iter(Collection<E> col){
		Iterator<E> ite = col.iterator();
		while(ite.hasNext()){
			E ele = ite.next();
			System.out.println(ele);
		}
	}
	
	//ͨ���	?:��ʹ����������
	//static ��ʡ��<>
	public static void iter2(Collection<?> col){
		Iterator<?> ite = col.iterator();
		while(ite.hasNext()){
			Object ele = ite.next();
			System.out.println(ele);
		}
	}
	
	
}
