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
		//�൱����С����ש
		
//		char[] arr = new char[2];
//		/*
//		 * int read(char cbuf[]) 
//		 * ����ֵ�Ƕ�ȡ�������ݸ���
//		 */
//		int num = fr.read(arr);//���ļ��ж�ȡ�������ݴ浽������
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
