package qfhomework;

import java.io.*;

public class day19work {
	public static void main(String[] args) {
		work4();
	}
	
	public static void work2(){
		//2.�Ӵ��̶�ȡһ���ļ����ڴ��У��ٴ�ӡ������̨
				

	}
	
	public static void work3(){
		//3.���ַ���ʵ�ֽ��ĵ��е�һ�������һ�н������ڶ����뵹���ڶ��н�������3���뵹����3�н���.......
		

	}
	
	public static void work4(){
		//4.�ô����̵߳ĵ�һ�ַ�ʽ���������̣߳������߳��зֱ��������1-100��
		//��ʵ�����̶߳����ͬʱ�������̵߳����֡�
		Thread t1 = new MyThread1();
		Thread t2 = new MyThread2();
		t1.start();
		t2.start();

	}
	
}

class MyThread1 extends Thread{
	public void run(){
		for(int i = 0;i <= 100;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}

class MyThread2 extends Thread{
	public void run(){
		for(int i = 0;i <= 100;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}

