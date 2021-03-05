package day02_Integer;

import java.util.Arrays;

/*
 * 练习:对IP地址按照数值顺序排序
 * 192.168.1.200	10.10.10.10		4.4.4.4		127.0.0.1
 */
public class RegexDemo1 {
	public static void main(String[] args) {
		String str ="192.168.1.200  10.10.10.10  4.4.4.4  127.0.0.1";
		String regex = "\\d{1,3}";
		str = str.replaceAll("(\\d{1,3})", "00$1");	//符合连续1到3个数字的字符串,在前面补两个0
		System.out.println(str);
		
		str = str.replaceAll("0*(\\d{3})","$1" );	//多个0开头的字符串,保留最后三位数字
		System.out.println(str);
		
		String[] arr = str.split(" +");		//出现1次或多次空格,就进行切割
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		Arrays.sort(arr);
		
		for (String string : arr) {
			System.out.println(string);	//$1表示第一组()内的字符串
		}
		
	}
}
