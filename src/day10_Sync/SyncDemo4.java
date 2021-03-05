package day10_Sync;
/**
 * 互斥锁：一个类中的两个方法都有synchronized修饰
 * synchronized也叫互斥锁，即:
 * synchronized修饰的是几段不同的代码，但是他们的锁对象相同, 只要他们的同步监视器对象相同，
 * 那么这几段代码间就是互斥关系，即:多个线程不能同时执行这些代码
 * @author zhangchi
 *
 */
public class SyncDemo4 {
	public static void main(String[] args) {
		final Boo boo=new Boo();  //boo是同一个对象，所有仍需排队
		
		Thread t1=new Thread(){
			public void run(){
				boo.methodA();
			}
		};
		
		Thread t2=new Thread(){
			public void run(){
				boo.methodB();
			}
		};
		
		t1.start();
		t2.start();
	}	
}

class Boo{
	
	public synchronized void methodA(){
		try {
			Thread t=Thread.currentThread();
			System.out.println(t.getName()+"正在执行A方法");
			Thread.sleep(2000);
			System.out.println(t.getName()+"运行A方法完毕");
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public  void methodB(){
		synchronized(this){
		try {
			Thread t=Thread.currentThread();
			System.out.println(t.getName()+"正在执行B方法");
			Thread.sleep(2000);
			System.out.println(t.getName()+"运行B方法完毕");
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	}
}