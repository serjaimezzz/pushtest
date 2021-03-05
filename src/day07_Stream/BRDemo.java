package day07_Stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ������
 * Ϊ����߶�д��Ч��,�����߱���д�Ĺ���
 * ʹ�û���������Ҫ����� ����/�����һ��ʹ��
 * 
 * java.io.BufferedReader	��ȡPrintWriterд��������
 * �����ַ�������,��ߵ��Ƕ�ȡ��Ч��(�ڴ���Ӳ��������)
 * �ص㣺���ж�ȡ�ַ���
 * @author zhangchi
 *
 */
public class BRDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("PWDemo2.txt");//���·��
		InputStreamReader isr=new InputStreamReader(fis,"UTF-8");//�ַ���		
		BufferedReader br=new BufferedReader(isr);//�ַ���ֻ�ܴ����ַ���
		/**
		 * BufferedReader�ṩ�˰��ж�ȡ����:
		 * String readLine()
		 * ������ȡ�����ַ���ֱ����ȡ�����з�Ϊֹ���������з�֮���ȡ���ַ���һ���ַ������ء�
		 * ������ֵΪnull�����ʾ��ȡ����ĩβ
		 * ע�⣺���ַ������������Ļ��з�
		 */
		String line =null;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		
		br.close();
		
		
	}
}
