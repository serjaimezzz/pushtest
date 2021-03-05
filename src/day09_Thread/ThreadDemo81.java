package day09_Thread;
/**
 * 守护线程
 * 在start()之前设置
 * @author zhangchi
 *
 */
public class ThreadDemo81 {
	public static void main(String[] args) {
		TestDm t = new TestDm();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		
		t2.setDaemon(true);//设定为守护线程,后台线程,优先级降低
		
		t1.start();
		t2.start();
		
		try{Thread.sleep(10);}
		catch(InterruptedException e){e.printStackTrace();}
		int i =1;
		while(true){
			i++;
			if(i == 100){
//				t.changeFlag();//无法唤醒
				t1.interrupt();//强制结束线程的等待状态,会发生中断异常
//				t2.interrupt();
				break;
			}
			
		}
	}		
}

class TestDm implements Runnable{
	boolean flag = true;
	public synchronized void run(){
		while(flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
				changeFlag();
//				e.printStackTrace();
			}
			System.out.println("111");
		}
	}
	public void changeFlag(){
		this.flag = false;
	}
}