package day09_Thread;
/**
 * �ػ��߳�
 * ��start()֮ǰ����
 * @author zhangchi
 *
 */
public class ThreadDemo81 {
	public static void main(String[] args) {
		TestDm t = new TestDm();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		
		t2.setDaemon(true);//�趨Ϊ�ػ��߳�,��̨�߳�,���ȼ�����
		
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