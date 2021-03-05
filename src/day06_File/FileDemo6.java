package day06_File;

import java.io.File;
import java.io.FileFilter;

/**
 * ��ȡһ��Ŀ¼�з��������Ĳ�������
 * ʹ�����ص�listFiles����,��Ҫ����һ��������ļ�������
 * �ļ���������һ���ӿ�: FileFilter
 * @author zhangchi
 *
 */
public class FileDemo6 {

	public static void main(String[] args) {
		File dir=new File(".");
		
		//�ڲ���
//		File[] subs=dir.listFiles(new FileFilter(){
//			public boolean accept(File file){
//				System.out.println("�����ļ�:"+file.getName());	//ɸѡ�������ļ�
//				return file.isFile();                       
//			}
//		});		
		
		//Lambda���ʽ
		File[] arr = dir.listFiles((File file)->{				
				return file.canWrite();			//��������
		});		
		
		for(File result : arr){
			System.out.println(result.getName());
		}
	
	}
}
