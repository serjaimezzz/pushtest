package day07_Stream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ���������д�����ݵĻ���������
 * BIS/BOSû�����й���
 * @author zhangchi
 *
 */
public class BOSDemo {

	public static void main(String[] args) throws IOException {
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("BOSDemo.txt"));
		String str = "";
		for (int i = 0; i < 100000000; i++) {
			str = "a" + i;
		}
		bos.write(str.getBytes("UTF-8"));		
														//FIS/FOS�ͼ�����ʵ��,����flush���߼������д�����ݷ��ڻ�����   
		bos.flush();//ǿ�ƽ����������ֽ�һ����д�������м�ʱ�ԡ�������װ�˶���д���١�Ƶ������Ч�ʻή�͡�	
		
		System.out.println("�����ϣ�");
		bos.write("\nsssss".getBytes());//����ǰϵͳĬ�ϵ��ַ�������ǰ�ַ���ת��Ϊһ���ֽ�
		bos.close();//close()����������flush()
		
	}
}
