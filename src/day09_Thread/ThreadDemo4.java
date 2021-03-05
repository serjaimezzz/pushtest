package day09_Thread;
/**
 * static Thread currentThread()
 * 获取运行当前方法的线程
 * @author zhangchi
 *
 */
public class ThreadDemo4 {

	public static void main(String[] args) {
		Thread main =Thread.currentThread();
		System.out.println("运行main方法的线程是:"+main);
		dosome(); //调用当前方法即main方法的线程
		
		Thread t=new Thread(){
			public void run(){
				Thread t=Thread.currentThread();//调用t方法的线程
				System.out.println("自定义线程:"+t);  
				dosome();  //调用当前方法即t方法的线程
			}
		};
		t.start();
		
	}
	public static void dosome(){
		Thread t=Thread.currentThread();
		System.out.println("运行dosome方法的线程是:"+t);
	}
}

