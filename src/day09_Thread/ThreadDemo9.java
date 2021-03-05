package day09_Thread;
/**
 * void join()
 * join��������ʹ���ø÷������߳̽�������״̬��ֱ���÷��������߳���ɹ����Ż������ø÷����̵߳�����״̬��
 * join����һ��������ɶ���߳�֮���ͬ���������⡣
 * @author zhangchi
 *
 */
public class ThreadDemo9 {
	//��ʾͼƬ�Ƿ��������
	public static boolean isFinish=false;//�ֲ������ڲ��൱�У���ʹ��һ������������Ҫ���丳ֵ�Ļ����ñ�����Ҫ�����ڷ�������
	
	public static void main(String[] args){
		
		final Thread download=new Thread(){
			public void run(){					//����throws ,��Ϊ�����run()����û���׳��쳣
				System.out.println("��ʼ����ͼƬ��");
				
				for(int i=0;i<=100;i++){
					System.out.println("down:"+i+"%");
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
					}
				}
				
				System.out.println("ͼƬ������ϣ�");
				isFinish=true;
			}
		};
		
		Thread show=new Thread(){//show�Ǿֲ������ڲ��࣬show�����������ߣ���main���Ǿֲ��ڲ��ࡣ
			//��һ�������ľֲ��ڲ��൱��,ʹ�õ�����������������ֲ��������������������final��
			public void run(){
				System.out.println("show:��ʼ��ʾͼƬ");
				/*
				 * �ȵȴ�download��ͼƬ������ϣ�
				 */
				try {
					download.join();
				} catch (InterruptedException e) {
				}
				
				if(!isFinish){  //isFinish==true;
					throw new RuntimeException("ͼƬ������");
				}
				System.out.println("show:ͼƬ��ʾ��ϣ�");
			}
		};
		
		download.start();
		show.start();
		
			
	}
	
	
}
