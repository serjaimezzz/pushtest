package day07_Stream;

import java.io.*;

public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		
		//1.��Ϊ���������߱�д��Ĺ���,�����ļ������������ļ��Ĺ���
		FileWriter fw = new FileWriter("fwbw.txt"); 
		
		/**
		 * 2.Ϊ�����д���Ч��,ʹ���ַ���������� BufferedWriter
		 *	   ����Ҫ�����Ч�ʵ������������Ϊ���������������Ĺ��췽��
		 */
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(int i = 0; i < 3; i++){
			bw.write("java"+i);
			bw.newLine();
			/**
			 * 	void newLine()	��ƽ̨��д�뻻��
			 */			
		}
		bw.close();//�رջ��������ǹر������
	}
}
