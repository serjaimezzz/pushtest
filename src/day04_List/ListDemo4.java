package day04_List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo4 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
		list.forEach(t -> System.out.println(t));
		list.forEach(System.out::print);
		
		
		ListIterator<String> ite = list.listIterator();		//List特有的迭代器,在迭代过程中可对集合进行添加,修改,删除元素
		while(ite.hasNext()){
			String str = (String)ite.next();
			if(str.equals("c"))
				ite.add("cc");	//在"c"后面增加"cc"
			if(str.equals("d"))
				ite.set("ss");	//把"c"改为"ss"
			if(str.equals("e"))
				ite.remove();
			System.out.println(str);
//			String str1 = (String)ite.next();
		}		
		for (Object object : list) {
			System.out.print(object);//abcccss
		}	
		System.out.println("\n------");
		/**
		 *  boolean hasPrevious();
		 *  如果ite前面还有元素,就输出
		 *  所以只能先顺序遍历,再逆序遍历
		 *  仅对迭代器迭代出来的元素生效
		 */
	
		while(ite.hasPrevious())
			System.out.print(ite.previous());//逆序遍历
		System.out.println("\n------");
	
		
		//按下标遍历
		for (int i = 0; i < list.size(); i++) {	
			System.out.print(list.get(i));
		}
		System.out.println("\n------");
		
		//遍历之后,删除下标0之后的元素
		while(!list.isEmpty())
			System.out.print(list.remove(0)); 
		System.out.println(list); 
	}
}
