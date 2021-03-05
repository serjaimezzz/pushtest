package day10_Sync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池:
 * 1.重用线程
 * 2.控制线程数量
 * 当我们的应用需要创建大量线程或者发现线程,
 * 会频繁的创建和销毁线程时，就应当考虑使用线程池来维护线程
 * @author zhangchi
 * //线程池内部有一个队列Q,Q中存放线程要执行的任务
 *
 */
public class ThreadPoolDemo {

	public static void main(String[] args) {
		//创建线程池,执行器服务,不能实例化
		ExecutorService threadPool=Executors.newFixedThreadPool(2);
		
		for(int i=0;i<5;i++){
			Runnable r=new Runnable(){//匿名内部类使用的变量必须是final的
				public void run(){
					Thread t=Thread.currentThread();
					try {
						System.out.println(t+":正在运行任务");
						Thread.sleep(5000);
						System.out.println(t+"任务运行完毕");
					} catch (Exception e) {
						System.out.println("线程被中断了");
					}
				}
			};
			//分配任务
			threadPool.execute(r);
			System.out.println("指派了一个任务交给线程池");
		}
	//	    threadPool.shutdown();   //干完活再停
	//	    threadPool.shutdownNow();//立即停止线程 
	//	    System.out.println("线程池停止了！");
		
		
		
	}
}
/**
 * Executors.
 * newCachedThreadPool()
 * 创建缓存型的线程池,弹性好,并不关注线程数量,比如瞬间给100个任务,就会瞬间创建100个线程
 * 线程空闲时,线程池会设置超时时间,然后将其删除
 * 
 * newFixedThreadPool(int nThreads)
 * 创建可重用的固定线程集合的线程池,先执行完n个任务,再继续执行其他的任务
 * 
 * newScheduledThreadPool(int corePoolSize)
 * 创建一个线程池,可安排在给定延迟后运行命令或者  定期执行任务
 * 
 * newSingleThreadExecutor()
 * 单线程模式,光杆司令
 * 
 */

