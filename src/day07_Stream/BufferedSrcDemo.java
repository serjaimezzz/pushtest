package day07_Stream;

import java.io.*;
import java.util.*;
/**
 * BufferedԴ��ģ��
 * Bufferedֻ�����Ч�ʵ�,�ṩ��һ����������(ʹ��������Ϊ������)
 * ����ʵ�ֶ����ܵĻ�����һ��Reader���������
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
 * װ�����ģʽ:�����Ѿ����ڵĹ����ṩ��ǿ�Ĺ���
 * @author zhangchi
 *
 */
class MyBufferedReader{
	private char[] buffer = new char[1024];	//������
	private int index;//�������������±�
	private int count;//��¼�������ַ������ı���
	private Reader r;
	MyBufferedReader(Reader r){
		this.r = r;
	}
	
	//һ�ζ�ȡһ���ַ��Ĺ���
	public int myRead() throws IOException{
		//�жϻ�������û���ַ�
		if(count == 0){
			count = r.read(buffer);
			index = 0;//�±�����
		}
		if(count < 0)
			return -1;//���ص��Ƕ�ȡ�ĸ���
		int num = buffer[index];
		index++;
		count--;
		 return num;
	}
	
	//һ�ζ�ȡһ�еĹ���,��������һ�ζ�ȡһ���ַ��ķ���
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