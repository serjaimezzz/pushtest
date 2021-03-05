package day06_File;

import java.io.File;
import java.io.FileFilter;

/**
 * 获取一个目录中符合条件的部分子项
 * 使用重载的listFiles方法,需要传入一个额外的文件过滤器
 * 文件过滤器是一个接口: FileFilter
 * @author zhangchi
 *
 */
public class FileDemo6 {

	public static void main(String[] args) {
		File dir=new File(".");
		
		//内部类
//		File[] subs=dir.listFiles(new FileFilter(){
//			public boolean accept(File file){
//				System.out.println("过滤文件:"+file.getName());	//筛选的所有文件
//				return file.isFile();                       
//			}
//		});		
		
		//Lambda表达式
		File[] arr = dir.listFiles((File file)->{				
				return file.canWrite();			//过滤条件
		});		
		
		for(File result : arr){
			System.out.println(result.getName());
		}
	
	}
}
