package day09_Thread;
/**
 * 线程间的通信
 * ThreadDemoA的代码优化
 * @author zhangchi
 *
 */
public class ThreadDemoB {
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
	private String name;
	private String sex;
	private boolean flag;
	Data(){}
	public  synchronized void set(String name,String sex){
		if(flag){
			try{this.wait();}catch(InterruptedException e){e.printStackTrace();}
		}
		this.name = name;
		this.sex = sex;
		flag = true;
		this.notify();
	}
	
	public synchronized void out(){
		if(!flag){
			try{this.wait();}catch(InterruptedException e){e.printStackTrace();}
		}
		System.out.println(name+","+sex);
		flag = false;
		this.notify();
	}
}

class Input implements Runnable{
	private Data data;
	Input(Data data){
		this.data = data;
	}
	public void run()
	{
		int i = 0;
		while(true){
			if(i == 0)
				data.set("m", "m");
			else
				data.set("f", "f");
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
			data.out();
		}
		
	}
}


