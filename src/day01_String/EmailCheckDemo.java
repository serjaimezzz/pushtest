package day01_String;
import java.util.Scanner;
/**                            0123456789abc
 * ��дһ������Ҫ���û�����һ����ַ��Ϣ,��www.baidu.com,http://www.baidu.com,www.baidu.com.cn
 * Ȼ�󾭹����������������baidu
 * @author zhangchi
 *
 */
public class EmailCheckDemo {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);//��ȡ�û�����
		System.out.println("��������ַ��");
		String str=scan.next();
		//��ȡ��һ��С�����λ��
		int start=str.indexOf(".")+1;
		//��ȡ�ڶ���С�����λ��
		int end=str.indexOf(".",start);
		str=str.substring(start, end);
		System.out.println("������"+str);
	}

}
