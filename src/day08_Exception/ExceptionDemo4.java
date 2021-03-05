package day08_Exception;
/**
 * 测试异常的抛出
 * @author zhangchi
 *
 */
public class ExceptionDemo4 {

	public static void main(String[] args) {
		Person p=new Person();
		/*
		 * 当调用一个含有throws声明异常抛出的方法时，编译器要求处理该异常。
		 * 处理手段有两种:
		 * 1.使用try-catch捕获并处理。
		 * 2.在当前方法上继续使用throws声明该异常的抛出。
		 */		
		try {
			p.setAge(200);
		} catch (IllegalAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			/*	常用方法:
			e.printStackTrace();//跟踪堆栈信息	打印出的堆栈日志跟业务代码日志是交错混合在一起的，通常排查异常日志不太方便。
			
			e.getMessage();//发生异常的详细消息描述	如:FileNotFoundException异常发生时，这个detailMessage就包含这个找不到文件的名字。
			
			e.getLocalizedMessage();//子类可重写此方法,以生成特定于语言环境的消息。对于不覆盖此方法的子类，默认实现返回与相同的结果 getMessage()。
			
			e.getCause();//返回可抛出时间的原因,如果原因不存在或未知,返回null	
			*/
		}

		System.out.println("年龄为:"+p.getAge());
		
		
	}

}
