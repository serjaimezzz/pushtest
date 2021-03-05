package day09_Thread;
/**
 * ֹͣ�̵߳ķ�ʽ:
 * 1. ����flag
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
//				t.changeFlag();//�޷�����
				t1.interrupt();//ǿ�ƽ����̵߳ĵȴ�״̬,�ᷢ���ж��쳣
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





