package day09_Thread;
/**
 * ��һ�ִ����̵߳ķ�ʽ:
 * ��һ��������ΪThread������,�������Ӧ����дThread��ķ���run(),Ȼ����Է��䲢���������ʵ��
 * 1.����һ��Thread������,����-->�߳���
 * 2.����������дrun����:
 * 		�߳��Ǹ���ִ����������,���������Ҫ����дλ��,run������������������дλ��
 * 3.��������Ķ���,��Ϊ�������߳���,���Դ���һ��������Ǵ���һ���߳�
 * 4.�����߳�
 * �̳�Thread����дrun�����������߳�Ҫִ�е�����
 * @author zhangchi
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
		
		Thread t1=new MyThread1();//����װ��
		Thread t2=new MyThread2();
		
		/*
		 * �����߳�Ҫָ��start������������ֱ�ӵ���run������run�������߳�Ҫִ�е�����
		 * ���̵߳�start���������ú������̵߳��ȣ��߳̽���runnable״̬��
		 * һ����ȡcpuʱ�䣬run�������Զ������á�
		 */
//		t1.start();
//		t2.start();
		
		Person p1 = new Person("O");
		Person p2 = new Person("X");
//		p1.run();//��ͨ�ķ�������,û�������߳�
//		p2.run();
		p1.start();
		p2.start();
		
		for (int i = 0; i <= 10; i++) {//��ȡ�߳�����
			System.out.println(Thread.currentThread().getName()+".run..."+i);
		}
		/**
		 * ÿ���̶߳���ջ����һ���Լ����ڴ档�̵߳�����ִ����,���ͷ��ڴ档
		 * ���е��̶߳�ִ����,���̲Ž�����
		 * һ���̷߳����쳣ʱ,����Ӱ�쵽�����̵߳�����(������ɱ����������,����Ӱ�쵽��������)
		 */
	}
}

/**
 * ��һ�ִ����̵߳ķ�ʽ�����ֲ���:
 * 1.����java�ǵ��̳У���ô���̳���Thread����޷��ټ̳������ࡣ
 * 2.���ڼ̳�Thread����дrun�����涨���߳�ִ�е������⵼���߳���������һ����Ȼ����Ϲ�ϵ���������̵߳����á�
 * @author zhangchi
 *
 */
class MyThread1 extends Thread{          //�൱�ڻ���
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("����˭����");
		}
	}
}

class MyThread2 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("������ְ֣�");
		}
	}
}

//���������߳���,Ҳ��������
class Person extends Thread{
	private String name;
	Person(){}
	Person(String name){
		this.name = name;
	}
	public void run(){	//��дrun�����涨���߳�ִ�е�����,�����߳���������һ����Ȼ����Ϲ�ϵ
		for (int i = 0; i <= 20; i++) {
			System.out.println(Thread.currentThread().getName()+"."+name + "+run.."+i);
		}
	}
}











