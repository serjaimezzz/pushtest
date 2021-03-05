package day07_Stream;

import java.io.*;
/**
 * 流的设计流程:
 * 先确定使用什么流,
 * 再确定流的方向,是输入还是输出,
 * 最后确定设备。
 * 
 * @author zhangchi
 *
 */
public class FileWriterDemo {
	public static void main(String[] args) throws IOException {//声明IO异常
		/**
		 * 向文本文件中写入数据
		 * 因为是文本文件,所以使用字符流,又因为是写入,所以使用字符输出流的流类,字符输出流的父类是Writer
		 * 所以找Writer的可以操作文件的子类实现写入数据,Writer的子类FileWriter就是实现向文件中写入的
		 */
		
		/*
		 * 1.创建文件输出流对象和文件相关联,FileWriter(String FileName)
		 * 	 文件不存在会自动创建,默认在当前路径下创建文件
		 */
		FileWriter fw = new FileWriter("temp.txt");
		
		//2.使用文件输出流对象向文件中写入数据,数据写入到流内部的数组了
		fw.write("aaa");	//写入到了流内部的数组
		
		//把流中的数据刷到文件中
		fw.flush();
		
		//刷完之后可以继续写入
		fw.write("bbb");
		fw.flush();
		
		//先刷新,再关闭,以释放内存。关闭之后就不能再写入了。
		fw.close();
	}
}
