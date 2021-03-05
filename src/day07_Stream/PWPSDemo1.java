package day07_Stream;

import java.io.*;

/**
 * 缓冲字符流
 * BufferedWriter(PrintWriter功能更强大,PW底层包了BW),BufferedReader
 * 特点是可以按行读写字符串
 * 
 * java.io.PrintWriter
 * 继承了OutputStream, 具备了字节输出流的基本功能,特有功能是打印功能(照原样显示)
 * 具有自动刷新的缓冲字符输出流
 * 创建PW时，它一定会在内部创建BufferedWriter作为缓冲功能的叠加
 * @author zhangchi
 *
 */
public class PWPSDemo1 {

	public static void main(String[] args) throws IOException {		
		/*
		 * PrintWriter
		 * 字符打印流,继承了Writer,具备了
		 */
		// public PrintWriter(String fileName, String csn)
		// private PrintWriter(Charset charset, File file)
		PrintWriter pw=new PrintWriter("PWDemo.txt","UTF-8");//方法底层内部创建了FOS和BufferedWriter
//		pw.write("锄禾日当午");//??
		pw.println("锄禾日当午");	//换行符占2个字节,所以文本的大小中包含了换行符占用的字节数
		pw.println("清明上河图");		//先擦在写
		System.out.println("写出完毕！");		
		
		/*
		 * 字节打印流
		 */
		// public PrintWriter(OutputStream out, boolean autoFlush) 
		PrintStream ps = new PrintStream(new FileOutputStream("PrintStreamDemo1.txt"));
//		ps.write(353);//a  只读取了一个字节
			
		ps.println(353);
		//ps.write(String.valueOf(353).getBytes()); //照原样输出
		pw.close();
		
		/*
		 * 提供了多种构造方法，其中有两个直接对文件进行写出操作的构造方法
		 * 
		 * PrintStream(File file)
		 * PrintStream(String path)
		 * PrintStream(OutputStream os)
		 * 
		 * PrintStream(File file)
		 * PrintStream(String filenama)
		 * PrintStream(OutputStream os)
		 * PrintStream(Writer w)
		 */	
	}
}
