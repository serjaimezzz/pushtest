package day02_Integer;
import java.util.Scanner;
/**
 * ��֤�ֻ��ŵ�������ʽ
 * @author zhangchi
 *
 */
public class Test01 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("�������ֻ���:");
		String line=scan.next();
		//
		String regex="1[0-9]{10}";
		if(line.matches(regex)){
			System.out.println("���ֻ���");
		}else{
			System.out.println("�����ֻ���");
		}
		
	}

}
