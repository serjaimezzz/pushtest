package day07_Stream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * �ļ������
 * ׷��д����
 * @author zhangchi
 */
public class FOSDemo2 {

	public static void main(String[] args) throws IOException {
		/*
		 * �ڴ���FOSʱ����ָ���ڶ������������Ҹ�ֵΪtrueʱ������׷��д������
		 * ��ô����ͨ��FOSд�������ݻᱻ׷�ӵ����ļ�ĩβ
		 */
		FileOutputStream fos=new FileOutputStream("FOSDemo.txt",true);
		
		fos.write("�����찲��".getBytes("UTF-8"));	//ֱ��д�뵽�豸,û��flushҲ��д��
		System.out.println("д����ϣ�");	
		fos.close();
		
	}
	
	
}
