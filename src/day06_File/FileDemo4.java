package day06_File;

import java.io.File;

/**
 * ɾ��Ŀ¼:Ŀ¼��û���ļ����ܳɹ�ɾ��
 * @author zhangchi
 *
 */
public class FileDemo4 {

	public static void main(String[] args) {
		File dir=new File("a");
		if(dir.exists()){
			dir.delete();
			if(dir.exists()){
			System.out.println("ɾ��ʧ�ܣ�");
			return;
			}
		}else{
			System.out.println("Ŀ¼�����ڣ�");
		}
		
	}
}
