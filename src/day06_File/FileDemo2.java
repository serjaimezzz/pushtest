package day06_File;

import java.io.File;
import java.io.IOException;

/**
 * ����һ���ļ�
 * @author zhangchi
 *
 */
public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		/*
		 * �ڵ�ǰĿ¼�´����ļ�test.txt
		 * �����д./Ĭ��·�����ǵ�ǰĿ¼����"./"
		 */
		File file=new File("test.txt");
		/*
		 * boolean exists()
		 * �жϸ��ļ��Ƿ���ʵ����
		 * true��ʾ����
		 */
		if(!file.exists()){
			file.createNewFile();	//�������ļ�
			System.out.println("������ϣ�");
		}else{
			System.out.println("���ļ��Ѵ��ڣ�");
		}
		
		/**
		 * ɾ����ǰĿ¼�е�test.txt�ļ� 
		 */
		File file1=new File("test.txt");
		if(file1.exists()){
			file1.delete();
			System.out.println("ɾ����ϣ�");
		}else{
			System.out.println("�ļ������ڣ�");
		}
		
		
	}
	
}
