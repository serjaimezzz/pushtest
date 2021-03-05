package day09_Thread;
/**
 * �ڶ��� �����̵߳ķ�ʽ
 * 1.����һ����,ʵ��Runnable�ӿ�
 * 2.��дRunnable�ӿ��е�run����:run������д�����̵߳��������
 * 3.����������ʵ��
 * 4.����	Thread�Ķ���,��Runnable��������󴫸�Thread
 *
 *	����������˶���,����������һ��������,ʹ��Thread�����߳�,�����߳�ִ��ʲô����Ͱ��Ǹ��������
 *	�����߳�,�߳�ִ�е������ǿ��Զ�̬���ݵ�
 *	������������,�߳����߳���,������Զ���,
 * @author zhangchi
 *
 */
public class ThreadDemo2 {

	public static void main(String[] args) {
		//������������
//		Runnable r1=new MR1();
//		Runnable r2=new MR2();
		Ticket t = new Ticket();//�����������
		//���ڰ�ȫ����
//		Thread t5 = new Thread(new Ticket(){
//			while(true){
//				if(num>0)
//					System.out.println(Thread.currentThread().getName()+":"+num--);
//			}
//		});
//		
		
//		Thread t1=new Thread( ()->{
//			while(true){
//				if(num>0)
//					System.out.println(num--);
//			}
//			
//		});//������һ�����߳�
		
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		Thread t4=new Thread(t);
		
//		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}
/**
 * ���ְ�ȫ�����ԭ��:
 * 1.����̲߳����˹�������
 * 2.�����������ݵ�����ж���,��һ���߳��õ���CPUִ���˲���������������һ����ʱ,
 * 	��û��ȫ��ִ����ͱ�����߳�������CPU;���߳��ٴ��õ�CPUʱ,ֱ��ִ�к�ߵ���䵼��������ĳ���
 * 
 * ��ô�����ȫ����:һ���̱߳���ִ��������������ݵ��������ʱ,�����̲߳���ִ��
 * java�ṩ�Ľ����ʽ:ͬ�������
 * 		synchronized(��){//����һ������Ϳ��Գ䵱��
 * 			�����������ݵ����
 * 		}
 * 		ԭ��:һ���߳��õ���,ֻ�а�ͬ��������еĴ���ȫ��ִ����,�����ͷ���,�����̲߳��ܻ�ȡ��,����ִ��ͬ��������еĴ���
 * 		��ʵ���� �߳�֮��Ļ���,����߳���ͬһ����
 * 
 * 	���һ�������е����д��붼����ͬ�����������,��ô��������ɱ�����Ϊsynchronized
 * 	ͬ������������this
 * 	��̬ͬ��������������������ֽ���
 */
//������
class Ticket implements Runnable{
	private static int num = 50;
	private Object obj = new Object();
	//����run()
	public void run(){
		while(true){		
			synchronized(obj){//��ȡ��
				if(num>0){
					try{
						Thread.sleep(100);//˯�ŵ��߳���Ȼ������,ֻ����ʱ������ռCPU��Դ��;
											//û�л�ȡ�����߳��õ�CPU��Դʱ�ᷴ���ж���,����Ч�ʵ�
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				System.out.println(Thread.currentThread().getName()+":"+num--);
				}
			}//�ͷ���
		}
	}
}

class MR1 implements Runnable{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("����˭����");
		}
	}
	
}

class MR2 implements Runnable{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("������ְ�");
		}
	}
}