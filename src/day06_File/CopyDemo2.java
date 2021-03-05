package day06_File;


import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 高效复制文件:
 * 若想提高读写效率，可以通过提高每次读写的数据量来减少读写次数来达到
 * @author zhangchi
 *
 */
public class CopyDemo2 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("wegame.exe","r");
		RandomAccessFile raf_c=new RandomAccessFile("wegame_c2.exe","rw");
		
		/*
		 * int read(byte[] data)
		 * 一次性尝试读取给定的字节数组总长度的字节量并存入到该数组中，
		 * 返回值为实际读取到的字节量，若返回值为-1，则表示本次没有读取到任何数据(文件末尾)
		 */
		
		//10k
		byte[] buf=new byte[1024*10];
		int len=-1;//每次实际读到的字节量
		
		long start=System.currentTimeMillis();
		while((len=raf.read(buf))!=-1){
			/*
			 * void write(byte[] d,int start,int len)
			 * 将给定数组中从下标start处开始的连续len个字节一次性写出
			 */
			raf_c.write(buf,0,len); //0,len读多少写多少
		}
		long end=System.currentTimeMillis();
		System.out.println("复制完毕！耗时:"+(end-start)+"ms");
		
		raf.close();
		raf_c.close();
		
		
	}
}
