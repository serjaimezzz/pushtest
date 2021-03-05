package day07_Stream;
import java.io.*;
/**
 * �ڴ���:
 * ByteArrayInputStream
 * ���ֽ������ж�ȡ,�ֽ��������ڴ���,���Խ��ڴ���
 * 
 * ByteArrayInputStream
 * ������д�뵽�ֽ�����(д���ڴ�)
 * @author zhangchi
 *
 */
public class BAISDemo {
	public static void main(String[] args) throws IOException,ClassNotFoundException{		
		
		
		ByteArrayInputStream bis = new ByteArrayInputStream("baos".getBytes());//���ڴ��ж�
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();//д�뵽�����ڲ�(�ڴ�)
		//�����ڲ�������һ������,������д���ڲ����ֽ�������,�Ա���ʱʹ��(�����ļ�)
		
		byte[] arr = new byte[1024];
		int num = 0;
		while((num = bis.read(arr)) != -1){
			bos.write(arr, 0, num);
		}
		
		byte[] array = bos.toByteArray();
		System.out.println(new String(array));
		bis.close();
		bos.close();
		
	}
}
