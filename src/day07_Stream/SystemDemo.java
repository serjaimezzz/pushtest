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
//		InputStream ss = System.in;	//in是一个已经和键盘绑定好的字节输入流对象
//		int num = System.in.read();//一次读一个字节,不输入会一直等待输入,阻塞式方法
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
