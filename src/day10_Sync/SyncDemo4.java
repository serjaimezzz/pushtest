package day10_Sync;
/**
 * ��������һ�����е�������������synchronized����
 * synchronizedҲ�л���������:
 * synchronized���ε��Ǽ��β�ͬ�Ĵ��룬�������ǵ���������ͬ, ֻҪ���ǵ�ͬ��������������ͬ��
 * ��ô�⼸�δ������ǻ����ϵ����:����̲߳���ͬʱִ����Щ����
 * @author zhangchi
 *
 */
public class SyncDemo4 {
	public static void main(String[] args) {
		final Boo boo=new Boo();  //boo��ͬһ���������������Ŷ�
		
		Thread t1=new Thread(){
			public void run(){
				boo.methodA();
			}
		};
		
		Thread t2=new Thread(){
			public void run(){
				boo.methodB();
			}
		};
		
		t1.start();
		t2.start();
	}	
}

class Boo{
	
	public synchronized void methodA(){
		try {
			Thread t=Thread.currentThread();
			System.out.println(t.getName()+"����ִ��A����");
			Thread.sleep(2000);
			System.out.println(t.getName()+"����A�������");
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public  void methodB(){
		synchronized(this){
		try {
			Thread t=Thread.currentThread();
			System.out.println(t.getName()+"����ִ��B����");
			Thread.sleep(2000);
			System.out.println(t.getName()+"����B�������");
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	}
}