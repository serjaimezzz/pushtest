package day09_Thread;
/**
 * ��ȡ�߳������Ϣ�ķ���
 * @author zhangchi
 *
 */
public class ThreadDemo5 {

	public static void main(String[] args) {
		//��ȡ����main�������߳�
		Thread main = Thread.currentThread();
		long id = main.getId();
		System.out.println(main);
		System.out.println("id:"+id);
		
		String name=main.getName();
		System.out.println("name:"+name);
		
		int priority=main.getPriority();
		System.out.println("���ȼ�:"+priority);
		
		boolean isAlive=main.isAlive();
		System.out.println("�Ƿ���:"+isAlive);
		
		boolean isDaemon=main.isDaemon();
		System.out.println("�Ƿ�Ϊ�ػ��߳�:"+isDaemon);
		
		boolean isInterrupted =main.isInterrupted();
		System.out.println("�Ƿ��ж�:"+isInterrupted);
		
		//Thread.yield();//ִ���˸������̻߳�������״̬,����Ȼ��������CPU
	}
}
