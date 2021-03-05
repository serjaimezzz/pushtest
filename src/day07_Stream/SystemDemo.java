package day07_Stream;

import java.io.*;
/**
 * 
 * @author zhangchi
 *
 */
public class SystemDemo {
	public static void main(String[] args) throws IOException {
//		FileReader fr = new FileReader("Note.txt");
//		InputStream ss = System.in;	//in��һ���Ѿ��ͼ��̰󶨺õ��ֽ�����������
//		int num = System.in.read();//һ�ζ�һ���ֽ�,�������һֱ�ȴ�����,����ʽ����
//		System.out.println(num);
		
		int num;
		StringBuilder sb = new StringBuilder();
		while(true){
			num = System.in.read();
			if(num == '\r')
				continue;
			else if(num == '\n'){
				if("over".equals(sb.toString()))
					break;
				System.out.println(sb.toString().toUpperCase());
				sb.delete(0, sb.length());
			}else
				sb.append((char)num);
		}
		
		
	}
}
