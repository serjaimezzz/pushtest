package day10_Sync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * �̳߳�:
 * 1.�����߳�
 * 2.�����߳�����
 * �����ǵ�Ӧ����Ҫ���������̻߳��߷����߳�,
 * ��Ƶ���Ĵ����������߳�ʱ����Ӧ������ʹ���̳߳���ά���߳�
 * @author zhangchi
 * //�̳߳��ڲ���һ������Q,Q�д���߳�Ҫִ�е�����
 *
 */
public class ThreadPoolDemo {

	public static void main(String[] args) {
		//�����̳߳�,ִ��������,����ʵ����
		ExecutorService threadPool=Executors.newFixedThreadPool(2);
		
		for(int i=0;i<5;i++){
			Runnable r=new Runnable(){//�����ڲ���ʹ�õı���������final��
				public void run(){
					Thread t=Thread.currentThread();
					try {
						System.out.println(t+":������������");
						Thread.sleep(5000);
						System.out.println(t+"�����������");
					} catch (Exception e) {
						System.out.println("�̱߳��ж���");
					}
				}
			};
			//��������
			threadPool.execute(r);
			System.out.println("ָ����һ�����񽻸��̳߳�");
		}
	//	    threadPool.shutdown();   //�������ͣ
	//	    threadPool.shutdownNow();//����ֹͣ�߳� 
	//	    System.out.println("�̳߳�ֹͣ�ˣ�");
		
		
		
	}
}
/**
 * Executors.
 * newCachedThreadPool()
 * ���������͵��̳߳�,���Ժ�,������ע�߳�����,����˲���100������,�ͻ�˲�䴴��100���߳�
 * �߳̿���ʱ,�̳߳ػ����ó�ʱʱ��,Ȼ����ɾ��
 * 
 * newFixedThreadPool(int nThreads)
 * ���������õĹ̶��̼߳��ϵ��̳߳�,��ִ����n������,�ټ���ִ������������
 * 
 * newScheduledThreadPool(int corePoolSize)
 * ����һ���̳߳�,�ɰ����ڸ����ӳٺ������������  ����ִ������
 * 
 * newSingleThreadExecutor()
 * ���߳�ģʽ,���˾��
 * 
 */

