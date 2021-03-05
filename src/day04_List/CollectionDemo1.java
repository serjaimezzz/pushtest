package day04_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import day02_Integer.Point;
import day04_List.*;

/**
 * 集合转数组
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
		
		//集合——>数组
		Object[] arr = c.toArray();
		for (Object object : arr) {
			System.out.println(object);
		}
		
//		Iterator ite = c.iterator();
//		while(ite.hasNext()){		//判断游标cursor的下面有没有对象,从0开始,cursor判断(1,2)到(3,4)到...存不存在对象,每次往下移一个对象
//			Object o = ite.next();	
//			System.out.println(o);
//		}
		
		
		
		
		
	}
}
