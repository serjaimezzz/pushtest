package day02_Integer;

import java.util.Arrays;

/*
 * ��ϰ:��IP��ַ������ֵ˳������
 * 192.168.1.200	10.10.10.10		4.4.4.4		127.0.0.1
 */
public class RegexDemo1 {
	public static void main(String[] args) {
		String str ="192.168.1.200  10.10.10.10  4.4.4.4  127.0.0.1";
		String regex = "\\d{1,3}";
		str = str.replaceAll("(\\d{1,3})", "00$1");	//��������1��3�����ֵ��ַ���,��ǰ�油����0
		System.out.println(str);
		
		str = str.replaceAll("0*(\\d{3})","$1" );	//���0��ͷ���ַ���,���������λ����
		System.out.println(str);
		
		String[] arr = str.split(" +");		//����1�λ��οո�,�ͽ����и�
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		Arrays.sort(arr);
		
		for (String string : arr) {
			System.out.println(string);	//$1��ʾ��һ��()�ڵ��ַ���
		}
		
	}
}
