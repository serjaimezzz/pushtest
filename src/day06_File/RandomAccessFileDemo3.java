package day06_File;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RAF提供了方便读写基本类型数据的方法
 * @author zhangchi
 *
 */
public class RandomAccessFileDemo3 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("raf1.dat","rw");
		
		System.out.println("pos:"+raf.getFilePointer());//获取指针位置
		
		/*
		 * 写入一个int最大值 
		 *                            vvvvvvvv
		 * 01111111 11111111 11111111 11111111
		 */
		int max=Integer.MAX_VALUE;
		raf.write(max>>>24);//1字节
		//System.out.println("pos:"+raf.getFilePointer());
		raf.write(max>>16);
		raf.write(max>>8);
		raf.write(max);
		//System.out.println("pos:"+raf.getFilePointer());
		
		raf.writeInt(max);//4字节
		//System.out.println("pos:"+raf.getFilePointer());
		
		raf.writeLong(1234L);//8字节
		//System.out.println("pos:"+raf.getFilePointer());
		
		raf.writeDouble(123.123);//8字节
		//System.out.println("pos:"+raf.getFilePointer());
		
		/*
		 * void seek(long pos)
		 * 移动指针到指定位置
		 */
		raf.seek(0);
		//System.out.println("pos:"+raf.getFilePointer());
		
		//end of file
		int i=raf.readInt();
		System.out.println(i);
		
		raf.seek(0);
		long l=raf.readLong();
		System.out.println(l);
		
		raf.seek(8);
		long lo=raf.readLong();//指针移到8处，读取lo的值
		System.out.println(lo);
		
		raf.seek(16);
		double d=raf.readDouble();
		System.out.println(d);
		
		raf.close();
	}
}
