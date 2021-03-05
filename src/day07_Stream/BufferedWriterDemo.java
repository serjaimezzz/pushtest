package day07_Stream;

import java.io.*;

public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		
		//1.因为缓冲流不具备写入的功能,创建文件输出流对象和文件的关联
		FileWriter fw = new FileWriter("fwbw.txt"); 
		
		/**
		 * 2.为了提高写入的效率,使用字符缓冲输出流 BufferedWriter
		 *	   把需要被提高效率的输出流对象作为参数传给缓冲流的构造方法
		 */
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(int i = 0; i < 3; i++){
			bw.write("java"+i);
			bw.newLine();
			/**
			 * 	void newLine()	跨平台的写入换行
			 */			
		}
		bw.close();//关闭缓冲流就是关闭输出流
	}
}
