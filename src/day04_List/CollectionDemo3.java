package day04_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 遍历集合
 * Collection提供了统一的遍历集合元素的方式:迭代器模式
 * 
 * Iterator iterator()
 * 获取用于遍历当前集合的迭代器
 * 
 * java.util.Iterator()是一个接口,规定了用于遍历集合元素的相关方法,
 * 不同的集合提供了相应的实现类。无需记住实现类的名字,把他们当做Iterator即可。
 * 
 * 遍历集合遵循:问,取,删的步骤,其中删除不是必须操作
 * 
 * @author zhangchi
 *
 */
public class CollectionDemo3 {

	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		System.out.println(c);
		
		
		/*
		 * boolean hasNext()
		 * 该方法是判断集合中是否还有元素可以取出
		 * E next()取的过程
		 * 获取集合中的下一个元素
		 */
		
		//获取用于遍历当前集合的迭代器		遵循	 问-取-删 	原则
		Iterator it=c.iterator();	//确定了遍历的数组
		while(it.hasNext()){             //问。
			String str=(String)it.next();//取。集合中的元素都是String
			
			if("#".equals(str)){
//				c.remove(str);      //使用迭代器遍历时,大部分集合不允许增删元素,否则会引发异常ConcurrentModificationException				
				it.remove();//删。	
				/* 迭代器提供了remove方法,用来删除通过next方法取出的元素	
				 * 从底层集合中移除此迭代器返回的最后一个元素（可选操作）。 
				 * 每次调用next()时，只能调用此方法一次。 
				 * 除非通过调用此方法以外的任何方式修改基础集合，
				 * 否则迭代器的行为未指定，除非重写类已指定并发修改策略。 
				 * 如果在调用forEachRemaining方法后调用此方法， 则不指定迭代器的行为。 
				 */
			}			
//			System.out.println(str);
		}		
		System.out.println(c);
		
		
	}
}
