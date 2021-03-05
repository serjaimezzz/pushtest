package day07_Stream;

import java.io.*;

public class ISRDemo {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("OSWDemo.txt"),"UTF-8");
		int d = -1;	//��������Unicode����,��תΪchar,�����û�
		while((d = isr.read()) != -1){
			System.out.print(d);//Unicode����
			System.out.println((char)d);
		}
		isr.close();
	}
}
