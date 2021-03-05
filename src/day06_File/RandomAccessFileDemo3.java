package day06_File;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RAF�ṩ�˷����д�����������ݵķ���
 * @author zhangchi
 *
 */
public class RandomAccessFileDemo3 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("raf1.dat","rw");
		
		System.out.println("pos:"+raf.getFilePointer());//��ȡָ��λ��
		
		/*
		 * д��һ��int���ֵ 
		 *                            vvvvvvvv
		 * 01111111 11111111 11111111 11111111
		 */
		int max=Integer.MAX_VALUE;
		raf.write(max>>>24);//1�ֽ�
		//System.out.println("pos:"+raf.getFilePointer());
		raf.write(max>>16);
		raf.write(max>>8);
		raf.write(max);
		//System.out.println("pos:"+raf.getFilePointer());
		
		raf.writeInt(max);//4�ֽ�
		//System.out.println("pos:"+raf.getFilePointer());
		
		raf.writeLong(1234L);//8�ֽ�
		//System.out.println("pos:"+raf.getFilePointer());
		
		raf.writeDouble(123.123);//8�ֽ�
		//System.out.println("pos:"+raf.getFilePointer());
		
		/*
		 * void seek(long pos)
		 * �ƶ�ָ�뵽ָ��λ��
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
		long lo=raf.readLong();//ָ���Ƶ�8������ȡlo��ֵ
		System.out.println(lo);
		
		raf.seek(16);
		double d=raf.readDouble();
		System.out.println(d);
		
		raf.close();
	}
}
