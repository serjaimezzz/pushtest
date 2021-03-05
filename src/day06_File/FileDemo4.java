package day06_File;

import java.io.File;

/**
 * 删除目录:目录下没有文件才能成功删除
 * @author zhangchi
 *
 */
public class FileDemo4 {

	public static void main(String[] args) {
		File dir=new File("a");
		if(dir.exists()){
			dir.delete();
			if(dir.exists()){
			System.out.println("删除失败！");
			return;
			}
		}else{
			System.out.println("目录不存在！");
		}
		
	}
}
