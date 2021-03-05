package day06_File;

import java.io.File;

/**
 * 实现方法，来删除给定的文件或目录
 * @author zhangchi
 *
 */
public class DeleteAllFilesDemo {

	public static void main(String[] args) {
		String str = "谨慎删除！！！！";
		File dir=new File(str);
		delete(dir);
	}

	private static void delete(File file) {//递归调用:在方法内部调用自己的方法
		if(file.isDirectory()){   //判断是不是目录 
			//先将所有子项删除
			File[] subs=file.listFiles();//获取所有子项,放进数组
			for(File f:subs){
				delete(f);//递归
			}
		}
		file.delete();//不是目录就是文件,删除文件
	}
	
}
//盗梦空间，恐怖邮轮