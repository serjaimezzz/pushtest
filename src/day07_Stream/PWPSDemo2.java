package day07_Stream;

import java.io.*;

/**
 * PrintWriterҲ�ṩ�˿��Դ����������Ĺ��췽��
 * �ṩ�ķ������Դ����ֽ�����Ҳ���Դ����ַ��������ң���ʹ�����๹�췽��ʱ��������
 * ����ڶ����������ò���Ϊbooleanֵ����ֵΪtrueʱ����������Զ���ˢ�¹��ܡ�
 * @author zhangchi
 *
 */
public class PWPSDemo2 {

	public static void main(String[] args) throws IOException,FileNotFoundException{
		String str = "PWDemo2.txt";
//		FileOutputStream fos=new FileOutputStream("pw1.txt");
//		OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
//		PrintWriter pw=new PrintWriter(osw);//��ת����"UTF-8"�Ĺ��췽��
		
		PrintWriter pw1 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(str),"UTF-8"));
		pw1.println("�Ҿ��ǿ���᲻�ỻ��");	//������д,��׷�� 
		pw1.println("�ð�");
		System.out.println("д����ϣ�");
		pw1.close();
	}
}
