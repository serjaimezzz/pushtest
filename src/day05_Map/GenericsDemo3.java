package day05_Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 泛型限定
 * @author zhangchi
 *
 */
public class GenericsDemo3 {
	public static void main(String[] args) {
		ArrayList<Students> list1 = new ArrayList<>();
//		list1.add(new Students(20,""));
	
	}
	
	//<? extends E>:限定了上限,只能是E或E的子类类型
	//<? super E>:限定了下限,只能是E或E的父类类型
	public static void iter2(Collection<? extends Personal> col){
		Iterator<? extends Personal> ite = col.iterator();
		while(ite.hasNext()){
			Personal ele = ite.next();
			System.out.println(ele);
		}
	}
}

class Personal{
	private int age;
	private String name;
	Personal(){}
	public Personal(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
}

class Students extends Personal{
	int num;
	String name;
	Students(){}
	Students(int num,String name){}
}

class Workers extends Personal{
	
}

