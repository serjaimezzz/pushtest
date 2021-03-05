package day06_File;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * ������д�ļ�����
 * RAF�ǻ���ָ����ж�д�ģ���RAF������ָ��ָ���λ�ö�д�ֽڣ����Ҷ�д��ָ����Զ�����ƶ���
 * RAF�ȿɶ�ȡ�ļ�����Ҳ�������ļ���д������
 * @author zhangchi
 *
 */
public class RandomAccessFileDemo1 {

	public static void main(String[] args) throws IOException {
		/*
		 * RandomAccessFile(String path,String mode) 
		 * 
		 * RandomAccessFile(File file,String mode)
		 * �ڶ�������Ϊģʽ�����õ���
		 * r:ֻ��ģʽ
		 * re:��дģʽ
		 */
		//RAF���Զ������ļ����������Զ�����Ŀ¼
		RandomAccessFile raf=new RandomAccessFile("raf.dat","rw");//.dat�����д��
		/*
		 * void write(int d)
		 * д��������intֵ��Ӧ�Ķ����ƵĵͰ�λ
		 *                            vvvvvvvv
		 * 11111111 11111111 11111111 11111111  //-1
		 */
		raf.write(-1);//�������лḲ��֮ǰ������
		raf.write(1);
		
		System.out.println("д����ϣ�");
		raf.close();
		
		
	}
}
