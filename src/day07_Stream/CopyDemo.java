package day07_Stream;

import java.io.*;

public class CopyDemo {
	public static void main(String[] args) throws IOException{
		
		File file = new File("Note.txt");
		File newFile = new File("Note_copy.txt");
		if(!newFile.exists()){
			file.createNewFile();
			System.out.println("文件已创建");
		}
		newFile = copyFile(file,newFile);	
			
	}
	
	
	public static File copyFile(File sourceFile,File targetFile)throws IOException{
		FileInputStream fis = new FileInputStream(sourceFile);
		FileOutputStream fos = new FileOutputStream(targetFile);
		byte[] data = new byte[1024];			//更改数组长度可以提速
		int len = -1;//读取到的字节数
		while((len = fis.read(data)) != -1){//读取字节直到EOF
			fos.write(data,0,len);
		}		
		fis.close();
		fos.close();
		System.out.println("复制完毕！");
		return targetFile;
	}
	
}


