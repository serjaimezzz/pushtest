package day06_File;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 复制文件
 * @author zhangchi
 *
 */
public class CopyDemo1 {

	public static void main(String[] args) throws IOException {
		/*
		 * 创建一个RAF读取原文件，再创建一个RAF向目标文件中写出。
		 * 顺序从原文件中读取每一个字节并写入到目标文件中即可。 
		 */
		RandomAccessFile raf=new RandomAccessFile("wegame.exe","r");
		RandomAccessFile raf_c=new RandomAccessFile("wegame_c.exe","rw");
		int d=-1;
		long start=System.currentTimeMillis();
		while((d=raf.read())!=-1){   //先读原文件的一个字节，d与-1比较直到读到-1
			raf_c.write(d);			
		}
		long end=System.currentTimeMillis();
		System.out.println("复制完毕!耗时:"+(end-start)+"ms");
		raf.close();
		raf_c.close();
	}
}
