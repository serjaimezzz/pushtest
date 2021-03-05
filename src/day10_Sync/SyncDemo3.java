package day10_Sync;
/**
 * 静态方法的同步
 * 当一个静态方法被synchronized修饰后，那么该方法即为同步方法，
 * 由于静态方法从属类，全局就一份，所以同步的静态方法一定具有同步效果，与对象无关。
 * @author zhangchi
 *
 */
public class SyncDemo3 {
	public static void main(String[] args) {
		Foo f1=new Foo();
		Foo f2=new Foo();
		
		Thread t1=new Thread(){
			public void run(){
				      
		//		f1.dosome();//应该使用静态的方式访问Foo类型的静态方法dosome() 
				Foo.dosome();
				
			}
		};
		
		Thread t2=new Thread(){
			public void run(){
				f2.dosome();//与对象无关
			}
		};
		
		t1.start();
		t2.start();
	}
}

class Foo{
	public synchronized static void dosome(){//用的是所属类的字节码
		try {
			Thread t=Thread.currentThread();
			System.out.println(t.getName()+"正在调用dosome方法");			
			Thread.sleep(2000);
			System.out.println(t.getName()+"执行dosome方法完毕");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}
}