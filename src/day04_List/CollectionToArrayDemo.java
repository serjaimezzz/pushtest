package day04_List;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合转换为数组
 * @author zhangchi
 *
 */
public class CollectionToArrayDemo {

	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		
		//Object[] array=c.toArray();  //不常用
		//System.out.println(array);
		
		/*
		 * 若给定的数组可用(数组可以存放集合所有元素)时，则使用该数组，
		 * 若不可用，会自动创建一个与给定数组同类型的数组
		 */
		String[] array=c.toArray(new String[c.size()]);
		System.out.println("len:"+array.length);
		for(String str:array){
			System.out.println(str);
		}
		
		
		
	}
}
