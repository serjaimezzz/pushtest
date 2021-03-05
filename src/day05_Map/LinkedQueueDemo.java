package day05_Map;

import java.util.LinkedList;
/**
 * ���ü������Լ���װ������
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
	//����
	public void enQueue(Object obj){
		link.addLast(obj);
	}
	
	//����
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