package day06_File;

import java.io.File;

/**
 * 获取一个目录中的所有子项
 * @author zhangchi
 *
 */
public class FileDemo5 {

	public static void main(String[] args) {
		
		File dir=new File(".");//当前根目录
		/*
		 * boolean isFile()/isDirectory()
		 * 判断是否为文件/目录
		 */
		if(dir.isDirectory()){
			File[] subs=dir.listFiles();//获取所有子项
			
			for(File s : subs){
				if(s.isFile())
					System.out.print("文件:");
				else
					System.out.print("目录:");				
				System.out.println(s.getName());
						
			}
		}
	}
}
