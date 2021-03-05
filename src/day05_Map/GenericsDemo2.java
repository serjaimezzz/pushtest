package day05_Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericsDemo2 {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("java01");
		list1.add("java02");
		list1.add("java03");
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(01);
		list2.add(02);
		list2.add(03);
	}
	
	//没有用到非静态变量,可以用static 
	//静态方法只能自己用泛型
	public static<E> void iter(Collection<E> col){
		Iterator<E> ite = col.iterator();
		while(ite.hasNext()){
			E ele = ite.next();
			System.out.println(ele);
		}
	}
	
	//通配符	?:可使用任意类型
	//static 可省略<>
	public static void iter2(Collection<?> col){
		Iterator<?> ite = col.iterator();
		while(ite.hasNext()){
			Object ele = ite.next();
			System.out.println(ele);
		}
	}
	
	
}
