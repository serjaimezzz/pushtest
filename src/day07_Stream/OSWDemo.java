package day07_Stream;

import java.io.*;

/**
 * 字符流
 * 字符流的读写单位为字符。字符流都是高级流，虽然以字符为单位读写数据，但是实际上
 * 底层还是读写字节，只是从字节与字符的转换工作交给了字符流来完成
 * java.io.Reader:字符输入流的顶级父类
 * java.io.Writer:字符输出流的顶级父类
 * 
 * 转换流
 * java.io.OutputStreamWriter
 * 特点是可以按照指定的字符集写出字符
 * 
 * 之所以称OutputStreamWriter与InputStreamReader为转换流，
 * 是因为大多数的字符流都只能处理其他字符流，而低级流又是字节流，这就导致字符流不能处理字节流的问题，
 * 转换流相当是一个转换器的作用，它们可以将字节流先转变为字符流，这样其他的字符流就可以处理了。 
 * @author zhangchi
 *
 */
public class OSWDemo {

	public static void main(String[] args) throws IOException,FileNotFoundException{
//		FileOutputStream fos=new FileOutputStream("osw.txt");
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("OSWDemo.txt"),"UTF-8");//设置编码
		
		osw.write("我爱北京天安门");//UTF-8,一个汉字占3个字节
		osw.write("天安门上太阳升");		
		System.out.println("写出完毕！");
		osw.close();
		
		InputStreamReader isr = new InputStreamReader(new FileInputStream("OSWDemo.txt"),"UTF-8");
		int d = -1;
		while((d = isr.read()) != -1){
			System.out.print((char)d);
		}
		isr.close();
	}	
}
