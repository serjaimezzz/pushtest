package day08_Exception;
import java.util.Scanner;
public class WTest {
	public static void main(String args[]){
		System.out.println("字符串索引越界异常");
		String str=args[0];
		System.out.println("第四个字符为"+str.charAt(3));
		int aa=Integer.parseInt(args[0]);
		System.out.println("平方为"+aa*aa);}
}
//public class StringIndexOutOf{
//
//}