package day05_Map;

import java.util.HashSet;

import day05_Map.*;
/*
 * HomeWork
 * 1.设计一个动物类Animal类，有编号，姓名，性别，年龄属性，将多个动物对象添加到一个HashSet集合中时，
 *	若所有的属性值都相同则为相同对象；在主方法中创建三个Animal对象，添加到一个HashSet集合中，输出集合中元素的个数
 */
public class AnimalTest {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(new Animal(1,"s",'M',1));	//存放的是对象的地址
		hs.add(new Animal(1,"s",'M',1));
		hs.add(new Animal(1,"s",'M',1));
		System.out.println(hs + "\n size:" + hs.size() );
		
		
	}
}
