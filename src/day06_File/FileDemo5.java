package day06_File;

import java.io.File;

/**
 * ��ȡһ��Ŀ¼�е���������
 * @author zhangchi
 *
 */
public class FileDemo5 {

	public static void main(String[] args) {
		
		File dir=new File(".");//��ǰ��Ŀ¼
		/*
		 * boolean isFile()/isDirectory()
		 * �ж��Ƿ�Ϊ�ļ�/Ŀ¼
		 */
		if(dir.isDirectory()){
			File[] subs=dir.listFiles();//��ȡ��������
			
			for(File s : subs){
				if(s.isFile())
					System.out.print("�ļ�:");
				else
					System.out.print("Ŀ¼:");				
				System.out.println(s.getName());
						
			}
		}
	}
}
