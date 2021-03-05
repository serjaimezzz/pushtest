package day09_Thread;
/**
 * 第二种 创建线程的方式
 * 1.定义一个类,实现Runnable接口
 * 2.重写Runnable接口中的run方法:run方法中写的是线程的任务代码
 * 3.创建这个类的实例
 * 4.创建	Thread的对象,把Runnable的子类对象传给Thread
 *
 *	把任务面对了对象,单独定义了一个任务类,使用Thread创建线程,想让线程执行什么任务就把那个任务对象
 *	传给线程,线程执行的任务是可以动态传递的
 *	任务有任务类,线程有线程类,更加面对对象,
 * @author zhangchi
 *
 */
public class ThreadDemo2 {

	public static void main(String[] args) {
		//单独定义任务
//		Runnable r1=new MR1();
//		Runnable r2=new MR2();
		Ticket t = new Ticket();//创建任务对象
		//存在安全问题
//		Thread t5 = new Thread(new Ticket(){
//			while(true){
//				if(num>0)
//					System.out.println(Thread.currentThread().getName()+":"+num--);
//			}
//		});
//		
		
//		Thread t1=new Thread( ()->{
//			while(true){
//				if(num>0)
//					System.out.println(num--);
//			}
//			
//		});//创建了一个子线程
		
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		Thread t4=new Thread(t);
		
//		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}
/**
 * 出现安全问题的原因:
 * 1.多个线程操作了共享数据
 * 2.操作共享数据的语句有多条,当一个线程拿到了CPU执行了操作共享数据语句的一部分时,
 * 	还没有全部执行完就被别的线程抢走了CPU;当线程再次拿到CPU时,直接执行后边的语句导致了问题的出现
 * 
 * 怎么解决安全问题:一个线程必须执行完操作共享数据的所有语句时,其他线程才能执行
 * java提供的解决方式:同步代码块
 * 		synchronized(锁){//任意一个对象就可以充当锁
 * 			操作共享数据的语句
 * 		}
 * 		原理:一个线程拿到锁,只有把同步代码块中的代码全部执行完,把锁释放了,其他线程才能获取锁,才能执行同步代码块中的代码
 * 		锁实现了 线程之间的互斥,多个线程用同一把锁
 * 
 * 	如果一个方法中的所有代码都放在同步代码块中了,那么这个方法可被修饰为synchronized
 * 	同步函数的锁是this
 * 	静态同步函数的锁是所属类的字节码
 */
//任务类
class Ticket implements Runnable{
	private static int num = 50;
	private Object obj = new Object();
	//任务run()
	public void run(){
		while(true){		
			synchronized(obj){//获取锁
				if(num>0){
					try{
						Thread.sleep(100);//睡着的线程仍然拿着锁,只是暂时放弃抢占CPU资源了;
											//没有获取锁的线程拿到CPU资源时会反复判断锁,所以效率低
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				System.out.println(Thread.currentThread().getName()+":"+num--);
				}
			}//释放锁
		}
	}
}

class MR1 implements Runnable{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("你是谁啊？");
		}
	}
	
}

class MR2 implements Runnable{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("我是你爸爸");
		}
	}
}