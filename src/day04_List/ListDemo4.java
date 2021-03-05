package day04_List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo4 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
		list.forEach(t -> System.out.println(t));
		list.forEach(System.out::print);
		
		
		ListIterator<String> ite = list.listIterator();		//List���еĵ�����,�ڵ��������пɶԼ��Ͻ������,�޸�,ɾ��Ԫ��
		while(ite.hasNext()){
			String str = (String)ite.next();
			if(str.equals("c"))
				ite.add("cc");	//��"c"��������"cc"
			if(str.equals("d"))
				ite.set("ss");	//��"c"��Ϊ"ss"
			if(str.equals("e"))
				ite.remove();
			System.out.println(str);
//			String str1 = (String)ite.next();
		}		
		for (Object object : list) {
			System.out.print(object);//abcccss
		}	
		System.out.println("\n------");
		/**
		 *  boolean hasPrevious();
		 *  ���iteǰ�滹��Ԫ��,�����
		 *  ����ֻ����˳�����,���������
		 *  ���Ե���������������Ԫ����Ч
		 */
	
		while(ite.hasPrevious())
			System.out.print(ite.previous());//�������
		System.out.println("\n------");
	
		
		//���±����
		for (int i = 0; i < list.size(); i++) {	
			System.out.print(list.get(i));
		}
		System.out.println("\n------");
		
		//����֮��,ɾ���±�0֮���Ԫ��
		while(!list.isEmpty())
			System.out.print(list.remove(0)); 
		System.out.println(list); 
	}
}
