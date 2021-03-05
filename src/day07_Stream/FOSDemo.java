package day07_Stream;

import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 节点流
 * @author zhangchi
 *
 */
public class FOSDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * 默认创建的FOS是覆盖写操作
		 * FOS会先将文件数据(若有数据)全部删除，然后再开始写。
		 */
		/**  java.io.FileOutputStream
		 *  文件输出流，是一个低级流，作用是向文件中写出字节
		 */ 
		FileOutputStream fos=new FileOutputStream("FOSDemo.txt");		
		String str="我爱北京天安门";
		/*
		 * String-->byte[]一组字节
		 * byte getBytes()  按当前系统默认的字符集将当前字符串转换为一组字节
		 * byte getBytes(String csn)  按照指定的字符集将当前字符串转换为一组字节
		 */
		byte[] data=str.getBytes("UTF-8");
		fos.write(data);	//每次都会把之前的数据全部删除,从头开始写
		fos.write(353);	//写入的是一个字节
		System.out.println("写出完毕！");
		fos.close();
		
	}
}
