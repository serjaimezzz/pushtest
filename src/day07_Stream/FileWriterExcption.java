package day07_Stream;

import java.io.*;
/**
 * FileWriter的异常处理
 * @author zhangchi
 *
 */
public class FileWriterExcption {
	public static void main(String[] args) {
		FileWriter fw = null ;
		try{
			fw = new FileWriter("FileWriter.txt");	//FileNotFoundException
//			fw.write("hello");		//覆盖模式
			fw.write("HelloWorld");//每次运行,写入都是从文件开头开始写入
			fw.write("\n");
			fw.write("thinking");
			fw.close();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				if(fw != null)
				fw.close();//.close()也声明了异常
							//如果new FileWriter()时找不到路径,fw = null;null.close();//空指针异常
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
