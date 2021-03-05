package day08_Exception;
/**
 * java异常捕获机制中的try-catch
 * try块是用来扩上可能出错的代码片段
 * catch块是用来捕获try块中代码抛出的错误，并解决。
 * @author zhangchi
 *
 */
public class ExceptionDemo1 {
	/**
	 * 永远不要在main方法后面throws声明异常!!!!!!!!!!
	 * throws="丑化说前面"。main方法是由JVM虚拟机调用的。(会被干掉)JVM会调printStackTrace()
	 * main:我可告诉你,我可能会报错啊!!!
	 * JVM:你吓唬谁呢?你报个试试??
	 */
	public static void main(String[] args) {
		System.out.println("程序开始");
		
		try{
			String str="a";
			/*
			 * JVM在执行代码的过程中若发现了一个异常，则会实例化这种情况的异常实例，
			 * 并将代码整个执行过程完整设置到异常中来表示该错误报告，设置完毕后将该异常抛出。
			 * 若抛出异常的这句代码有被try包围，则JVM会检查catch中是否有关注该异常，
			 * 关注则交给catch并解决,否则会将异常抛出到当前方法外，由调用当前方法的代码解决该异常。
			 */
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			System.out.println(Integer.parseInt(str));
			
		} catch (NullPointerException e) {	//能捕获到就已经算是处理了,但是要尽量避免不处理
			System.out.println("出现了空指针");
			
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("字符串下标越界了");
			
		} catch (Exception e) {// 在最后一个catch中捕获Exception，避免因未捕获异常导致程序中断
			System.out.println("出现了未知错误");
			/**
			 * 当多个catch捕获不同异常时，这些异常间存在继承关系时，那么子类异常要先行捕获。
			 * 比如Exception是所有Exception类异常的父类，应该放在最后一个catch。
			 */
		}
		
		
		System.out.println("程序结束");
	}
}
