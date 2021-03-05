package day04_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 *  集合的遍历
 *  Iterator<E> iterator();	 返回次集合中的元素的迭代器(遍历集合的)
 *  
 *  集合是使用内部类实现遍历的，所以Iterator接口是对不同类型集合中内部类提取共性得到的一个接口
 *  所以内部类都实现了Iterator接口,iterator方法返回的是内部类对象,因为内部类实现了Iterator接口,所以该方法的返回值类型是Iterator类型的
 * @author zhangchi
 *
 */
public class CollectionDemo4 {

	public static void main(String[] args) {
		//集合支持泛型，而泛型是用来约束集合中元素的类型。
		Collection<String> c=new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		prt(" ");
		
		//新循环遍历集合元素
		for(String str:c){
			System.out.println(str);
		}
		prt(" ");
		
		/*
		 * 迭代器也应当指定泛型，而泛型的实际类型
		 * 应当与它遍历的集合的泛型类型一致
		 */
		Iterator<String> it=c.iterator();
		while(it.hasNext()){
			//获取元素时不需再造型了
			String str =it.next();
			System.out.println(str);
//			Object obj = it.next();
//			prt( ((String)obj).toUpperCase() );			
		}

		prt("---");
		
		/**
		 * default void forEach(Consumer<? super T> action);	void accept(T t)
		 * 该方法会把集合中的每个对象依次传给参数t
		 *   
		 */
		c.forEach(t -> System.out.println(t));
		prt(" ");		
		
		c.forEach(System.out::println);
		prt(" ");
			
	}
	
	public static void prt(Object str){
		System.out.println(str);
	}
}
