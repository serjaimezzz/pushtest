package day08_Exception;
/**
 * finally块
 * finall块定义在异常捕获机制的最后，可以直接跟在try块之后或者最后一个catch块之后。
 * finally块中的代码一定执行，无论try块中的代码是否抛出异常，所有通常会把释放资源等操作放在finally中，例如关闭流。
 * @author zhangchi
 *
 */
public class ExceptionDemo2 {

	public static void main(String[] args) {
		System.out.println("程序开始");
		try {
			String str = "";
			System.out.println(str.length());		
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("出错了");				
		} finally {		
			System.out.println("finally代码执行" );//即使try中有return,finally语句块仍然会执行
		}
		System.out.println("程序结束");
		
	}
}
