package day07_Stream;

import java.io.*;

/**
 * java.io.InputStreamReader
 * 字符输入流，可以按照给定的字符集读取字符
 * 字节流-->字符流
 * @author zhangchi
 *
 */
public class ISRDemo1 {

	public static void main(String[] args) throws IOException {
//		FileInputStream fis=new FileInputStream("osw.txt");
//		InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
//		int d=-1;
//		while((d=isr.read())!=-1){
//			System.out.print((char)d);
//		}
//		isr.close();
		
		Test();
		
	}
	
	public static void Test() throws IOException{
		//定义标准的输入流
		InputStream in = System.in;//字节流
		
		//把字节输入流对象转成字符输入流对象
		InputStreamReader isr = new InputStreamReader(in);
		
		//使用BufferedReader,把字符输入流对象传给BufferedReader的构造方法
		BufferedReader br = new BufferedReader(isr);
		
		String line = null;
		while((line = br.readLine()) != null){
			if("over".equals(line))
				break;
			System.out.println(line.toUpperCase());
		}
		
		
		/*
		//定义标准的输出流,字节输出流
		PrintStream out = System.out;

		// 把字节输出流对象转成字符输出流对象
		OutputStreamWriter osw = new OutputStreamWriter(out);

		// 使用BufferedWrite
		BufferedWriter bw = new BufferedWriter(osw);

		String line = null;
		while ((line = br.readLine()) != null)
			if ("over".equals(line))
				break;
		bw.write(line);
		bw.newLine();
		bw.flush();
		*/	
	}
}
