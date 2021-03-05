package day07_Stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 缓冲流
 * 为了提高读写的效率,本身不具备读写的功能
 * 使用缓冲流必须要结合着 输入/输出流一起使用
 * 
 * java.io.BufferedReader	读取PrintWriter写出的内容
 * 缓冲字符输入流,提高的是读取的效率(内存向硬盘拿数据)
 * 特点：按行读取字符串
 * @author zhangchi
 *
 */
public class BRDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("PWDemo2.txt");//相对路径
		InputStreamReader isr=new InputStreamReader(fis,"UTF-8");//字符流		
		BufferedReader br=new BufferedReader(isr);//字符流只能处理字符流
		/**
		 * BufferedReader提供了按行读取方法:
		 * String readLine()
		 * 连续读取若干字符，直到读取到换行符为止，并将换行符之间读取的字符以一个字符串返回。
		 * 若返回值为null，则表示读取到了末尾
		 * 注意：该字符串不包含最后的换行符
		 */
		String line =null;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		
		br.close();
		
		
	}
}
