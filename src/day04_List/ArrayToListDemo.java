package day04_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 数组转换为集合,可以使用集合中丰富的方法
 * 需要注意，转换只能转换为List集合
 * 使用的是数组的工具类Arrays的静态方法asList
 * 只能转换为List集合的主要原因是:Set不能存放重复元素。
 * 所以若转换为Set集合可能出现丢失元素的情况。
 * @author zhangchi
 *
 */
public class ArrayToListDemo {

	public static void main(String[] args) {
		String[] array={"one","two","three","four"};
		
		List<String> list=Arrays.asList(array);		
		System.out.println(list);
		
		/**
		 * 向集合中添加一个元素
		 * 实际下面的代码会抛出异常。原因在于，该集合是由数组转换过来的，那么该集合就表示原来的数组
		 * 所以对集合的操作就是对数组的操作。那么添加元素会导致原数组扩容，那么就不能表示原来的数组了。
		 * 所以不允许向该集合添加新元素。
		 */
		//list.add("five");
		
		//修改集合元素，数组元素也会改变
		list.set(1, "2");
		System.out.println(list);
		
		//输出数组元素
		for(String str:array){
			System.out.println(str);
		}
		
		
		/*
		 * 若希望增删元素，需要另创建一个集合
		 */
		
		/**
		 * 所有的集合都提供了一个带有Collection类型参数的构造方法。
		 * 该构造方法称为:复制构造器
		 * 作用是在创建当前集合的同时，集合中包含给定集合中的所有元素
		 */
		List<String> list1=new ArrayList<String>(list);	//集合的构造方法
		list1.add("five");
		System.out.println(list1);
		
	}
}
