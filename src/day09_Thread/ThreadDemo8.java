package day09_Thread;
/**
 * 守护线程，又称后台线程
 * 当一个进程中的所有前台线程都结束时，进程就要结束，若还有后台线程运行，那么后台线程会被强制结束。
 * @author zhangchi
 *
 */
public class ThreadDemo8 {

	public static void main(String[] args) {  //main也是前台线程
		//前台线程
		Thread rose=new Thread(){
			public void run(){
				for(int i=0;i<10;i++){
					System.out.println("rose:let me go!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("啊啊啊啊啊aaaa!!!");
				System.out.println("音效:扑通扑通...");
			}
		};
		
		Thread jack=new Thread(){
			public void run(){
				while(true){
					System.out.println("jack:u jump!I jump!!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		};
		
		//设置为后台线程，并且要在start前调用
		jack.setDaemon(true);
		
		rose.start();
		jack.start();
		
	//	while(true);//main方法的线程没结束，后台线程jack不会挂掉
		
	}
}
