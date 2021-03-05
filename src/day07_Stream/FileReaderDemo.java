package day07_Stream;

import java.io.*;

/**
 * 字符流FileReader输入流
 * 内存读取硬盘上的信息,信息输入
 * 
 * 从文本中读取数据
 * 因为是文本文件,所以使用字符流,
 * 又因为是读取,所以使用师傅输入流,
 * 字符流的父类是Reader,所以找Reader的可以操作文件的子类进行读取
 * @author zhangchi
 *
 */
public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		//1.创建文本输入流对象和文件相关联,文件必须实现存在
		FileReader fr = new FileReader("FileWriter.txt");
		
		//2.使用文件输入流对象从文件中读取数据
		/*
		 *  int read() 一次读一个字符，返回该字符
		 */
		int num = fr.read();
		System.out.print((char)num);
		
//		for(int i = 0;i < 9 ;i++){
//			num = fr.read();
//			System.out.print((char)num);
//		}
//		
//		num = fr.read();		
//		System.out.println("EOF:"+num);//-1: end of file 
//		num = fr.read();									//磁头指向末尾
//		System.out.println("EOF:"+num);//-1: end of file 
//		num = fr.read();									//磁头仍然是指向末尾的
//		System.out.println("EOF:"+num);//-1: end of file 
		
		
		while((num = fr.read()) != -1){	//一次读取一个字符,效率低,类似于去一个很远的地方搬砖,一次搬一块砖
			System.out.print((char)num);
		}
		
		fr.close();//磁头在读完数据后指向的是文件末尾,如果需要重新读,需添加.close();否则磁头一直是指向末尾的
	}
}
