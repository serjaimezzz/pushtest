package day06_File;

import java.io.File;
import java.io.IOException;

/**
 * 创建一个文件
 * @author zhangchi
 *
 */
public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		/*
		 * 在当前目录下创建文件test.txt
		 * 如果不写./默认路径就是当前目录，即"./"
		 */
		File file=new File("test.txt");
		/*
		 * boolean exists()
		 * 判断该文件是否真实存在
		 * true表示存在
		 */
		if(!file.exists()){
			file.createNewFile();	//创建新文件
			System.out.println("创建完毕！");
		}else{
			System.out.println("该文件已存在！");
		}
		
		/**
		 * 删除当前目录中的test.txt文件 
		 */
		File file1=new File("test.txt");
		if(file1.exists()){
			file1.delete();
			System.out.println("删除完毕！");
		}else{
			System.out.println("文件不存在！");
		}
		
		
	}
	
}
