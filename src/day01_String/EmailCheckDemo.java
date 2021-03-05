package day01_String;
import java.util.Scanner;
/**                            0123456789abc
 * 编写一个程序，要求用户输入一个网址信息,如www.baidu.com,http://www.baidu.com,www.baidu.com.cn
 * 然后经过处理，输出域名，如baidu
 * @author zhangchi
 *
 */
public class EmailCheckDemo {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);//获取用户输入
		System.out.println("请输入网址：");
		String str=scan.next();
		//获取第一个小数点的位置
		int start=str.indexOf(".")+1;
		//获取第二个小数点的位置
		int end=str.indexOf(".",start);
		str=str.substring(start, end);
		System.out.println("域名："+str);
	}

}
