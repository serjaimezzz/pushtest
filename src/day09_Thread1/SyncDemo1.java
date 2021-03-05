package day09_Thread1;
/**
 * ���̲߳�������ͬһ��Դʱ,�ͻ��γ���������.�����߳��л�ʱ����ȷ��,���ܵ���ִ�д���˳��Ļ���
 * ����ʱ�ᵼ��ϵͳ̱��
 * @author zhangchi
 *
 */
public class SyncDemo1 {
	public static void main(String[] args) {
		final Table t = new Table();
		
		Thread t1 = new Thread(){
			public void run(){
				while(true){
					int bean = t.getBean();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
				
		Thread t2 = new Thread(){
			public void run(){
				while(true){
					int bean = t.getBean();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		
		t1.start();
		t2.start();
		
	}
}

class Table{
	private int beans = 20;
	public synchronized int getBean(){
		if(beans == 0)
			throw new RuntimeException("û�ж�����");
		Thread.yield();
		return beans--;
	}
}