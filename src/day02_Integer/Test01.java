package day02_Integer;
import java.util.Scanner;
/**
 * 验证手机号的正则表达式
 * @author zhangchi
 *
 */
public class Test01 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入手机号:");
		String line=scan.next();
		//
		String regex="1[0-9]{10}";
		if(line.matches(regex)){
			System.out.println("是手机号");
		}else{
			System.out.println("不是手机号");
		}
		
	}

}
