package day09_Thread;
/**
 * static Thread currentThread()
 * ��ȡ���е�ǰ�������߳�
 * @author zhangchi
 *
 */
public class ThreadDemo4 {

	public static void main(String[] args) {
		Thread main =Thread.currentThread();
		System.out.println("����main�������߳���:"+main);
		dosome(); //���õ�ǰ������main�������߳�
		
		Thread t=new Thread(){
			public void run(){
				Thread t=Thread.currentThread();//����t�������߳�
				System.out.println("�Զ����߳�:"+t);  
				dosome();  //���õ�ǰ������t�������߳�
			}
		};
		t.start();
		
	}
	public static void dosome(){
		Thread t=Thread.currentThread();
		System.out.println("����dosome�������߳���:"+t);
	}
}

