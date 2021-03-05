package day09_Thread;
/**
 * 线程间的通信:线程执行的任务不同,操作的数据相同
 * 
 * wait()把线程放入线程池
 * notify()唤醒的是线程池中的任意一个线程
 * notifyAll()唤醒线程中的所有线程
 * 这三个方法必须结合锁使用
 * 因为这三个方法必须通过锁来调用,而锁是任意的对象,为了保证任意对象都能调用这些方法,
 * 所有只能定义在Object类中
 * 
 * @author zhangchi
 *
 */
/*
public class ThreadDemoA {
	public static void main(String[] args) {
		Data data = new Data();
		Input in = new Input(data);//输入任务
		Output o = new Output(data);//输出任务
		
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
			synchronized (data) {//设置锁的对象
				if (data.flag == true) {
					try {
						data.wait();// 指定等待的锁,等待的线程会放掉锁
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				//flag==false开始赋值
				if (i == 0) {
					data.name = "m";
					data.sex = "m";
				} else {
					data.name = "f";
					data.sex = "f";
				}
				data.flag = true;//改变flag状态
				data.notify();//唤醒
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
			synchronized(data){//设置锁的对象
			if(data.flag == false){
				try {
					data.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println(data.name+".."+data.sex);
			data.flag = false;//改变flag状态
			data.notify();
			}
		}
	}
}

*/

















