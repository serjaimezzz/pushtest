package day09_Thread;
/**
 * 第一种创建线程的方式:
 * 将一个类声明为Thread的子类,这个子类应该重写Thread类的方法run(),然后可以分配并启动子类的实例
 * 1.创建一个Thread的子类,子类-->线程类
 * 2.在子类中重写run方法:
 * 		线程是负责执行任务代码的,任务代码需要有书写位置,run方法就是任务代码的书写位置
 * 3.创建子类的对象,因为子类是线程类,所以创建一个对象就是创建一个线程
 * 4.启动线程
 * 继承Thread并重写run方法来定义线程要执行的任务。
 * @author zhangchi
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
		
		Thread t1=new MyThread1();//货物装车
		Thread t2=new MyThread2();
		
		/*
		 * 启动线程要指定start方法，而不是直接调用run方法。run方法是线程要执行的任务。
		 * 当线程的start方法被调用后，纳入线程调度，线程进入runnable状态，
		 * 一旦获取cpu时间，run方法会自动被调用。
		 */
//		t1.start();
//		t2.start();
		
		Person p1 = new Person("O");
		Person p2 = new Person("X");
//		p1.run();//普通的方法调用,没有启动线程
//		p2.run();
		p1.start();
		p2.start();
		
		for (int i = 0; i <= 10; i++) {//获取线程名字
			System.out.println(Thread.currentThread().getName()+".run..."+i);
		}
		/**
		 * 每个线程都在栈中有一块自己的内存。线程的任务执行完,就释放内存。
		 * 所有的线程都执行完,进程才结束。
		 * 一个线程发生异常时,不会影响到其他线程的运行(病毒查杀出现问题了,不会影响到电脑清理)
		 */
	}
}

/**
 * 第一种创建线程的方式有两种不足:
 * 1.由于java是单继承，那么当继承了Thread后就无法再继承其他类。
 * 2.由于继承Thread后重写run方法规定了线程执行的任务，这导致线程与任务有一个必然的耦合关系，不利于线程的重用。
 * @author zhangchi
 *
 */
class MyThread1 extends Thread{          //相当于货物
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("你是谁啊？");
		}
	}
}

class MyThread2 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("我是你爸爸！");
		}
	}
}

//这个类既是线程类,也是任务类
class Person extends Thread{
	private String name;
	Person(){}
	Person(String name){
		this.name = name;
	}
	public void run(){	//重写run方法规定了线程执行的任务,导致线程与任务有一个必然的耦合关系
		for (int i = 0; i <= 20; i++) {
			System.out.println(Thread.currentThread().getName()+"."+name + "+run.."+i);
		}
	}
}











