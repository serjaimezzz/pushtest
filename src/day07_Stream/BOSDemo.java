package day07_Stream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲输出流写出数据的缓冲区问题
 * BIS/BOS没有特有功能
 * @author zhangchi
 *
 */
public class BOSDemo {

	public static void main(String[] args) throws IOException {
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("BOSDemo.txt"));
		String str = "";
		for (int i = 0; i < 100000000; i++) {
			str = "a" + i;
		}
		bos.write(str.getBytes("UTF-8"));		
														//FIS/FOS低级流很实在,不用flush。高级流会把写的内容放在缓冲区   
		bos.flush();//强制将缓冲区的字节一次性写出。具有即时性。缓冲区装了多少写多少。频繁调用效率会降低。	
		
		System.out.println("输出完毕！");
		bos.write("\nsssss".getBytes());//按当前系统默认的字符集将当前字符串转换为一组字节
		bos.close();//close()方法调用了flush()
		
	}
}
