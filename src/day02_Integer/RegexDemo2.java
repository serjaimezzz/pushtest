package day02_Integer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * ���ַ����л�ȡ����������ʽ���ַ���
 * @author zhangchi
 *
 */
public class RegexDemo2 {
	public static void main(String[] args) {
		acquire();
	}
	public static void acquire(){	//��ȡ
		String str ="zhu yi le, ming tian fang jia ";
		String regex = "[a-z]{4}";
		//��������ʽת��Pattern���͵Ķ��󣬸ö��󲻾߱���ȡ�Ĺ���
		Pattern p = Pattern.compile(regex);	
					
		Matcher m = p.matcher(str);	//ͨ��Pattern������÷����õ�Matcher���󣬾��л�ȡ����
//		boolean b = m.find();		//ʹ��Matcher�����ȡ���ݣ��ҵ�����true
//		if(b)
//			System.out.println(m.group());	
		while(m.find())
			System.out.println(m.group());	//���ص��Ƿ���������ʽ���ɵ��ַ���,ÿ�ҵ�һ�ξ����һ��
	}
}
