package day06_File;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.io.File
 * File的每一个实例可以表示文件系统中的一个文件或目录，使用File可以:
 * 1.访问文件或目录的属性(如:大小，名字，修改时间等)
 * 2.操作文件或目录(创建，删除文件和目录)
 * 3.访问目录中的所有内容
 * couldn't:访问文件中的数据
 * 
 * @author zhangchi
 *
 */
public class FileDemo1 {

	public static void main(String[] args) throws IOException{
		File file=new File("."+File.separator+"File1.txt");
		File file1 = new File(".\\File1.txt");	//相对路径,文件在根目录下 	.代表当前项目所在的根目录 。Linux用的是/
		File file2 = new File("D:\\JavaInThinking\\JAVASE\\File1.txt");//绝对路径
		//绝对路径:由操作系统规定,如果文件夹增删改/重新分盘会导致路径变化,此时的绝对路径就会失效。与操作系统有严重的耦合关系。
	
		//public File(String parent, String child)
		File file3 =new File("D:\\JavaInThinking\\JAVASE","File1.txt");	
		/**
		 * 判断文件是否存在,不存在就创建
		 */
		if(!file.exists()){
			file.createNewFile();
			System.out.println("文件创建完毕!");
		}else
			System.out.println("文件已存在");
//		
		//获取名字
		String name=file.getName();
		System.out.println("name:"+name);
	
		//获取文件的大小
		long length=file.length();	//占用的字节量
		System.out.println("大小:"+length+"字节");
		
		//是否为文件
		boolean isFile=file.isFile();
		System.out.println("是文件:"+isFile);
				
		//是否为目录
		boolean isDir=file.isDirectory();
		System.out.println("是目录:"+isDir);
		
		//是否隐藏
		boolean isHidden=file.isHidden();
		System.out.println("是否隐藏:"+isHidden);
		
		//最后修改时间
		long time=file.lastModified();
		SimpleDateFormat sdf=new SimpleDateFormat(
				"yyyy年M月d日 HH:mm:ss");
		Date date=new Date(time);
		System.out.println("修改时间:"+sdf.format(date));
		
		String s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified()));
		System.out.println(s);
		
		//是否可写
		boolean canWrite=file.canWrite();
		System.out.println("是否可写:"+canWrite);
		
		//得到绝对路径
		System.out.println(file.getAbsolutePath());
		
		// 列出根目录
		File[] roots = File.listRoots();
		for (File f : roots) {
			System.out.println(f);
		}
	}	
}
