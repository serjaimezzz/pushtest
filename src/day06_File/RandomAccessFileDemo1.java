package day06_File;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * 用来读写文件数据
 * RAF是基于指针进行读写的，即RAF总是在指针指向的位置读写字节，并且读写后指针会自动向后移动。
 * RAF既可读取文件数据也可以向文件中写入数据
 * @author zhangchi
 *
 */
public class RandomAccessFileDemo1 {

	public static void main(String[] args) throws IOException {
		/*
		 * RandomAccessFile(String path,String mode) 
		 * 
		 * RandomAccessFile(File file,String mode)
		 * 第二个参数为模式，常用的有
		 * r:只读模式
		 * re:读写模式
		 */
		//RAF会自动创建文件，但不会自动创建目录
		RandomAccessFile raf=new RandomAccessFile("raf.dat","rw");//.dat是随便写的
		/*
		 * void write(int d)
		 * 写出给定的int值对应的二进制的低八位
		 *                            vvvvvvvv
		 * 11111111 11111111 11111111 11111111  //-1
		 */
		raf.write(-1);//重新运行会覆盖之前的数据
		raf.write(1);
		
		System.out.println("写出完毕！");
		raf.close();
		
		
	}
}
