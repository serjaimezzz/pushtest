package day07_Stream;

import java.io.*;

/**
 * 
 * @author zhangchi
 *
 */
public class FileReaderDemo1 {
	public static void main(String[] args) throws IOException{
		
		FileReader fr = new FileReader("FileWriter.txt");
		//相当于推小车搬砖
		
//		char[] arr = new char[2];
//		/*
//		 * int read(char cbuf[]) 
//		 * 返回值是读取到的数据个数
//		 */
//		int num = fr.read(arr);//把文件中读取到的数据存到数组中
//		System.out.println(new String(arr));//he
		/*
		//String(char value[], int offset, int count)
		num = fr.read(arr);
		System.out.println(new String(arr,0,num));
		num = fr.read(arr);
		System.out.println(new String(arr,0,num));
		num = fr.read(arr);
		System.out.println(new String(arr,0,num));
		*/
		
		char[] arr = new char[1024];
		int num;
		while((num = fr.read(arr)) != -1){
			System.out.println(new String(arr,0,num));
		}
		
	}
}
