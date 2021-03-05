package day05_Map;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈
 * 存储一组元素，但是存取元素必须遵循先进后出原则。
 * 通常为了实现后退这类功能时会使用栈
 * @author zhangchi
 *
 */
public class StackDemo {

	public static void main(String[] args) {
		/*
		 * java.util.Deque
		 * 双端队列，两端都可以进出队列。
		 * 当只调用从一端进出队列操作时，就形成了栈结构。
		 * 因此，双端队列为栈提供了两个方法:push,pop
		 */
		
		Deque<String> stack=new LinkedList<String>();
		/*
		 * void push(E e)
		 * 入栈操作，最后入栈的元素在栈顶(第一个元素位置)
		 */
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		System.out.println(stack);
		
		/*
		 * 出栈操作
		 * E pop()
		 */
		String str=stack.pop();
		System.out.println(str);
		System.out.println(stack);
		
		//遍历
		for(int i=stack.size();i>0;i--){
			str=stack.pop();
			System.out.println(str);
		}
		
		
		
		
		
	}
}
