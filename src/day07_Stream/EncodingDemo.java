package day07_Stream;

import java.util.Arrays;
/**
 * ���봦��
 * @author zhangchi
 *
 */
public class EncodingDemo {
	public static void main(String[] args) throws Exception {
		byte[] arr = "���".getBytes();//GBK
		System.out.println(Arrays.toString(arr));//����:[-60, -29, -70, -61]
				
		String str = new String(arr,"ISO8859-1");//����
		System.out.println(str);	//????
		
		byte[] array = str.getBytes("ISO8859-1");//�ٱ���
		String ss = new String(array,"GBK");//�ٽ���
		System.out.println(ss);
		
	}
}
