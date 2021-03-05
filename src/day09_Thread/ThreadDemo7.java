package day09_Thread;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * static void sleep(long ms)
 * 线程提供的静态方法sleep可以使运行该方法的线程进入阻塞状态指定毫秒。
 * 超时后会自动回到Runnable状态。
 * @author zhangchi
 *
 */
public class ThreadDemo7 {

	public static void main(String[] args) {
		/*
		 * 完成电子表功能，每秒输出一次当前系统时间
		 */
		
		SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
		while(true){			
			System.out.println(sdf.format(new Date()));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
	}
}
