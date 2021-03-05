package day09_Thread;
/**
 * void join()
 * join方法可以使调用该方法的线程进入阻塞状态，直到该方法所属线程完成工作才会解除调用该方法线程的阻塞状态。
 * join方法一般用来完成多个线程之间的同步工作问题。
 * @author zhangchi
 *
 */
public class ThreadDemo9 {
	//表示图片是否下载完毕
	public static boolean isFinish=false;//局部匿名内部类当中，想使用一个变量，并且要对其赋值的话，该变量不要定义在方法里面
	
	public static void main(String[] args){
		
		final Thread download=new Thread(){
			public void run(){					//不能throws ,因为父类的run()方法没有抛出异常
				System.out.println("开始下载图片！");
				
				for(int i=0;i<=100;i++){
					System.out.println("down:"+i+"%");
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
					}
				}
				
				System.out.println("图片下载完毕！");
				isFinish=true;
			}
		};
		
		Thread show=new Thread(){//show是局部匿名内部类，show定义在类的里边，在main中是局部内部类。
			//当一个方法的局部内部类当中,使用到了这个方法的其他局部变量，这个变量必须是final的
			public void run(){
				System.out.println("show:开始显示图片");
				/*
				 * 先等待download把图片下载完毕！
				 */
				try {
					download.join();
				} catch (InterruptedException e) {
				}
				
				if(!isFinish){  //isFinish==true;
					throw new RuntimeException("图片下载中");
				}
				System.out.println("show:图片显示完毕！");
			}
		};
		
		download.start();
		show.start();
		
			
	}
	
	
}
