package day07_Stream;

import java.io.*;

public class Test40 {
	public static void main(String[] args) throws IOException {
		File file = new File("Note.txt");
		readFile(file);
	}
	
	public static void readFile(File file)throws IOException{
		FileInputStream fis = new FileInputStream(file);		
		byte[] data = new byte[1024*10];
		int len = fis.read(data);
		String str = new String(data,0,len,"UTF-8");
		System.out.println(str);
		fis.close();
		
	}
}
