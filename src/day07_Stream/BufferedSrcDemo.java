package day07_Stream;

import java.io.*;
import java.util.*;
/**
 * Buffered源码模拟
 * Buffered只是提高效率的,提供了一个缓冲区。(使用数组作为缓冲区)
 * 真正实现读功能的还是另一个Reader的子类对象
 * @author zhangchi
 *
 */
public class BufferedSrcDemo {
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("fwbw.txt");
		MyBufferedReader mbr = new MyBufferedReader(fr);
		
		String line = null;
		while((line = mbr.myReadLine()) != null){
			System.out.println(line);
		}
		mbr.myClose();
	}
}

/**
 * 装饰设计模式:基于已经存在的功能提供增强的功能
 * @author zhangchi
 *
 */
class MyBufferedReader{
	private char[] buffer = new char[1024];	//缓冲区
	private int index;//操作缓冲区的下标
	private int count;//记录缓冲区字符个数的变量
	private Reader r;
	MyBufferedReader(Reader r){
		this.r = r;
	}
	
	//一次读取一个字符的功能
	public int myRead() throws IOException{
		//判断缓冲区有没有字符
		if(count == 0){
			count = r.read(buffer);
			index = 0;//下标重置
		}
		if(count < 0)
			return -1;//返回的是读取的个数
		int num = buffer[index];
		index++;
		count--;
		 return num;
	}
	
	//一次读取一行的功能,反复调用一次读取一个字符的方法
	public String myReadLine() throws IOException{
		int num;
		StringBuilder sb = new StringBuilder();
		while((num = myRead()) != -1){
			if(num == '\r')
				continue;
			else if(num == '\n'){
				return sb.toString();
			}else 
				sb.append((char)num);				
		}
		return null;
	}
	
	public void myClose()throws IOException{
		r.close();
	}
	
}