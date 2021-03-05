package day09_Thread;
/**
 * 进程:当前PC操作系统正在运行的程序,在内存中开辟的一块被占用的内存.
 * 		一个进程由一个至多个线程构成,进程的执行实际上是线程在执行
 * 		如果一个进程由多个线程构成,就是多线程程序
 * 线程:负责程序执行的一条执行路径,也称为一个执行单元。
 * 		多线程实现了不同功能或相同功能同时执行的效果。相当于多个窗口,在同时处理业务。
 * 		多线程不一定能提高效率,但是能够充分利用CPU资源,关键是实现了在一个程序中相同功能或不同功能的同时执行效果
 * @author zhangchi
 *
 */
public class ThreadDemo {
	public static void main(String[] args) {	//主线程:负责执行main函数中的代码
		/**
		 * java程序是不是多线程程序?
		 * 至少有一个负责执行main中的代码的线程,这个线程就是主线程
		 * 还得有一个负责垃圾回收的线程,执行的是finalize方法中的代码
		 * 
		 * 线程执行的代码不同,代码所写的位置就不同
		 * 线程的任务:线程执行的代码
		 * 			线程的任务不同,任务代码缩写的位置肯定不同
		 */
		//任何一个对象都能被回收,回收的功能定义在了Object中
		new Test();//垃圾回收线程负责回收垃圾,
		new Test();
		new Test();
		System.gc();//强制执行GC!! GC是守护线程,主线程结束,即使没有回收完,也会立即结束
		System.out.println("hello");
	}
}

class Test{
	public void finalize(){
		System.out.println("被回收了");
	}
}