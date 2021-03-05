package day04_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import day05_Map.Point;

/**
 * 排序自定义类型元素的集合
 * @author zhangchi
 *
 */
public class ListSortDemo1 {

	public static void main(String[] args) {
		List<Point> list=new ArrayList<Point>();
		list.add(new Point(4,2));	//需要Point类实现Comparable接口并重写compareTo()方法
		list.add(new Point(2,3));	//哪个类实现这个接口,<>就用哪个类
		list.add(new Point(1,4));
		list.add(new Point(6,7));
		list.add(new Point(9,3));
		list.add(new Point(8,1));
		System.out.println(list);
		
		/**
		 * sort方法要求集合元素必须实现Comparable接口，
		 * 该接口用于规定实现类是可以比较的。
		 * 其有一个抽象方法是用来定义比较大小的规则。
		 * 
		 * 我们想使用sort方法排序集合，但是该方法要求我们的集合元素必须实现Comparable接口
		 * 并且定义比较规则，这种我们想使用某个功能，而它要求我们修改程序的现象称为"侵入性"。
		 * 修改的代码越多，侵入性越强，越不适合程序的扩展。
		 */
		Collections.sort(list);
		System.out.println(list);
	
		
	}
}
