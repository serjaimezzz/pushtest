package LambdaDemo;
/**
 * 构造方法引用
 * @author zhangchi
 *
 */
public class LambdaDemo4 {
	public static void main(String[] args) {
		//匿名内部类
		Tests1 t = new Tests1(){
			public Person value(){
				System.out.println("匿名内部类test");
				return null;}
		};
		t.value();
		
		Tests1 p = () -> new Person("p",1);
		System.out.println("p:"+p.value());
		
		/*
		 * 接口名 inter = 类名::new;
		 * 类名 person = inter.test();	//给构造赋值
		 */
		
		Tests1 t1 = Person :: new;	//引用构造方法
		Person p1 = t1.value();	//引用哪一个方法由test方法参数决定,此处引用无参构造
		System.out.println("p1:" + p1);
		
		Tests2 t2 = Person::new;
		Person p2 = t2.value("t2", 2); // 引用 = 有参构造
		System.out.println("p2:" + p2);
		
	}
}

class Person{
	private String name;
	private int age;
	Person(){}
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	String getInfo(){
		System.out.println("name:"+name + ",age:"+age);
		return "name:"+name + ",age:"+age;
	}
	
	public String toString(){
		
		return name + "," +age;
	}
	
}

@FunctionalInterface
interface Tests1{
	Person value();
}

//有且只有一个必须被重写的抽象方法的接口就是函数式接口
interface Tests2{
	Person value(String name,int age);
}