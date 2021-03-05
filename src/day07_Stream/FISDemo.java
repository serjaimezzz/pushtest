package day07_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java.io.FileInputStream
 * 文件输入流，是一个低级流，用于从文件中读取字节
 * @author zhangchi
 *
 */
public class FISDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("Note.txt");
		byte[] data=new byte[100];
		int len = fis.read(data);	//一次尝试读100个字节,返回读取到的字节数
		/*
		 * String(byte bytes[], int offset, int length, String charsetName)
		 * 部分内容转换:当前字节数组,		从0 		到len		转换成"UTF-8"格式
		 */
		String str=new String(data,0,len,"UTF-8");//字符数组还原成字符串
		System.out.println(str);
		fis.close();
	}
	
	/*
	 * int read()一次读一个字节
	 * void read()一次写一个字节
	 */
	public static void readFile2() throws IOException{
		FileInputStream fis=new FileInputStream("FISwrite.txt");
		byte[] arr = new byte[1024];
		int num = 0;
		//返回的num是读取字节的个数
		while((num = fis.read()) != -1){
			System.out.println(new String(arr,0,num));
		}
		fis.close();
	}
	
	//从文件中读取,一次读一个字节
	public static void readFile() throws IOException{
		FileInputStream fis=new FileInputStream("FISwrite.txt");
		int num;
		while((num = fis.read()) != -1){
			System.out.println((char)num);
		}
		fis.close();
	}
}
