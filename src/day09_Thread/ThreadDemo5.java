package day09_Thread;
/**
 * 获取线程相关信息的方法
 * @author zhangchi
 *
 */
public class ThreadDemo5 {

	public static void main(String[] args) {
		//获取运行main方法的线程
		Thread main = Thread.currentThread();
		long id = main.getId();
		System.out.println(main);
		System.out.println("id:"+id);
		
		String name=main.getName();
		System.out.println("name:"+name);
		
		int priority=main.getPriority();
		System.out.println("优先级:"+priority);
		
		boolean isAlive=main.isAlive();
		System.out.println("是否存活:"+isAlive);
		
		boolean isDaemon=main.isDaemon();
		System.out.println("是否为守护线程:"+isDaemon);
		
		boolean isInterrupted =main.isInterrupted();
		System.out.println("是否被中断:"+isInterrupted);
		
		//Thread.yield();//执行了该语句的线程会进入就绪状态,但仍然可以争抢CPU
	}
}
