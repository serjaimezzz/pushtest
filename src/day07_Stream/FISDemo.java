package day07_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java.io.FileInputStream
 * �ļ�����������һ���ͼ��������ڴ��ļ��ж�ȡ�ֽ�
 * @author zhangchi
 *
 */
public class FISDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("Note.txt");
		byte[] data=new byte[100];
		int len = fis.read(data);	//һ�γ��Զ�100���ֽ�,���ض�ȡ�����ֽ���
		/*
		 * String(byte bytes[], int offset, int length, String charsetName)
		 * ��������ת��:��ǰ�ֽ�����,		��0 		��len		ת����"UTF-8"��ʽ
		 */
		String str=new String(data,0,len,"UTF-8");//�ַ����黹ԭ���ַ���
		System.out.println(str);
		fis.close();
	}
	
	/*
	 * int read()һ�ζ�һ���ֽ�
	 * void read()һ��дһ���ֽ�
	 */
	public static void readFile2() throws IOException{
		FileInputStream fis=new FileInputStream("FISwrite.txt");
		byte[] arr = new byte[1024];
		int num = 0;
		//���ص�num�Ƕ�ȡ�ֽڵĸ���
		while((num = fis.read()) != -1){
			System.out.println(new String(arr,0,num));
		}
		fis.close();
	}
	
	//���ļ��ж�ȡ,һ�ζ�һ���ֽ�
	public static void readFile() throws IOException{
		FileInputStream fis=new FileInputStream("FISwrite.txt");
		int num;
		while((num = fis.read()) != -1){
			System.out.println((char)num);
		}
		fis.close();
	}
}
