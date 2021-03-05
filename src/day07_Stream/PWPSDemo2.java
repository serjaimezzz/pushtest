package day07_Stream;

import java.io.*;

/**
 * PrintWriter也提供了可以处理其他流的构造方法
 * 提供的方法可以传入字节流，也可以处理字符流。并且，当使用这类构造方法时，可以再
 * 传入第二个参数，该参数为boolean值，该值为true时，则具有了自动行刷新功能。
 * @author zhangchi
 *
 */
public class PWPSDemo2 {

	public static void main(String[] args) throws IOException,FileNotFoundException{
		String str = "PWDemo2.txt";
//		FileOutputStream fos=new FileOutputStream("pw1.txt");
//		OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
//		PrintWriter pw=new PrintWriter(osw);//无转换成"UTF-8"的构造方法
		
		PrintWriter pw1 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(str),"UTF-8"));
		pw1.println("我就是看你会不会换行");	//擦除重写,不追加 
		pw1.println("好啊");
		System.out.println("写出完毕！");
		pw1.close();
	}
}
