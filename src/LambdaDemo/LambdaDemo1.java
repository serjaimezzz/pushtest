package LambdaDemo;
/**
 * 接口名   =  lambda表达式	: 匿名函数
 * 		 (接口中方法的参数列表) -> {重写接口的方法}
 * 简化,并发量大时不会出问题。
 */
public class LambdaDemo1 {
	public static void main(String[] args) {
		Face1 f1 = () -> {System.out.println("f1_test");};	
		f1.test();
		Face2 f2 = a -> System.out.println("a:" + a);
		f2.test(2);
		Face3 f3 = (a,b) -> {System.out.println("a:" + a + ",b:" + b);};
		f3.test(1,2);
		
		Face4 f4 = () -> {return 4;};			//无参有返回值
		System.out.println("f4:" + f4.test());
		
		Face5 f5 = (a) -> {return a;};
		System.out.println("f5:" + f5.test(5));
		
		Face6 f6 = (a,b) -> {return a+b;};
		System.out.println("f6:" + f6.test(3, 3));
		
		//参数类型可以省略
		//如果只有一个参数,()也可以省略;如果{}中只有一条语句,{}也可以省略
		Face2 f7 = a -> System.out.println("a:"+a);
		f7.test(7);
		
		//如果{}中只有一条return语句,则return 可以省略
		Face5 f8 = a -> a;
		System.out.println("f8:"+f8.test(8));
	
	}
}

interface Face1{
	void test();
}

interface Face2{
	void test(int a);
}

interface Face3{
	void test(int a,int b);
}

interface Face4{
	int test();
}

interface Face5{
	int test(int a);
}

interface Face6{
	int test(int a,int b);
}