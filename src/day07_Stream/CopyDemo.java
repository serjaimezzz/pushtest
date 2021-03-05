package day07_Stream;

import java.io.*;

public class CopyDemo {
	public static void main(String[] args) throws IOException{
		
		File file = new File("Note.txt");
		File newFile = new File("Note_copy.txt");
		if(!newFile.exists()){
			file.createNewFile();
			System.out.println("�ļ��Ѵ���");
		}
		newFile = copyFile(file,newFile);	
			
	}
	
	
	public static File copyFile(File sourceFile,File targetFile)throws IOException{
		FileInputStream fis = new FileInputStream(sourceFile);
		FileOutputStream fos = new FileOutputStream(targetFile);
		byte[] data = new byte[1024];			//�������鳤�ȿ�������
		int len = -1;//��ȡ�����ֽ���
		while((len = fis.read(data)) != -1){//��ȡ�ֽ�ֱ��EOF
			fos.write(data,0,len);
		}		
		fis.close();
		fos.close();
		System.out.println("������ϣ�");
		return targetFile;
	}
	
}


