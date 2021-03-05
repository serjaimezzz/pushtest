package day07_Stream;

import java.io.*;

/**
 * ������
 * java.io.BufferedInputStream
 * java.io.BufferedOutputStream
 * �����ֽ������������һ�Ը߼�����ʹ�����ǿ��Լӿ��дЧ��
 * 
 * �߼������Դ�����������������������˶��ٸ߼���������¶�Ҫ�еͼ�����
 * ��Ϊ�ͼ�������ʵ��д���ݵ������߼������Ǵ������ݵġ�
 * �߼����������������γ����������ӣ�������Ч����ϲ�ͬ�ĸ߼������Եõ����ӵ�Ч��
 * @author zhangchi
 *
 */
public class BIS_BOSDemo {
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis= new BufferedInputStream(new FileInputStream("wegame.exe"));//����
		BufferedOutputStream bos= new BufferedOutputStream(new FileOutputStream("wegame_buffered.exe"));//д��
		int d=-1;
		long start=System.currentTimeMillis();
				
		while((d = bis.read())!=-1){
			bos.write(d);
		}
		
		long end=System.currentTimeMillis();
		System.out.println("������ϣ���ʱ:"+(end-start)+"ms");
		bis.close();
		bos.close();
		
		/*
		 * �������ڲ���һ������������bis.read������ȡ��һ���ֽ�ʱ��ʵ����BIS��һ���Զ�ȡһ���ֽ�  byte[] buffer = getBufIfOpen();
		 * �������ڲ����ֽ������У�Ȼ�󽫵�һ���ֽڷ��أ����ٴε���read����ʱ��BISֱ�Ӵ��ֽ������н��ڶ����ֽڷ���
		 * ֱ���ֽ������������ֽ�ȫ�����غ󣬲Ż��ٴζ�ȡһ���ֽڡ�
		 * ���Ի�����Ҳ���������һ�ζ�д�����������ٶ�д�������ﵽ��߶�дЧ�ʵ�
		 */
	}

}
