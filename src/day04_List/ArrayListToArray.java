package day04_List;

import java.util.*;
/**
 * 集合转数组:可以防止数据的随意改动
 * <T> T[] toArray(T[] a)
 * @author zhangchi
 *
 */
public class ArrayListToArray {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("bg");
		list.add("sql");
		list.add("cccc");
		
		/*
		//给定数组长度 < 集合的大小,不会使用给定的数组
		String[] arr1 = list.toArray(new String[1]);
		for (String string : arr1) {
			System.out.println(string);
		}
		System.out.println(arr1.length);//3
		
		//给定数组长度 >= 集合的大小,会使用给定的数组
		String[] arr2 = list.toArray(new String[5]);
		for (String string : arr2) {
			System.out.println(string);
		}
		System.out.println(arr2.length);//5
		*/
		
		//list中有几个数据,数组长度就是list.size()
		String[] arr = list.toArray(new String[list.size()]);
		
	}
}
