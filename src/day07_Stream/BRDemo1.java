package day07_Stream;

import java.io.*;

public class BRDemo1 {
	public static void main(String[] args) throws IOException {
		//���ı��ļ��ж�ȡ����,ʹ�û�����
		
		//1.�����ļ�������������ļ������
		FileReader fr = new FileReader("fwbw.txt");
		
		//2.Ϊ����߶�ȡ��Ч��,ʹ���ַ����뻺����
		BufferedReader br = new BufferedReader(fr);
		
		/**String readLine()	һ�ζ�ȡһ��*/
//		String line = br.readLine();
//		System.out.println(line);	
//		line = br.readLine();
//		System.out.println(line);
		String line = null;
		while((line = br.readLine()) != null){
			System.out.println(line);
		}
		br.close();//�رջ�����
	}
}
