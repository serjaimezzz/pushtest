package day09_Thread;
/**
 * 停止线程的方式:
 * 1. 设置flag
 * 2. this.wait()
 * 3. t1.interrupted()
 * 4. changeFlag();
 * 
 * @author zhangchi
 *
 */
public class ThreadDemoD {
	public static void main(String[] args) {
		TestD t = new TestD();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
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
				t2.interrupt();
				break;
			}
			
		}
	}		
}

class TestD implements Runnable{
	boolean flag = true;
	public synchronized void run(){
		while(flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
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





