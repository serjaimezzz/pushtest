package day09_Thread;
/**
 * ʹ�������ڲ�������ɷ�ʽһ�뷽ʽ�����̴߳���
 * @author zhangchi
 *
 */
public class ThreadDemo3 {

	public static void main(String[] args) {
		//��ʽһ
		Thread t1=new MyThread1(){	
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("����˭����");
				}
			}			
		};
		
			
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("���ǲ�ˮ���");
				}
			}
		}).start();
		
		t1.start();
		
	}
}




