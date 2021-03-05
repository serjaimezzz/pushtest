package day10_Sync;
/**
 * ���̲߳�������ͬһ��Դʱ���ͻ��γ�"��"������
 * �����߳��л�ʱ����ȷ�������ܵ���ִ�д���˳��Ļ��ң�����ʱ�ᵼ��ϵͳ̱����
 * @author zhangchi
 *
 */
public class SyncDemo1 {

	public static void main(String[] args) {
		final Table table=new Table();
		Thread t1=new Thread(){
			public void run(){
				while(true){
					int bean=table.getBean();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		
		Thread t2=new Thread(){
			public void run(){
				while(true){
					int bean=table.getBean();
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
	private int beans=20;
	/**
	 * ��һ��������synchronized���κ󣬸÷���Ϊͬ��������
	 * ��:����̲߳���ͬʱ���뷽���ڲ�ִ�С�
	 * ���ڳ�Ա�������ԣ�synchronized����һ���̵߳��ø÷���ʱ���÷����������������
	 * �����߳���ִ�и÷���ʱ����ִ�з������߳�û���ͷ���������ֻ���ڷ�����������ֱ������
	 * ���������߳̽�����ִ����ϡ����ԣ�������̲߳���ִ�а�ȫ����İ취���ǽ�"��"��Ϊ"�Ŷ�"��
	 * @return
	 */
	//������������������
	public synchronized int getBean(){  //�������Ŷ��ϲ���ʱ�����Ų���
		if(beans==0){
			throw new RuntimeException("û�ж�����");
		}
		Thread.yield();//�߳�ִ�е��˴��������ó�CPUʱ��,ģ��CPUʱ��������
		return beans--;
	}	
}