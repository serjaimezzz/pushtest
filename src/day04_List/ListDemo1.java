package day04_List;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List
 * ���ظ�������������(����˳������˳����ͬ)
 * �ص��ǿ��Ը����±����Ԫ�ء�
 * ����ʵ����:
 * ArrayList:ʹ������ʵ�֣���ѯ����
 * LinkedList:ʹ������ʵ�֣���ɾ����(��β��ɾЧ������)
 * @author zhangchi
 *
 */
public class ListDemo1 {

	public static void main(String[] args) {
	
		List<String> list=new ArrayList<String>();
		list.add("one");		//0 <-�±�
		list.add("two");		//1
		list.add("three");		//2
		list.add("four");		
		list.add(0,"zero");		//��0�±괦���"zero",ԭ��Ԫ��������
		System.out.println(list);//[zero,one, two, three, four]		
		
		/**
		 * E remove(int index)	���ر�ɾ���Ķ���
		 */
		list.remove(4);
		System.out.println(list);////[zero,one, two, three]
		
		
		/**
		 * E set(int index,E e)
		 * ������Ԫ�����õ�ָ��λ���ϣ�����ֵΪ
		 * ԭλ�õ�Ԫ�ء��������滻Ԫ�ز���
		 */
		String old=list.set(1, "1");//�滻Ԫ��
		System.out.println(list);
		System.out.println("old:"+old);		
		//list.set(4,"five");  // ������±�Խ��,setֻ�������滻
		
		
		/**
		 * E get(int index)
		 * ��ȡ�����±��Ӧ��Ԫ��
		 */
		//��ȡ������Ԫ��
		String str=list.get(2);
		System.out.println("str:"+str);//two
		
		//��ͳѭ������List����
		for(int i=0;i<list.size();i++){
			str=list.get(i);
			System.out.println(str);
		}
		

		
	}
}
