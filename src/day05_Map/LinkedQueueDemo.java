package day05_Map;

import java.util.LinkedList;
/**
 * 利用集合类自己封装队列类
 * @author zhangchi
 *
 */
public class LinkedQueueDemo {
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.enQueue("1");
		queue.enQueue("2");
		queue.enQueue("3");
		System.out.println(queue);
		
		while(!queue.isNull()){
			System.out.println(queue.deQueue());
		}
	}
	
}

class MyQueue{
	private LinkedList link;
	MyQueue(){
		link = new LinkedList();
	}
	//入列
	public void enQueue(Object obj){
		link.addLast(obj);
	}
	
	//出列
	public Object deQueue(){
		return link.removeFirst();
	}
	
	public boolean isNull(){
		return link.isEmpty();
	}
	
//	public String toString(){
//		return link;
//	}
}