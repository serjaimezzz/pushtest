package day04_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import day02_Integer.Point;
import day04_List.*;

/**
 * ����ת����
 * @author zhangchi
 *
 */
public class CollectionDemo1 {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		c.add(new Point(1,2));
//		System.out.println(c);
		
		//���ϡ���>����
		Object[] arr = c.toArray();
		for (Object object : arr) {
			System.out.println(object);
		}
		
//		Iterator ite = c.iterator();
//		while(ite.hasNext()){		//�ж��α�cursor��������û�ж���,��0��ʼ,cursor�ж�(1,2)��(3,4)��...�治���ڶ���,ÿ��������һ������
//			Object o = ite.next();	
//			System.out.println(o);
//		}
		
		
		
		
		
	}
}
