package day07_Stream;

import java.io.*;

public class Demo13 {
	public static void main(String[] args)throws IOException {
		//��ȡ��������,System.in�ͼ����豸�����ı�׼����������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//in��InputStream������
		
		//���������̨,System.out�Ϳ���̨�豸�����ı�׼���������
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//���ļ���
		BufferedReader br1 = new BufferedReader(new InputStreamReader(new FileInputStream(" ")));
		
		//������ļ�
		BufferedWriter bw1 = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(" "))));
		
		
		String line = null;
		while((line = br.readLine())!= null){
			if("over".equals(line))
				break;
			
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		br.close();
		bw.close();
	}
}
