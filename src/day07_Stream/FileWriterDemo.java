package day07_Stream;

import java.io.*;
/**
 * �����������:
 * ��ȷ��ʹ��ʲô��,
 * ��ȷ�����ķ���,�����뻹�����,
 * ���ȷ���豸��
 * 
 * @author zhangchi
 *
 */
public class FileWriterDemo {
	public static void main(String[] args) throws IOException {//����IO�쳣
		/**
		 * ���ı��ļ���д������
		 * ��Ϊ���ı��ļ�,����ʹ���ַ���,����Ϊ��д��,����ʹ���ַ������������,�ַ�������ĸ�����Writer
		 * ������Writer�Ŀ��Բ����ļ�������ʵ��д������,Writer������FileWriter����ʵ�����ļ���д���
		 */
		
		/*
		 * 1.�����ļ������������ļ������,FileWriter(String FileName)
		 * 	 �ļ������ڻ��Զ�����,Ĭ���ڵ�ǰ·���´����ļ�
		 */
		FileWriter fw = new FileWriter("temp.txt");
		
		//2.ʹ���ļ�������������ļ���д������,����д�뵽���ڲ���������
		fw.write("aaa");	//д�뵽�����ڲ�������
		
		//�����е�����ˢ���ļ���
		fw.flush();
		
		//ˢ��֮����Լ���д��
		fw.write("bbb");
		fw.flush();
		
		//��ˢ��,�ٹر�,���ͷ��ڴ档�ر�֮��Ͳ�����д���ˡ�
		fw.close();
	}
}
