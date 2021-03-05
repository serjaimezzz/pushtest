package day09_Thread;
/**
 * 线程交叉运行
 * 生产者消费者
 * 生产者负责生产,生产的是产品
 * 消费者负责消费,消费的是产品
 * 生产的同时可以消费,消费的同时可以生产
 * @author zhangchi
 * 
 * 一个生产-消费线程没有问题
 * 两个生产线程+两个消费线程出现了生产1次消费2次|| 生产2次消费1次
 * 原因是线程被唤醒后,没有去判断flag的值
 *	
 */
public class ThreadDemoC {
	public static void main(String[] args) {
		Product p = new Product();//产品
		Producer pr = new Producer(p); //生产任务
		Consumer c = new Consumer(p);//消费任务
		
		Thread t0 = new Thread(pr);//生产线程
		Thread t1 = new Thread(pr);
		
		Thread t2 = new Thread(c);//消费线程
		Thread t3 = new Thread(c);
		
		t1.start();
		t2.start();
	}
}

/**
 * //if()改为while()会出现死锁现象,因为如果唤醒的是本方线程,会导致所有线程全部等待
 * 使用notifyAll();
 *
 */
class Product{
	private String name;
	private int count;
	private boolean flag;
	
	//生产功能
	public synchronized void produce(String name){
		//先判断能不能生产
		while(flag){//flag==false能生产
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
	
	//消费功能
	public synchronized void consume(){
		while(!flag){//改为while()会出现死锁现象
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
			product.produce("笔记本");
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










