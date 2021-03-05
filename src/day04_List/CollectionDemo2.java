package day04_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合的批量操作
 * @author zhangchi
 *
 */
public class CollectionDemo2 {

	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add("java");
		c1.add("c++");
		c1.add(".net");
		System.out.println("c1:"+c1);
		
		Collection c2=new HashSet();	
		c2.add("java");
		c2.add("ios");
		c2.add("android");
		c2.add("linux");
		c2.add("ios");
		System.out.println("c2:"+c2);
		
		/*
		 *取并集
		 *boolean addAll(Collection c)
		 *将给定集合中的所有元素添加到当前集合中,
		 *添加后只要当前元素集合元素数量发生了变化,则返回true 
		 */
		boolean b = c1.addAll(c2);
		boolean flag=c2.addAll(c1);
		System.out.println("c1:"+c1);
		System.out.println("c2:"+c2);
		System.out.println(flag);
		
		Collection c3=new ArrayList();
		c3.add("java");
		c3.add("android");
		System.out.println("c3:"+c3);
		/*
		 * boolean containsAll(Collection c)
		 * 判断当前集合是否包含给定集合中的所有元素
		 */
		boolean contains=c1.containsAll(c3);
		System.out.println("是否全包含:"+contains);
		
		/*
		 * 从c1集合中删除c3和c1集合的共有元素
		 */
		c1.removeAll(c3);
		System.out.println("c1:"+c1);
		
		
	}
}
