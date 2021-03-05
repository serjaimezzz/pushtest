package day06_File;


import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��Ч�����ļ�:
 * ������߶�дЧ�ʣ�����ͨ�����ÿ�ζ�д�������������ٶ�д�������ﵽ
 * @author zhangchi
 *
 */
public class CopyDemo2 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("wegame.exe","r");
		RandomAccessFile raf_c=new RandomAccessFile("wegame_c2.exe","rw");
		
		/*
		 * int read(byte[] data)
		 * һ���Գ��Զ�ȡ�������ֽ������ܳ��ȵ��ֽ��������뵽�������У�
		 * ����ֵΪʵ�ʶ�ȡ�����ֽ�����������ֵΪ-1�����ʾ����û�ж�ȡ���κ�����(�ļ�ĩβ)
		 */
		
		//10k
		byte[] buf=new byte[1024*10];
		int len=-1;//ÿ��ʵ�ʶ������ֽ���
		
		long start=System.currentTimeMillis();
		while((len=raf.read(buf))!=-1){
			/*
			 * void write(byte[] d,int start,int len)
			 * �����������д��±�start����ʼ������len���ֽ�һ����д��
			 */
			raf_c.write(buf,0,len); //0,len������д����
		}
		long end=System.currentTimeMillis();
		System.out.println("������ϣ���ʱ:"+(end-start)+"ms");
		
		raf.close();
		raf_c.close();
		
		
	}
}
