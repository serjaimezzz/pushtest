package day10_Sync;
/**

 * @author zhangchi
 *
 */
public class SyncDemo20 {
	public static void main(String[] args) {
		final Shops shop1=new Shops();
		final Shops shop2=new Shops();
		
		Thread t1=new Thread(){
			public void run(){
				shop1.buy();
			}
		};
		
		Thread t2=new Thread(){
			public void run(){
				shop2.buy();
			}
		};
		
		t1.start();
		t2.start();
	}
}

class Shops{
	public void buy(){
		//��ȡ����buy�������߳�
		Thread t=Thread.currentThread();	
		try{
			System.out.println(t.getName()+"�������·�");
			Thread.sleep(1000);
			
			/**
			 * ͬ�������Ҫ�����̶߳Ըÿ��ڵĴ����Ŷ�ִ�У�����ǰ��������ͬ������������
			 * ��(�����Ķ���)Ҫ�����߳̿����ı�����ͬһ����
			 * synchronized(ͬ������������){
			 *         ��Ҫͬ���Ĵ���
			 * }
			 * ��νͬ��ִ�м�:����̱߳����Ŷ�ִ��
			 * ��ν�첽ִ�м�:����߳̿���ͬʱִ��     
			 */
			//				������һ���������,�ö��������ִ����Ϻ�,���ͷ�
			synchronized(new Object()){//����ǰ���ø÷�����ʹ����  �����������ͷ�
			System.out.println(t.getName()+"�������·�");
			Thread.sleep(5000);
			}
			
			System.out.println(t.getName()+"�����뿪");			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}