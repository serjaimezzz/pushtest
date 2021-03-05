package day09_Thread;
/**
 * join()
 * 让线程加入运行
 * @author zhangchi
 *
 */
public class ThreadDemoE {
	public static void main(String[] args) throws InterruptedException{
		Task t = new Task();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		
		t1.start();
//		t1.join();//这时有主线程和t1线程,main线程会等待t1执行完才开始执行线程
					//主线程可以获取t1的执行结果
		t2.start();
		t1.join();//main线程等到t1执行完就开始执行;t2不一定等,正常执行
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}

class Task implements Runnable{
	public void run(){
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}