package day04_List;

import java.util.*;


/**
 * ���򼯺�Ԫ�ء�ֻ������List���ϡ�Set���ϴ󲿷������򼯺ϡ�
 * ���򼯺�ʹ�õ��Ǽ��ϵĹ�����Collections�ľ�̬����sort
 * 
 * @author zhangchi
 *
 */
public class ListSortDemo {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		MyComparators mc = new MyComparators();
		Random random=new Random();
		for(int i=0;i<10;i++){
			list.add(random.nextInt(100));
		}
		System.out.println(list);
		
		/**�Լ��Ͻ�����Ȼ���򣬴�С����*/
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list,mc);
		System.out.println(list);
			
	}
}

class MyComparators implements Comparator<Integer>{
	public int compare(Integer a,Integer b){	//������ֻ������������
		return b - a;	
	}
}