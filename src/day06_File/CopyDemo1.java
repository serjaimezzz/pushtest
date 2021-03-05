package day06_File;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * �����ļ�
 * @author zhangchi
 *
 */
public class CopyDemo1 {

	public static void main(String[] args) throws IOException {
		/*
		 * ����һ��RAF��ȡԭ�ļ����ٴ���һ��RAF��Ŀ���ļ���д����
		 * ˳���ԭ�ļ��ж�ȡÿһ���ֽڲ�д�뵽Ŀ���ļ��м��ɡ� 
		 */
		RandomAccessFile raf=new RandomAccessFile("wegame.exe","r");
		RandomAccessFile raf_c=new RandomAccessFile("wegame_c.exe","rw");
		int d=-1;
		long start=System.currentTimeMillis();
		while((d=raf.read())!=-1){   //�ȶ�ԭ�ļ���һ���ֽڣ�d��-1�Ƚ�ֱ������-1
			raf_c.write(d);			
		}
		long end=System.currentTimeMillis();
		System.out.println("�������!��ʱ:"+(end-start)+"ms");
		raf.close();
		raf_c.close();
	}
}
