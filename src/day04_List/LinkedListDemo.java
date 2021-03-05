package day04_List;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Linked:数据结构是链表进行数据结构存储,内存是不连续的,不便于查找,便于数据的增加和删除
 * List:可重复集
 * @author zhangchi
 *
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		list.addFirst("001");	//在列表开头插入指定元素,该元素可以是引用类型
		list.addFirst("002");
		list.addFirst("003");
		list.addFirst("004");
		System.out.println(list);
		
	
		
		while(!list.isEmpty()){
			
//			System.out.println(list.removeFirst());	//从开头开始删除,后进先出
			System.out.println(list.removeLast());	//从结尾开始删除,先进先出	
			
			
		}
//			System.out.println(list.getFirst());	//已经删完了NoSuchElementException旧版本
//			System.out.println(list.peekFirst());	//jdk1.6获取内容不存在return null
		
//			System.out.println(list.removeFirst());	//NoSuchElementException
//			System.out.println(list.pollFirst());	//null
		System.out.println(list);
		
	}
}
