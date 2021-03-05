package day07_Stream;

import java.util.Arrays;
/**
 * 乱码处理
 * @author zhangchi
 *
 */
public class EncodingDemo {
	public static void main(String[] args) throws Exception {
		byte[] arr = "你好".getBytes();//GBK
		System.out.println(Arrays.toString(arr));//编码:[-60, -29, -70, -61]
				
		String str = new String(arr,"ISO8859-1");//解码
		System.out.println(str);	//????
		
		byte[] array = str.getBytes("ISO8859-1");//再编码
		String ss = new String(array,"GBK");//再解码
		System.out.println(ss);
		
	}
}
