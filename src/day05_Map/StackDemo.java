package day05_Map;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ջ
 * �洢һ��Ԫ�أ����Ǵ�ȡԪ�ر�����ѭ�Ƚ����ԭ��
 * ͨ��Ϊ��ʵ�ֺ������๦��ʱ��ʹ��ջ
 * @author zhangchi
 *
 */
public class StackDemo {

	public static void main(String[] args) {
		/*
		 * java.util.Deque
		 * ˫�˶��У����˶����Խ������С�
		 * ��ֻ���ô�һ�˽������в���ʱ�����γ���ջ�ṹ��
		 * ��ˣ�˫�˶���Ϊջ�ṩ����������:push,pop
		 */
		
		Deque<String> stack=new LinkedList<String>();
		/*
		 * void push(E e)
		 * ��ջ�����������ջ��Ԫ����ջ��(��һ��Ԫ��λ��)
		 */
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		System.out.println(stack);
		
		/*
		 * ��ջ����
		 * E pop()
		 */
		String str=stack.pop();
		System.out.println(str);
		System.out.println(stack);
		
		//����
		for(int i=stack.size();i>0;i--){
			str=stack.pop();
			System.out.println(str);
		}
		
		
		
		
		
	}
}
