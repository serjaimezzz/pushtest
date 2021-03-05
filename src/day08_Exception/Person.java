package day08_Exception;
/**
 * 用来测试throw与throws
 * @author zhangchi
 *
 */
public class Person {
	private int age;

	public int getAge() {
		return age;
	}

	/**
	 * 当一个方法中使用throw抛出一个异常时，就要在方法上使用throws声明该类异常的抛出以及通知调用者解决。
	 * 只有RuntimeException及其子类异常使用throw抛出时不强制要求必须使用throws声明。
	 * 其他异常都是强制要求的，否则编译不通过。
	 * @param age
	 * @throws Exception
	 */
	public void setAge (int age) throws IllegalAgeException{//声明异常
		if(age < 0 || age > 100){
			throw new IllegalAgeException("年龄不合法");//抛出异常是非运行时异常时需要声明异常
//			throw new RuntimeException("");//不声明也能通过编译--常识S性错误
		}
		this.age = age;
	}
	
}
