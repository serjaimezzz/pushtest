package day07_Stream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件输出流
 * 追加写操作
 * @author zhangchi
 */
public class FOSDemo2 {

	public static void main(String[] args) throws IOException {
		/*
		 * 在创建FOS时，若指定第二个参数，并且该值为true时，则是追加写操作，
		 * 那么本次通过FOS写出的内容会被追加到该文件末尾
		 */
		FileOutputStream fos=new FileOutputStream("FOSDemo.txt",true);
		
		fos.write("北京天安门".getBytes("UTF-8"));	//直接写入到设备,没有flush也会写入
		System.out.println("写出完毕！");	
		fos.close();
		
	}
	
	
}
