package day09_Thread;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * static void sleep(long ms)
 * �߳��ṩ�ľ�̬����sleep����ʹ���и÷������߳̽�������״ָ̬�����롣
 * ��ʱ����Զ��ص�Runnable״̬��
 * @author zhangchi
 *
 */
public class ThreadDemo7 {

	public static void main(String[] args) {
		/*
		 * ��ɵ��ӱ��ܣ�ÿ�����һ�ε�ǰϵͳʱ��
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
