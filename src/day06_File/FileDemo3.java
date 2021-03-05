package day06_File;

import java.io.File;
import java.io.IOException;

/**
 * 创建一个新目录
 * @author zhangchi
 *
 */
public class FileDemo3 {

	public static void main(String[] args) throws IOException {
		/*
		 * 在当前目录下创建一个目录
		 */
		File dir=new File("directory.txt");
		if(!dir.exists()){			
			dir.mkdir();
			dir.createNewFile();	//为什么只创建一个？？？？？？？？？？？
			System.out.println("创建完毕！");
		}else{
			System.out.println("已存在！");
		}
		
		
		/**
		 * 在当前目录下创建多级目录
		 */
		String str = "";
		for(int i = 1;i <= 3;i++){			//创建多级目录
			str = str  +  i +File.separator ;	//	""1\\""2\\""3
		}
		File dirs = new File(str);
//		File dir=new File(
//				"a"+File.separator+
//				"b"+File.separator+
//				"c"+File.separator+
//				"d"+File.separator+
//				"e"+File.separator+
//				"f"
//		);
		
//		if(!dirs.exists()){
//			/*
//			 *  在创建当前目录的同时将所有不存在的父目录一起创建出来
//			 */
//			dirs.mkdirs();
//			System.out.println("创建完毕！");
//		}else{
//			System.out.println("目录已存在！");
//		}
		
		
	}
}
