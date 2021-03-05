package day05_Map;

import java.util.*;

import day04_List.*;
/**
 * Hash:使用的是哈希表实现数据的存储
 * Set:无序,存储对象是不可重复的
 * 		无序:集合中存储数据的顺序和用户添加数据的顺序不一致
 * 
 * HashSet如何保证数据的不重复:
 * 根据要添加的数据的hashCode()计算出的值进行运算,使用这个运算的结果计算出一个数组的下标值,
 * 		如果该位置没有数据,这个下标位置就是数据的存放位置
 * 		如果该位置有数据,这个数据就会链接在该位置的nextNode
 * 			
 * @author zhangchi
 */
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<>();
		set.add(new Student("zhangsan",26));//使用add方法添加时,已经保证了数据的不重复
		set.add(new Student("lisi",26));	//数组加链表实现
		set.add(new Student("wangwu",26));	//元素的存放地址传给引用
		set.add(new Student("zhaoliu",26));	
		set.add(new Student("wangwu",26));//如果计算出的hashCode仍然相同(hash冲突),会链在同位置的后一个Node上
		System.out.println(set);
		
		Iterator<Student> it = set.iterator();
		while (it.hasNext()) {
			Student student = (Student) it.next();
			System.out.println(student);
		}
		
	}
}
