package day10_Sync;
/**
 * ͬ���� ,ͬ����:�������߳̿���synchronized����ͬһ�δ��룬ͬ������������һ��ʱ������ͬʱ����
 * ��Ч����Сͬ����Χ�����ڱ�֤������ȫ��ͬʱ��������߲���Ч��
 * 
 * ͬ����:�����߳̿�������synchronized���ε���ͬһ�δ���,ֻҪͬ������������һ��
 * �������̲߳���ͬʱ������һ�δ���,����һ����
 * @author zhangchi
 *
 */
public class SyncDemo2 {
	public static void main(String[] args) {
		final Shop shop1=new Shop();
//		final Shop shop2=new Shop();
		
		//��ͬһ������,���·�Ҫ�Ŷ�,ͬ��ִ��
		Thread t1=new Thread(){
			public void run(){
				shop1.buy();
			}
		};
		
		Thread t2=new Thread(){
			public void run(){
				shop1.buy();
			}
		};
		
		t1.start();
		t2.start();
	}
}

class Shop{
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
			
			//ͬ��ִ��,�����ø÷����Ķ������
			synchronized(this){
			System.out.println(t.getName()+"�������·�");
			Thread.sleep(5000);
			}
			
			System.out.println(t.getName()+"�����뿪");			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}