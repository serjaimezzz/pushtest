package day07_Stream;

import java.io.*;

/**
 * �ַ���FileReader������
 * �ڴ��ȡӲ���ϵ���Ϣ,��Ϣ����
 * 
 * ���ı��ж�ȡ����
 * ��Ϊ���ı��ļ�,����ʹ���ַ���,
 * ����Ϊ�Ƕ�ȡ,����ʹ��ʦ��������,
 * �ַ����ĸ�����Reader,������Reader�Ŀ��Բ����ļ���������ж�ȡ
 * @author zhangchi
 *
 */
public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		//1.�����ı�������������ļ������,�ļ�����ʵ�ִ���
		FileReader fr = new FileReader("FileWriter.txt");
		
		//2.ʹ���ļ�������������ļ��ж�ȡ����
		/*
		 *  int read() һ�ζ�һ���ַ������ظ��ַ�
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
//		num = fr.read();									//��ͷָ��ĩβ
//		System.out.println("EOF:"+num);//-1: end of file 
//		num = fr.read();									//��ͷ��Ȼ��ָ��ĩβ��
//		System.out.println("EOF:"+num);//-1: end of file 
		
		
		while((num = fr.read()) != -1){	//һ�ζ�ȡһ���ַ�,Ч�ʵ�,������ȥһ����Զ�ĵط���ש,һ�ΰ�һ��ש
			System.out.print((char)num);
		}
		
		fr.close();//��ͷ�ڶ������ݺ�ָ������ļ�ĩβ,�����Ҫ���¶�,�����.close();�����ͷһֱ��ָ��ĩβ��
	}
}
