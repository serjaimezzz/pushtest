package day07_Stream;

import java.io.*;

/**
 * �����ַ���
 * BufferedWriter(PrintWriter���ܸ�ǿ��,PW�ײ����BW),BufferedReader
 * �ص��ǿ��԰��ж�д�ַ���
 * 
 * java.io.PrintWriter
 * �̳���OutputStream, �߱����ֽ�������Ļ�������,���й����Ǵ�ӡ����(��ԭ����ʾ)
 * �����Զ�ˢ�µĻ����ַ������
 * ����PWʱ����һ�������ڲ�����BufferedWriter��Ϊ���幦�ܵĵ���
 * @author zhangchi
 *
 */
public class PWPSDemo1 {

	public static void main(String[] args) throws IOException {		
		/*
		 * PrintWriter
		 * �ַ���ӡ��,�̳���Writer,�߱���
		 */
		// public PrintWriter(String fileName, String csn)
		// private PrintWriter(Charset charset, File file)
		PrintWriter pw=new PrintWriter("PWDemo.txt","UTF-8");//�����ײ��ڲ�������FOS��BufferedWriter
//		pw.write("�����յ���");//??
		pw.println("�����յ���");	//���з�ռ2���ֽ�,�����ı��Ĵ�С�а����˻��з�ռ�õ��ֽ���
		pw.println("�����Ϻ�ͼ");		//�Ȳ���д
		System.out.println("д����ϣ�");		
		
		/*
		 * �ֽڴ�ӡ��
		 */
		// public PrintWriter(OutputStream out, boolean autoFlush) 
		PrintStream ps = new PrintStream(new FileOutputStream("PrintStreamDemo1.txt"));
//		ps.write(353);//a  ֻ��ȡ��һ���ֽ�
			
		ps.println(353);
		//ps.write(String.valueOf(353).getBytes()); //��ԭ�����
		pw.close();
		
		/*
		 * �ṩ�˶��ֹ��췽��������������ֱ�Ӷ��ļ�����д�������Ĺ��췽��
		 * 
		 * PrintStream(File file)
		 * PrintStream(String path)
		 * PrintStream(OutputStream os)
		 * 
		 * PrintStream(File file)
		 * PrintStream(String filenama)
		 * PrintStream(OutputStream os)
		 * PrintStream(Writer w)
		 */	
	}
}
