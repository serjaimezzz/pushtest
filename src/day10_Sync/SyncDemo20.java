package day10_Sync;
/**

 * @author zhangchi
 *
 */
public class SyncDemo20 {
	public static void main(String[] args) {
		final Shops shop1=new Shops();
		final Shops shop2=new Shops();
		
		Thread t1=new Thread(){
			public void run(){
				shop1.buy();
			}
		};
		
		Thread t2=new Thread(){
			public void run(){
				shop2.buy();
			}
		};
		
		t1.start();
		t2.start();
	}
}

class Shops{
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
			//				对任意一个对象加锁,该对象的任务执行完毕后,锁释放
			synchronized(new Object()){//给当前调用该方法的使用者  加锁，结束释放
			System.out.println(t.getName()+"正在试衣服");
			Thread.sleep(5000);
			}
			
			System.out.println(t.getName()+"结账离开");			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}