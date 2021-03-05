package day06_File;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.io.File
 * File��ÿһ��ʵ�����Ա�ʾ�ļ�ϵͳ�е�һ���ļ���Ŀ¼��ʹ��File����:
 * 1.�����ļ���Ŀ¼������(��:��С�����֣��޸�ʱ���)
 * 2.�����ļ���Ŀ¼(������ɾ���ļ���Ŀ¼)
 * 3.����Ŀ¼�е���������
 * couldn't:�����ļ��е�����
 * 
 * @author zhangchi
 *
 */
public class FileDemo1 {

	public static void main(String[] args) throws IOException{
		File file=new File("."+File.separator+"File1.txt");
		File file1 = new File(".\\File1.txt");	//���·��,�ļ��ڸ�Ŀ¼�� 	.����ǰ��Ŀ���ڵĸ�Ŀ¼ ��Linux�õ���/
		File file2 = new File("D:\\JavaInThinking\\JAVASE\\File1.txt");//����·��
		//����·��:�ɲ���ϵͳ�涨,����ļ�����ɾ��/���·��̻ᵼ��·���仯,��ʱ�ľ���·���ͻ�ʧЧ�������ϵͳ�����ص���Ϲ�ϵ��
	
		//public File(String parent, String child)
		File file3 =new File("D:\\JavaInThinking\\JAVASE","File1.txt");	
		/**
		 * �ж��ļ��Ƿ����,�����ھʹ���
		 */
		if(!file.exists()){
			file.createNewFile();
			System.out.println("�ļ��������!");
		}else
			System.out.println("�ļ��Ѵ���");
//		
		//��ȡ����
		String name=file.getName();
		System.out.println("name:"+name);
	
		//��ȡ�ļ��Ĵ�С
		long length=file.length();	//ռ�õ��ֽ���
		System.out.println("��С:"+length+"�ֽ�");
		
		//�Ƿ�Ϊ�ļ�
		boolean isFile=file.isFile();
		System.out.println("���ļ�:"+isFile);
				
		//�Ƿ�ΪĿ¼
		boolean isDir=file.isDirectory();
		System.out.println("��Ŀ¼:"+isDir);
		
		//�Ƿ�����
		boolean isHidden=file.isHidden();
		System.out.println("�Ƿ�����:"+isHidden);
		
		//����޸�ʱ��
		long time=file.lastModified();
		SimpleDateFormat sdf=new SimpleDateFormat(
				"yyyy��M��d�� HH:mm:ss");
		Date date=new Date(time);
		System.out.println("�޸�ʱ��:"+sdf.format(date));
		
		String s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified()));
		System.out.println(s);
		
		//�Ƿ��д
		boolean canWrite=file.canWrite();
		System.out.println("�Ƿ��д:"+canWrite);
		
		//�õ�����·��
		System.out.println(file.getAbsolutePath());
		
		// �г���Ŀ¼
		File[] roots = File.listRoots();
		for (File f : roots) {
			System.out.println(f);
		}
	}	
}
