package day07_Stream;

import java.io.*;
import java.util.Properties;
/**
 * ׷��ģʽд������
 * @author zhangchi
 *
 */
public class FileWriterDemo1 {
	public static void main(String[] args) throws IOException{
		
		//Properties fw = System.getProperties("line.separator");
		Properties pro = System.getProperties();
		String line = pro.getProperty("line.separator");//���ϵͳ���з�			//File.separator
		//public FileWriter(String fileName, boolean append)
		FileWriter fw = new FileWriter("appendTest.txt",true);
		fw.write("hehe");
		fw.write(line);		//ϵͳ����
		fw.write("\n");	
		fw.write("xxxxx");
		fw.close();
		
	}
}
