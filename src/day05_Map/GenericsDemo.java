package day05_Map;

/**
 * 泛型:通过<>接收一种引用数据类型,作用是在编译时期就检查集合中存放的数据是否和泛型指定的数据类型是否一致。
 * 如果不一致,编译出错RE,从而把运行时期的问题转移到了编译时期,提高了程序的安全性
 * 在定义类时定义了泛型,该类才能使用泛型。
 * 使用时,当类上的泛型确定了,该方法的参数的类型才确定。
 * since jdk1.5
 * 
 * 格式:引用类型<> 引用变量 =new 引用类型<>();  
 * 			<>指定类型
 * @author zhangchi
 *
 */
public class GenericsDemo {
	public static void main(String[] args) {
	
	}
}

class Worker{
	
}

class GTest<T>{
	//当类上的泛型确定了,该方法的参数的类型才确定
	public void show(T t){
		System.out.println(t);
	}
	
	//方法自己用泛型,和类上的泛型没有关系
	public <E> void fun(E t){	//类上的参数什么类型都可以
		System.out.println(t);
	}
	
	//静态方法只能自己用泛型,泛型是在创建对象时确定的,而静态方法不需要对象
	public static <E> void ff(E t){
		System.out.println(t);
	}
	
}

class Tool{
	private Object obj;
	
	Tool(){}
	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
}