package day07_Stream;

import java.io.*;

/**
 * java.io.InputStreamReader
 * �ַ������������԰��ո������ַ�����ȡ�ַ�
 * �ֽ���-->�ַ���
 * @author zhangchi
 *
 */
public class ISRDemo1 {

	public static void main(String[] args) throws IOException {
//		FileInputStream fis=new FileInputStream("osw.txt");
//		InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
//		int d=-1;
//		while((d=isr.read())!=-1){
//			System.out.print((char)d);
//		}
//		isr.close();
		
		Test();
		
	}
	
	public static void Test() throws IOException{
		//�����׼��������
		InputStream in = System.in;//�ֽ���
		
		//���ֽ�����������ת���ַ�����������
		InputStreamReader isr = new InputStreamReader(in);
		
		//ʹ��BufferedReader,���ַ����������󴫸�BufferedReader�Ĺ��췽��
		BufferedReader br = new BufferedReader(isr);
		
		String line = null;
		while((line = br.readLine()) != null){
			if("over".equals(line))
				break;
			System.out.println(line.toUpperCase());
		}
		
		
		/*
		//�����׼�������,�ֽ������
		PrintStream out = System.out;

		// ���ֽ����������ת���ַ����������
		OutputStreamWriter osw = new OutputStreamWriter(out);

		// ʹ��BufferedWrite
		BufferedWriter bw = new BufferedWriter(osw);

		String line = null;
		while ((line = br.readLine()) != null)
			if ("over".equals(line))
				break;
		bw.write(line);
		bw.newLine();
		bw.flush();
		*/	
	}
}
