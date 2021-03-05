package day09_Thread;
/**
 * �̼߳��ͨ��:�߳�ִ�е�����ͬ,������������ͬ
 * 
 * wait()���̷߳����̳߳�
 * notify()���ѵ����̳߳��е�����һ���߳�
 * notifyAll()�����߳��е������߳�
 * ������������������ʹ��
 * ��Ϊ��������������ͨ����������,����������Ķ���,Ϊ�˱�֤��������ܵ�����Щ����,
 * ����ֻ�ܶ�����Object����
 * 
 * @author zhangchi
 *
 */
/*
public class ThreadDemoA {
	public static void main(String[] args) {
		Data data = new Data();
		Input in = new Input(data);//��������
		Output o = new Output(data);//�������
		
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(o);
		t1.start();
		t2.start();
	}
}

class Data{
	String name;
	String sex;
	boolean flag;
	
}

class Input implements Runnable{
	private Data data;
	Input(Data data){
		this.data = data;
	}
	public void run()
	{
		int i = 0;
		while (true) {
			synchronized (data) {//�������Ķ���
				if (data.flag == true) {
					try {
						data.wait();// ָ���ȴ�����,�ȴ����̻߳�ŵ���
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				//flag==false��ʼ��ֵ
				if (i == 0) {
					data.name = "m";
					data.sex = "m";
				} else {
					data.name = "f";
					data.sex = "f";
				}
				data.flag = true;//�ı�flag״̬
				data.notify();//����
			}
			i = (i + 1) % 2;
		}
	}	
}

class Output implements Runnable{
	private Data data;
	Output(Data data){
		this.data = data;
	}
	public void run()
	{
		while(true){
			synchronized(data){//�������Ķ���
			if(data.flag == false){
				try {
					data.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println(data.name+".."+data.sex);
			data.flag = false;//�ı�flag״̬
			data.notify();
			}
		}
	}
}

*/

















