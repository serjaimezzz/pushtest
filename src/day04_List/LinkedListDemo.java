package day04_List;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Linked:���ݽṹ������������ݽṹ�洢,�ڴ��ǲ�������,�����ڲ���,�������ݵ����Ӻ�ɾ��
 * List:���ظ���
 * @author zhangchi
 *
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		list.addFirst("001");	//���б�ͷ����ָ��Ԫ��,��Ԫ�ؿ�������������
		list.addFirst("002");
		list.addFirst("003");
		list.addFirst("004");
		System.out.println(list);
		
	
		
		while(!list.isEmpty()){
			
//			System.out.println(list.removeFirst());	//�ӿ�ͷ��ʼɾ��,����ȳ�
			System.out.println(list.removeLast());	//�ӽ�β��ʼɾ��,�Ƚ��ȳ�	
			
			
		}
//			System.out.println(list.getFirst());	//�Ѿ�ɾ����NoSuchElementException�ɰ汾
//			System.out.println(list.peekFirst());	//jdk1.6��ȡ���ݲ�����return null
		
//			System.out.println(list.removeFirst());	//NoSuchElementException
//			System.out.println(list.pollFirst());	//null
		System.out.println(list);
		
	}
}
