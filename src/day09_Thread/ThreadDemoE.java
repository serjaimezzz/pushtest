package day09_Thread;
/**
 * join()
 * ���̼߳�������
 * @author zhangchi
 *
 */
public class ThreadDemoE {
	public static void main(String[] args) throws InterruptedException{
		Task t = new Task();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		
		t1.start();
//		t1.join();//��ʱ�����̺߳�t1�߳�,main�̻߳�ȴ�t1ִ����ſ�ʼִ���߳�
					//���߳̿��Ի�ȡt1��ִ�н��
		t2.start();
		t1.join();//main�̵߳ȵ�t1ִ����Ϳ�ʼִ��;t2��һ����,����ִ��
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}

class Task implements Runnable{
	public void run(){
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}