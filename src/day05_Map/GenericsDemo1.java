package day05_Map;
/**
 * 泛型接口
 * interface inter<E>{
 * 		void show(E e);//和接口上的泛型的类型一致
 * 		void fun(String t);
 * }
 * @author zhangchi
 *
 */
public class GenericsDemo1 {
	public static void main(String[] args) {
		InterTest t = new InterTest();
		t.show(88); //自动装箱
		
		//在使用类的时候再确定类型
		InterTest2<Integer> t2 = new InterTest2<>();
		t2.show(15);
		
	}
}

interface inter<E>{
	void show(E e);//和接口上的泛型的类型一致
	void fun(String t);
}

class InterTest implements inter<Integer>{

	@Override
	public void show(Integer e) {
		System.out.println(e);
	}

	@Override
	public void fun(String t) {
		System.out.println(t);
	}
	
}

class InterTest2<T> implements inter<T>{

	@Override
	public void show(T e) {
		System.out.println(e);
	}

	@Override
	public void fun(String t) {
		System.out.println(t);
	}
	
}

