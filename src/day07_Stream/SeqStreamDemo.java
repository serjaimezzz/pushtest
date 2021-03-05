package day07_Stream;
import java.io.*;
import java.util.*;
/**
 * SequenceInputStream
 * 序列流,字节输入流
 * @author zhangchi
 *
 */
public class SeqStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = new FileInputStream("SeqStream1.txt");
		FileInputStream fis2 = new FileInputStream("SeqStream2.txt");
		FileInputStream fis3 = new FileInputStream("SeqStream3.txt");
		
		Vector<FileInputStream> v = new Vector<>();
		v.add(fis1);
		v.add(fis2);
		v.add(fis3);
		
		Enumeration<FileInputStream> en = v.elements();
		SequenceInputStream sis = new SequenceInputStream(en);
		
		FileOutputStream fos = new FileOutputStream("comSeq.txt");
		byte[] arr = new byte[1024];
		int num = 0;
		while((num = sis.read(arr)) != -1){			
			fos.write(arr, 0, num);
		}
		sis.close();
		fos.close();
	}
}
