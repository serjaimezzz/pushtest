package day07_Stream;

import java.io.*;

public class ISRDemo {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("OSWDemo.txt"),"UTF-8");
		int d = -1;	//读到的是Unicode编码,再转为char,给到用户
		while((d = isr.read()) != -1){
			System.out.print(d);//Unicode编码
			System.out.println((char)d);
		}
		isr.close();
	}
}
