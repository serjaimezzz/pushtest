package day07_Stream;
import java.io.*;
/**
 * 内存流:
 * ByteArrayInputStream
 * 从字节数组中读取,字节数组在内存中,所以叫内存流
 * 
 * ByteArrayInputStream
 * 把数据写入到字节数组(写入内存)
 * @author zhangchi
 *
 */
public class BAISDemo {
	public static void main(String[] args) throws IOException,ClassNotFoundException{		
		
		
		ByteArrayInputStream bis = new ByteArrayInputStream("baos".getBytes());//从内存中读
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();//写入到数组内部(内存)
		//该类内部定义了一个数组,把数据写到内部的字节数组中,以便临时使用(缓存文件)
		
		byte[] arr = new byte[1024];
		int num = 0;
		while((num = bis.read(arr)) != -1){
			bos.write(arr, 0, num);
		}
		
		byte[] array = bos.toByteArray();
		System.out.println(new String(array));
		bis.close();
		bos.close();
		
	}
}
