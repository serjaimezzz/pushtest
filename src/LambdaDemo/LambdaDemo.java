package LambdaDemo;
/**
 * Lambda表达式 与 匿名内部类的比较
 * @author zhangchi
 *
 */
public class LambdaDemo {
	public static void main(String[] args) {
		Lamb l = new Lamb();	//构造
		int sum = l.add(5, 1);	//调用构造内的方法
		System.out.println("lamb:"+sum);
		
		//匿名内部类,匿名子类对象
		inter in = new inter(){		//实现了inter接口,创建一个子类对象,重写了接口的方法
			public int add(int a,int b){
				return a + b ;	
			}
		};
		sum = in.add(5, 7);	//调用了接口inter中被重写之后的方法
		System.out.println("in:" + in);
		System.out.println(sum);
		
		/**
		 * lambda表达式	: 匿名函数
		 * 前提条件: 必须是接口,接口中有且只有一个必须被重写的抽象方法
		 * inter in = () -> { };
		 * 可以使用lambda表达式的接口称为函数式接口
		 */
		inter tt = (a,b) -> {return a * b;};	//实际上,实现的是return 里面的表达式
		System.out.println(tt); //仅打印tt的地址信息
		System.out.println("tt:"+tt.add(2, 8));
		
		/**
		 *  静态方法引用:接口中的参数和返回值和某个  类中的静态方法的参数和返回值完全一致
		 * 	接口名 引用变量名  = 类名::方法名
		 * 	非静态方法引用:接口中的参数和返回值和某个  类中的非静态方法的参数和返回值完全一致
		 *	接口名 引用变量名  = new 类名()::方法名
		 */
		
		inter in1 = Calculate :: calculates;	//静态方法引用
		System.out.println(in1.add(3, 5));//8
		
		inter in2 = new Calculate()::calculate;//非静态方法引用
		System.out.println(in2.add(3, 5));//15
		
		
	}
}

@FunctionalInterface//验证interface是不是函数式接口
interface inter{	//是函数式接口,能使用lambda表达式
	int add(int a,int b);	//有且只能有一个必须被重写的抽象方法	//方法默认被修饰成为public abstract方法
//	int mul(int a,int b);	
}

//Invalid '@FunctionalInterface' annotation; inter1 is not a functional interface
//@FunctionalInterface	
//interface inter1 extends inter{	//继承了父类中的方法,不能作为函数式接口
//	int plus(int a, int b);
//}

@FunctionalInterface
interface inter2 extends inter{
	static void print(){}
	default void prt(){}
	String toString();
}

class Lamb implements inter{
	public int add(int a,int b){
		return a + b;
	}
	public int mul(int a,int b){
		return a * b;
	}
}

class Calculate{
	public static int calculates(int a, int b){
		return a + b;
	}
	
	public int calculate(int a,int b){
		return a * b;
	}
}