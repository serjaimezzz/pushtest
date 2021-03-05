package day10_Sync;
/**
 * ��̬������ͬ��
 * ��һ����̬������synchronized���κ���ô�÷�����Ϊͬ��������
 * ���ھ�̬���������࣬ȫ�־�һ�ݣ�����ͬ���ľ�̬����һ������ͬ��Ч����������޹ء�
 * @author zhangchi
 *
 */
public class SyncDemo3 {
	public static void main(String[] args) {
		Foo f1=new Foo();
		Foo f2=new Foo();
		
		Thread t1=new Thread(){
			public void run(){
				      
		//		f1.dosome();//Ӧ��ʹ�þ�̬�ķ�ʽ����Foo���͵ľ�̬����dosome() 
				Foo.dosome();
				
			}
		};
		
		Thread t2=new Thread(){
			public void run(){
				f2.dosome();//������޹�
			}
		};
		
		t1.start();
		t2.start();
	}
}

class Foo{
	public synchronized static void dosome(){//�õ�����������ֽ���
		try {
			Thread t=Thread.currentThread();
			System.out.println(t.getName()+"���ڵ���dosome����");			
			Thread.sleep(2000);
			System.out.println(t.getName()+"ִ��dosome�������");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}
}