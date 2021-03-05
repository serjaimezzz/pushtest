package day05_Map;

import java.util.Comparator;
import java.util.TreeSet;

import day05_Map.*;

/**
 * TreeSet:无序不可重复,可以对添加的对象进行排序
 * 底层使用的数据结构是:二叉树
 * @author zhangchi
 *
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		
		AComparator ac = new AComparator();//优先使用Comparator,如果没有再使用Comparable ---from TreeMap.class
		TreeSet<Animal> ts = new TreeSet<>(ac);
		/*
		 * 向集合中添加的对象所属的类必须实现Comparable接口中的int compareTo()方法
		 * TreeSet集合就是调用添加的对象的compareTo方法来确定谁大谁小,从而实现了排序
		 * compareTo:
		 * 当返回值为0时,认为是同一个对象,不加入集合(保证对象唯一的方式)
		 */
		ts.add(new Animal(1,"a"));//未重写时,java.lang.ClassCastException
		ts.add(new Animal(2,"a"));
		ts.add(new Animal(3,"x"));
		ts.add(new Animal(2,"e"));
		System.out.println(ts);		//优先使用Comparator的排序规则
		
		
		
	}
	}
	/**
	 * 类现有的
	 * 自定义一种比较大小的方法:单独写一个类,类中实现的是比较大小
	 */
class AComparator implements Comparator{
	public int compare(Object o1,Object o2){
		if(!(o1 instanceof Animal))
			throw new ClassCastException();
		if(!(o2 instanceof Animal))
			throw new ClassCastException();
		Animal a1 = (Animal)o1;
		Animal a2 = (Animal)o2;
		return a1.getName().compareTo(a2.getName());
	}


}
