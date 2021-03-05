package day05_Map;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue
 * ����
 * ����Ҳ���Դ��һ��Ԫ�أ����Ǵ�ȡԪ�ر�����ѭ:�Ƚ��ȳ�ԭ��
 * @author zhangchi
 *
 */
public class QueueDemo {

	public static void main(String[] args) {
		/**
		 * LinkedListҲʵ���˶��нӿڣ���Ϊ�����Ա���һ��Ԫ�أ�������β��ɾ�졣���÷��϶��е��ص㡣
		 */
		Queue<String> queue=new LinkedList<String>();
	/*
	 * boolean offer(E e)
	 * ��Ӳ��������β׷��һ����Ԫ��
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
		 * ���в������Ӷ��׻�ȡԪ�أ���ȡ���Ԫ�ؾʹӶ����б�ɾ����
		 */
		String str=queue.poll();
		System.out.println(str);
		System.out.println(queue);
		
		/*
		 * E peek()
		 * ���ö���Ԫ�أ����ǲ������в���
		 */
		str=queue.peek();
		System.out.println(str);
		System.out.println(queue);
		System.out.println("size:"+queue.size());
		
		
		//����ʱ��i++������,���г��Ȼ᲻�ϼ�С
		for(int i=queue.size();i>0;i--){
			str=queue.poll();
			System.out.println("ȡ��Ԫ��:"+str);
		}
		System.out.println("�������");
		System.out.println(queue);
		
		while(queue.size()>0){
			str=queue.poll();
			System.out.println("ȡ��Ԫ��:"+str);
		}
		
	}
}
