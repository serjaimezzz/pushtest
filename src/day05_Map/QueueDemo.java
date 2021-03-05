package day05_Map;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue
 * 队列
 * 队列也可以存放一组元素，但是存取元素必须遵循:先进先出原则
 * @author zhangchi
 *
 */
public class QueueDemo {

	public static void main(String[] args) {
		/**
		 * LinkedList也实现了队列接口，因为它可以保存一组元素，并且首尾增删快。正好符合队列的特点。
		 */
		Queue<String> queue=new LinkedList<String>();
	/*
	 * boolean offer(E e)
	 * 入队操作，向队尾追加一个新元素
	 */
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");	
		queue.offer("five");
		queue.offer("six");
		System.out.println(queue);
		
		/*
		 * E poll()
		 * 出列操作，从队首获取元素，获取后该元素就从队列中被删除了
		 */
		String str=queue.poll();
		System.out.println(str);
		System.out.println(queue);
		
		/*
		 * E peek()
		 * 引用队首元素，但是不做出列操作
		 */
		str=queue.peek();
		System.out.println(str);
		System.out.println(queue);
		System.out.println("size:"+queue.size());
		
		
		//遍历时，i++会自增,队列长度会不断减小
		for(int i=queue.size();i>0;i--){
			str=queue.poll();
			System.out.println("取出元素:"+str);
		}
		System.out.println("遍历完毕");
		System.out.println(queue);
		
		while(queue.size()>0){
			str=queue.poll();
			System.out.println("取出元素:"+str);
		}
		
	}
}
