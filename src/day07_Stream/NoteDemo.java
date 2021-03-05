package day07_Stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

/**
 * 完成记事本功能,要求:
 * 程序启动后，要求用户输入一个文件名，然后创建该文件，之后提示用户开始输入内容，
 * 并将用户输入的每一行内容都按行写入到该文件。
 * 当用户输入"exit"时，退出程序。
 * @author zhangchi
 *
 */
public class NoteDemo {

	public static void main(String[] args) throws IOException {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入文件名:");
		String fileName=scan.next();
		
		FileOutputStream fos=new FileOutputStream(fileName);
		OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");		
		PrintWriter pw=new PrintWriter(osw,true);//println时自动行刷新
// public PrintWriter(Writer out, boolean autoFlush)
		
		System.out.println("请输入内容，内容输入完毕后，输入EXIT退出");
		while(true){
			String note=scan.next();
			
			if(note.equalsIgnoreCase("EXIT")){
				System.out.println("写出完毕！");
				break;
			}
			/*
			 * 若PrintWriter(osw,true)则具有自动行刷新功能，那么每次调用println方法后就会自动flush。
			 */
			pw.print(note);//不具备自动行刷新
			pw.println(note);
			//pw.flush();
		}
		
		pw.close();
		scan.close();
	}
}
