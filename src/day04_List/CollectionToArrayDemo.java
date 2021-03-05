package day04_List;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ����ת��Ϊ����
 * @author zhangchi
 *
 */
public class CollectionToArrayDemo {

	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		
		//Object[] array=c.toArray();  //������
		//System.out.println(array);
		
		/*
		 * ���������������(������Դ�ż�������Ԫ��)ʱ����ʹ�ø����飬
		 * �������ã����Զ�����һ�����������ͬ���͵�����
		 */
		String[] array=c.toArray(new String[c.size()]);
		System.out.println("len:"+array.length);
		for(String str:array){
			System.out.println(str);
		}
		
		
		
	}
}
