package qfhomework;

import java.io.*;

public class day19work {
	public static void main(String[] args) {
		work4();
	}
	
	public static void work2(){
		//2.从磁盘读取一个文件到内存中，再打印到控制台
				

	}
	
	public static void work3(){
		//3.用字符流实现将文档中第一行与最后一行交换，第二行与倒数第二行交换，第3行与倒数第3行交换.......
		

	}
	
	public static void work4(){
		//4.用创建线程的第一种方式创建两个线程，两个线程中分别输出数字1-100。
		//在实例化线程对象的同时，设置线程的名字。
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

