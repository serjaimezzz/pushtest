package day09_Thread;
/**
 * �߳̽�������
 * ������������
 * �����߸�������,�������ǲ�Ʒ
 * �����߸�������,���ѵ��ǲ�Ʒ
 * ������ͬʱ��������,���ѵ�ͬʱ��������
 * @author zhangchi
 * 
 * һ������-�����߳�û������
 * ���������߳�+���������̳߳���������1������2��|| ����2������1��
 * ԭ�����̱߳����Ѻ�,û��ȥ�ж�flag��ֵ
 *	
 */
public class ThreadDemoC {
	public static void main(String[] args) {
		Product p = new Product();//��Ʒ
		Producer pr = new Producer(p); //��������
		Consumer c = new Consumer(p);//��������
		
		Thread t0 = new Thread(pr);//�����߳�
		Thread t1 = new Thread(pr);
		
		Thread t2 = new Thread(c);//�����߳�
		Thread t3 = new Thread(c);
		
		t1.start();
		t2.start();
	}
}

/**
 * //if()��Ϊwhile()�������������,��Ϊ������ѵ��Ǳ����߳�,�ᵼ�������߳�ȫ���ȴ�
 * ʹ��notifyAll();
 *
 */
class Product{
	private String name;
	private int count;
	private boolean flag;
	
	//��������
	public synchronized void produce(String name){
		//���ж��ܲ�������
		while(flag){//flag==false������
			try{
				this.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		this.name = name+""+count;
		count++;
		System.out.println(Thread.currentThread().getName()+"|||"+this.name);
		
		flag = true;
//		this.notify();
		this.notifyAll();
	}
	
	//���ѹ���
	public synchronized void consume(){
		while(!flag){//��Ϊwhile()�������������
			try{
				this.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"---:"+this.name);
//		count--;
		flag = false;
//		this.notify();
		this.notifyAll();
	}	
	
}

class Producer implements Runnable{
	private Product product;
	Producer(){}
	Producer(Product product){
		this.product = product;
	}
	public void run(){
		while(true){
			product.produce("�ʼǱ�");
		}
	}
}


class Consumer implements Runnable{
	private Product product;
	Consumer(Product p){
		this.product = p;
	}

	public void run(){
		while(true){
			product.consume();
		}
	}
}










