package day06_File;

import java.io.File;

/**
 * ʵ�ַ�������ɾ���������ļ���Ŀ¼
 * @author zhangchi
 *
 */
public class DeleteAllFilesDemo {

	public static void main(String[] args) {
		String str = "����ɾ����������";
		File dir=new File(str);
		delete(dir);
	}

	private static void delete(File file) {//�ݹ����:�ڷ����ڲ������Լ��ķ���
		if(file.isDirectory()){   //�ж��ǲ���Ŀ¼ 
			//�Ƚ���������ɾ��
			File[] subs=file.listFiles();//��ȡ��������,�Ž�����
			for(File f:subs){
				delete(f);//�ݹ�
			}
		}
		file.delete();//����Ŀ¼�����ļ�,ɾ���ļ�
	}
	
}
//���οռ䣬�ֲ�����