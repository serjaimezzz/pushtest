package day07_Stream;

import java.io.*;

public class BRDemo1 {
	public static void main(String[] args) throws IOException {
		//从文本文件中读取数据,使用缓冲流
		
		//1.创建文件输入流对象和文件相关联
		FileReader fr = new FileReader("fwbw.txt");
		
		//2.为了提高读取的效率,使用字符输入缓冲流
		BufferedReader br = new BufferedReader(fr);
		
		/**String readLine()	一次读取一行*/
//		String line = br.readLine();
//		System.out.println(line);	
//		line = br.readLine();
//		System.out.println(line);
		String line = null;
		while((line = br.readLine()) != null){
			System.out.println(line);
		}
		br.close();//关闭缓冲流
	}
}
