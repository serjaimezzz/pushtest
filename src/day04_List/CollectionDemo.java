package day04_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

import day02_Integer.Point;
import day04_List.*;

/**
 * java.util.Collection	--接口
 * java.util.Collections:集合的工具类，提供了很多便于操作集合的方法，是方法的具体实现
 * 集合，用于存储不同类型的对象,只能存储引用类型的对象,随着添加的对象的个数增加时,集合的容量会不断增加
 * 提供了维护集合的相关操作。其派生了两个子接口:
 * List: 可重复集
 * Set : 无序不可重复集	(存储数据和用户添加数据的顺序不一致)
 * 元素是否重复是依靠元素自身equals方法比较的结果而定的。 
 * @author zhangchi
 *
 */
public class CollectionDemo {

	public static void main(String[] args) {
		Collection c = new ArrayList();		
		/** 
		 * boolean add(E e)
		 * 向集合中添加元素。
		 * 当元素成功添加到集合后返回true
		 */
		boolean flag = c.add("one");	//有返回值,但不必接收,添加成功返回true
		System.out.println("flag:"+flag);
		c.add("two");
		c.add("three");
		c.add("four");
//		c.add(666);
		c.add("java1");
		c.add("java2");
		System.out.println("c:"+c);
		
		/*
		 * boolean addAll(Collection <? extends E>c )
		 */
		Collection c2 = new ArrayList();
		c2.add(999);
		c2.add(888);
		prt("c2:"+c2);
		
		c.addAll(c2);//把999加到c中
		prt("c:"+c);
		
		/**
		 * boolean remove(Object o)	删除指定对象
		 * boolean removeAll((Collection<?> c)	删除在集合中的(集合)内的元素
		 * boolean removeIf(Predicate<? super E> filter) 删除 boolean test(T t)为true的元素
		 */
		c.remove("four");//删除指定对象
		c.removeAll(c2);//删除c2在c中的元素
		prt("c:"+c);
		
		c.removeIf( t -> ((String)t).startsWith("t") );//t 依次接收集合中的每个对象
						//Object向下转型为String,删除以java开头的字符串
		prt("c:"+c);
		
		/**
		 * int size()
		 * 返回当前集合的元素个数
		 */
		System.out.println("c.size():"+c.size());//和length不同，存多少size是多大
		

		/**
		 * boolean isEmpty()
		 * 判断当前集合是否是空集
		 */
		boolean isEmpty=c.isEmpty();
		System.out.println("该集合是否是空集:"+isEmpty);
		
		/**
		 * boolean contains(Object o);
		 * 判断集合中是否包含元素o
		 * 集合判断是否包含指定元素 是依靠元素的equals比较的结果。
		 * 只要集合中有元素与给定元素比较为true,则认为包含。
		 */
		boolean b = c.contains(" ");//元素自身含重写的equals方法
		prt("contains:"+b);
	

		/**
		 * boolean equals(Object o)
		 * 重写了equals方法,比较两个集合中存储的对象是否一样
		 */
		Collection c1 = new ArrayList();
		c1.add("c1");
		boolean b2 = c.equals(c1);
		prt("b2:"+b2);
		
		
		/**
		 * void clear()
		 * 清空集合元素
		 */
		System.out.println("清空集合");
		c.clear();
		System.out.println("size:"+c.size());
		System.out.println("该集合是否是空集:"+c.isEmpty());
		/**
		 * 集合存放元素存放的是元素的引用(地址)
		 * @author zhangchi
		 *
		 */
		Point p = new Point(1, 2);
		c.add(p);
		System.out.println("p:" + p);
		System.out.println(c);
		
		p.setX(2);
		System.out.println("p:"+p);
		System.out.println(c);
		
	
	}
	
	public static void prt(Object str){
		System.out.println(str);
	}
}
