package day07_Stream;

import java.io.FileOutputStream;
import java.io.IOException;
/**
 * �ڵ���
 * @author zhangchi
 *
 */
public class FOSDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * Ĭ�ϴ�����FOS�Ǹ���д����
		 * FOS���Ƚ��ļ�����(��������)ȫ��ɾ����Ȼ���ٿ�ʼд��
		 */
		/**  java.io.FileOutputStream
		 *  �ļ����������һ���ͼ��������������ļ���д���ֽ�
		 */ 
		FileOutputStream fos=new FileOutputStream("FOSDemo.txt");		
		String str="�Ұ������찲��";
		/*
		 * String-->byte[]һ���ֽ�
		 * byte getBytes()  ����ǰϵͳĬ�ϵ��ַ�������ǰ�ַ���ת��Ϊһ���ֽ�
		 * byte getBytes(String csn)  ����ָ�����ַ�������ǰ�ַ���ת��Ϊһ���ֽ�
		 */
		byte[] data=str.getBytes("UTF-8");
		fos.write(data);	//ÿ�ζ����֮ǰ������ȫ��ɾ��,��ͷ��ʼд
		fos.write(353);	//д�����һ���ֽ�
		System.out.println("д����ϣ�");
		fos.close();
		
	}
}
