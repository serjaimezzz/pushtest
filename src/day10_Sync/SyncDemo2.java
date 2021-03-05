package day10_Sync;
/**
 * 同步块 ,同步锁:当两个线程看到synchronized修饰同一段代码，同步监视器对象一致时，不能同时进行
 * 有效的缩小同步范围可以在保证并发安全的同时尽可能提高并发效率
 * 
 * 同步锁:两个线程看到的是synchronized修饰的是同一段代码,只要同步监视器对象一致
 * 即两个线程不能同时访问这一段代码,共用一把锁
 * @author zhangchi
 *
 */
public class SyncDemo2 {
	public static void main(String[] args) {
		final Shop shop1=new Shop();
//		final Shop shop2=new Shop();
		
		//在同一个店中,试衣服要排队,同步执行
		Thread t1=new Thread(){
			public void run(){
				shop1.buy();
			}
		};
		
		Thread t2=new Thread(){
			public void run(){
				shop1.buy();
			}
		};
		
		t1.start();
		t2.start();
	}
}

class Shop{
	public void buy(){
		//获取运行buy方法的线程
		Thread t=Thread.currentThread();	
		try{
			System.out.println(t.getName()+"正在挑衣服");
			Thread.sleep(1000);
			
			/**
			 * 同步块可以要求多个线程对该块内的代码排队执行，但是前提条件是同步监视器对象
			 * 即(上锁的对象)要求多个线程看到的必须是同一个。
			 * synchronized(同步监视器对象){
			 *         需要同步的代码
			 * }
			 * 所谓同步执行即:多个线程必须排队执行
			 * 所谓异步执行即:多个线程可以同时执行     
			 */
			
			//同步执行,给调用该方法的对象加锁
			synchronized(this){
			System.out.println(t.getName()+"正在试衣服");
			Thread.sleep(5000);
			}
			
			System.out.println(t.getName()+"结账离开");			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}