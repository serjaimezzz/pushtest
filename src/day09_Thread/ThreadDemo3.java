package day09_Thread;
/**
 * 使用匿名内部类来完成方式一与方式二的线程创建
 * @author zhangchi
 *
 */
public class ThreadDemo3 {

	public static void main(String[] args) {
		//方式一
		Thread t1=new MyThread1(){	
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("你是谁？？");
				}
			}			
		};
		
			
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("我是查水表的");
				}
			}
		}).start();
		
		t1.start();
		
	}
}




