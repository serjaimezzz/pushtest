package day07_Stream;

import java.io.*;

/**
 * �ַ���
 * �ַ����Ķ�д��λΪ�ַ����ַ������Ǹ߼�������Ȼ���ַ�Ϊ��λ��д���ݣ�����ʵ����
 * �ײ㻹�Ƕ�д�ֽڣ�ֻ�Ǵ��ֽ����ַ���ת�������������ַ��������
 * java.io.Reader:�ַ��������Ķ�������
 * java.io.Writer:�ַ�������Ķ�������
 * 
 * ת����
 * java.io.OutputStreamWriter
 * �ص��ǿ��԰���ָ�����ַ���д���ַ�
 * 
 * ֮���Գ�OutputStreamWriter��InputStreamReaderΪת������
 * ����Ϊ��������ַ�����ֻ�ܴ��������ַ��������ͼ��������ֽ�������͵����ַ������ܴ����ֽ��������⣬
 * ת�����൱��һ��ת���������ã����ǿ��Խ��ֽ�����ת��Ϊ�ַ����������������ַ����Ϳ��Դ����ˡ� 
 * @author zhangchi
 *
 */
public class OSWDemo {

	public static void main(String[] args) throws IOException,FileNotFoundException{
//		FileOutputStream fos=new FileOutputStream("osw.txt");
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("OSWDemo.txt"),"UTF-8");//���ñ���
		
		osw.write("�Ұ������찲��");//UTF-8,һ������ռ3���ֽ�
		osw.write("�찲����̫����");		
		System.out.println("д����ϣ�");
		osw.close();
		
		InputStreamReader isr = new InputStreamReader(new FileInputStream("OSWDemo.txt"),"UTF-8");
		int d = -1;
		while((d = isr.read()) != -1){
			System.out.print((char)d);
		}
		isr.close();
	}	
}
