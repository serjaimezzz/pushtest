package day04_List;

import java.util.ArrayList;
import java.util.Comparator;

import day04_List.*;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student("����",21));
		list.add(new Student("����",22));
		list.add(new Student("����",23));
		list.add(new Student("����",24));
		list.add(new Student("����",23));
		list.add(new Student("����",23));
		System.out.println(list);
		
		ArrayList list2 = removeDup(list);		
		System.out.println(list2);
				
	}
	
	//ȥ��
	public static ArrayList removeDup(ArrayList list){
		ArrayList list2 = new ArrayList();			//������List���ڴ�Ų��ظ���Ԫ��
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);	//��ȡ������ָ���±��Ԫ��--ÿ��new������Student����
//			System.out.println(obj);
//			System.out.println(!list2.contains(obj));
			//�жϼ����Ƿ�����ö���
			if(!list2.contains(obj)){		//Ĭ�ϵ���System�е�contains����
				list2.add(obj);				//��Student����дequals����
//			return list2;		
			}
		}
		return list2;		
	}
	
}



