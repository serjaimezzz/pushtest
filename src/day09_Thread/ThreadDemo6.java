package day09_Thread;
/**
 * �̵߳����ȼ�
 * �̵߳�ʱ��Ƭ������ȫ���̵߳��ȵġ��߳�ֻ�ܱ����ı�����ʱ�䣬�����̵߳��ȵĹ������ܸ�Ԥ��
 * ���ǿ���ͨ������̵߳����ȼ����ﵽ�����ܸ�Ԥ��Ŀ�ġ�
 * 
 * �����ϣ����ȼ�Խ�ߵ��̣߳���ȡCPUʱ��Ƭ�Ĵ�����Խ�ࡣ
 * �ǻ��CPU�ĸ������������������
 * @author zhangchi
 *
 */
public class ThreadDemo6 {

	public static void main(String[] args) {
		
		System.out.println("max:"+Thread.MAX_PRIORITY);//1
		System.out.println("min:"+Thread.MIN_PRIORITY);//10
		
		Thread min=new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("min");
				}
			}			
		};
		
		Thread max=new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("max");
				}
			}			
		};
		
		Thread normal=new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("normal");
				}
			}			
		};
		
		min.setPriority(Thread.MIN_PRIORITY);
		max.setPriority(Thread.MAX_PRIORITY);
		
		min.start();
		max.start();
		normal.start();
		
		
	}
}
