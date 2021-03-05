package day06_File;
import java.io.*;
/**
 *	listFiles()
 *	listFiles(Filter f)
 * @author zhangchi
 *
 */
public class FileListDemo {
	public static void main(String[] args) {		
		File path = new File(".");		
		
		//匿名内部类
		File[] arr = path.listFiles(new FilenameFilter(){
			@Override
			public boolean accept(File file, String name) {				
				return name.endsWith(".txt");
			}			
		});
		for(File f : arr)
			System.out.println(f.getName());		
		
		//Lambda表达式
		File[] arr1 = path.listFiles((file, name)->{
			return name.contains(".txt");
		});
		//((file,name)-> name.contains("txt"));
		
		for(File f : arr1)		
			System.out.println(f.getName());
		
		
		File[] arr2 = path.listFiles((file) -> file.isDirectory());
		for (File d : arr2) 
			System.out.println(d);
		
		MyFilter m = new MyFilter();
		File[] arr3 = path.listFiles(m);
		for (File d : arr3) {
			System.out.println(d);
		}
		
	}
}

class MyFilter implements FileFilter{
	public boolean accept(File file){
		return file.isDirectory();
	}
}

class MyFileNameFilter implements FilenameFilter{
	public boolean accept(File file, String name) {				
		return name.endsWith(".txt");
	}	
}