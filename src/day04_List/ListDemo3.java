package day04_List;

import java.util.ArrayList;
import java.util.List;

/**
 * List subList(int start,int end)
 * ��ȡ��ǰ������ָ����Χ�ڵ��Ӽ�����ͷ����β
 * @author zhangchi
 *
 */
public class ListDemo3 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		
		for (int i = 10; i > 0; i--) {
			list.add(i);
		}
		System.out.println(list);
		//[10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
		
		/**
		 * ȡ�Ӽ�: subList
		 */
		List<Integer> sub=list.subList(3, 8); //��ȡ3-7,��ͷ����β	
		System.out.println(sub);
					
		/**
		 *	int indexOf(Object o)	��ȡ��ǰԪ�ص��±�
		 *	int lastIndexOf(Object o)
		 */
		int index = list.indexOf(3);
		System.out.println("index:"+index);
		index = list.lastIndexOf(10);
		System.out.println(index);
		
		
		//���Ӽ���ÿ��Ԫ������10��
		for(int i=0;i<sub.size();i++){
			//int n=subList.get(i);
			//n=n*10;
			//subList.set(i, n);
			sub.set(i,sub.get(i)*10);//�������ϵ�������
		}
		System.out.println(sub);
		//���Ӽ����κ��޸ģ����޸�ԭ���ϵ���Ӧ����
		System.out.println(list);
		
		/**
		 * ɾ��������2-8��Ԫ��
		 */
		list.subList(2, 9).clear();
		System.out.println(list);
		
		
		
	}
}
