package day07_Stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

/**
 * ��ɼ��±�����,Ҫ��:
 * ����������Ҫ���û�����һ���ļ�����Ȼ�󴴽����ļ���֮����ʾ�û���ʼ�������ݣ�
 * �����û������ÿһ�����ݶ�����д�뵽���ļ���
 * ���û�����"exit"ʱ���˳�����
 * @author zhangchi
 *
 */
public class NoteDemo {

	public static void main(String[] args) throws IOException {
		Scanner scan=new Scanner(System.in);
		System.out.println("�������ļ���:");
		String fileName=scan.next();
		
		FileOutputStream fos=new FileOutputStream(fileName);
		OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");		
		PrintWriter pw=new PrintWriter(osw,true);//printlnʱ�Զ���ˢ��
// public PrintWriter(Writer out, boolean autoFlush)
		
		System.out.println("���������ݣ�����������Ϻ�����EXIT�˳�");
		while(true){
			String note=scan.next();
			
			if(note.equalsIgnoreCase("EXIT")){
				System.out.println("д����ϣ�");
				break;
			}
			/*
			 * ��PrintWriter(osw,true)������Զ���ˢ�¹��ܣ���ôÿ�ε���println������ͻ��Զ�flush��
			 */
			pw.print(note);//���߱��Զ���ˢ��
			pw.println(note);
			//pw.flush();
		}
		
		pw.close();
		scan.close();
	}
}
