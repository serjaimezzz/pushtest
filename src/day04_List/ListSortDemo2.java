package day04_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortDemo2 {

	public static void main(String[] args) {
		List<String> list =new ArrayList<String>();
		
		list.add("aaaaaa");		//Ĭ��Collections.sort() �ȴ�д��Сд,��С��������,ͬ��ĸ�ٱȽϴ�С
		list.add("bbb");
		list.add("c");
		
		System.out.println(list);
		MyComparator com=new MyComparator();
		/**
		 * ���ص�sort����Ҫ����һ������ıȽ�����
		 * �÷�������Ҫ�󼯺�Ԫ�ر���ʵ��Comparable�ӿڣ�����Ҳ����ʹ�ü���Ԫ������ıȽϹ��������ˣ�
		 * ���Ǹ��ݸ������������ıȽ����ıȽϹ���Լ���Ԫ�ؽ�������
		 * ʵ�ʿ�����Ҳ�Ƽ�ʹ�����ַ�ʽ���򼯺�Ԫ�أ�������Ԫ�����Զ���ġ�
		 * �����Ƚ���ʱҲ�Ƽ�ʹ�������ڲ������ʽ��
		 */
		Collections.sort(list,com);
		System.out.println(list);
		
		/** Lambda���ʽ*/
		Collections.sort(list,(t1,t2)->{
			return t1.length() - t2.length();
		});
		System.out.println("lambda:"+list);
		/**�������ڲ�����ʽ����*/
		Comparator<String> com1=new Comparator<String>(){
			public int compare(String o1,String o2){
				return o2.length()-o1.length();	
			}
		};		
		Collections.sort(list,com1);
		System.out.println(list);
	} 
}

/**
 * ����һ������ıȽ���
 * @author zhangchi
 */
class MyComparator implements Comparator<String>{
	/**
	 * �÷�����������o1��o2�ıȽ�
	 * ������ֵ>0:o1>o2
	 * ������ֵ<0:o1<o2
	 * ������ֵ=0:o1=o2
	 */
	public int compare(String o1, String o2) {
		return o1.length()-o2.length();//o1.length()-o2.length()>0�ַ������ַ���Ĵ�,��ĺ����
	}
	
}


