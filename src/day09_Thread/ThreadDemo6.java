package day09_Thread;
/**
 * 线程的优先级
 * 线程的时间片分配完全听线程调度的。线程只能被动的被分配时间，对于线程调度的工作不能干预。
 * 但是可以通过提高线程的优先级来达到尽可能干预的目的。
 * 
 * 理论上，优先级越高的线程，获取CPU时间片的次数就越多。
 * 是获得CPU的概率问题而非优先问题
 * @author zhangchi
 *
 */
public class ThreadDemo6 {

	public static void main(String[] args) {
		
		System.out.println("max:"+Thread.MAX_PRIORITY);//1
		System.out.println("min:"+Thread.MIN_PRIORITY);//10
		
		Thread min=new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("min");
				}
			}			
		};
		
		Thread max=new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("max");
				}
			}			
		};
		
		Thread normal=new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("normal");
				}
			}			
		};
		
		min.setPriority(Thread.MIN_PRIORITY);
		max.setPriority(Thread.MAX_PRIORITY);
		
		min.start();
		max.start();
		normal.start();
		
		
	}
}
