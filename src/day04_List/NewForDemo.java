package day04_List;

import java.util.ArrayList;
import java.util.Collection;

/**
 * JDK5.0之后推出了一个新的特性:
 * 增强型for循环,又叫做 新循环、for each
 * 
 * 新循环不能替代传统循环
 * 只能用来遍历集合或遍历数组
 * 
 * 新循环并非新的语法，新循环是编译器认可，而不是虚拟机认可。
 * 使用新循环遍历集合时，编译器会将它改为迭代器方式遍历。
 * 所以在使用新循环遍历集合时，不能通过集合的方法增删元素

 */
public class NewForDemo {

	public static void main(String[] args) {
		String[] array={"one","two","three","four"};
		
		for (int i = 0; i < array.length; i++) {
			String str = array[i];
			System.out.println(i + ":" + str);
		}
		
		//	从数组中取出的元素:要遍历的数组
		for (String str : array) {
			System.out.println(str);	
		}
		
		
		Collection c=new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		System.out.println(c);
	
		for(Object o:c){
			/* 相当于
			 * Iterator it =c.iterator();
			 * while(it.hasNext()){
			 *       Object o=it.next();      
			 */
			String str=(String)o;
			System.out.println(str);
			
		/*	if("#".equals(str)){
				c.remove(str);			
			}
		*/	
		}
	}
}
