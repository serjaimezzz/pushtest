package day02_Integer;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*6.���һ���������������ַ����е������ֻ�����͹̻�������ȡ����������һ�����鷵�ء������� 

     17788889999-010-9988776-19822883322-0398-8976564-16722882288-0922-78906543-15490876845-010-99821123
		
		17788889999
		19822883322
		15490876845
     1.�ֻ������У��: ��λ��1���ڶ�λ�� 3579�����涼������
     2.�̻�У��: ����-���룬��������3��4λ������7λ������λ������0
     */
public class Test04 {
	public static void main(String[] args) {
		String str ="17788889999-010-9988776-19822883322-0398-8976564-16722882288-0922-78906543-15490876845-010-99821123";
		String[] arr = acquire(str);
		
		
	}
	public static String[] acquire(String str){
		String[] arr = new String[0];
		StringBuffer sb = new StringBuffer();
		String regex1 = "1[3579]\\d{9}|0[1-9]\\d\\d?-[1-9]\\d{6}";				//���ҵ����ϻ�ȡ���ݵ�������ʽ
		
	
		//��������ʽת��Pattern���͵Ķ��󣬸ö��󲻾߱���ȡ�Ĺ���
		Pattern p1 = Pattern.compile(regex1);			// return new Pattern(regex, 0);
		
		Matcher m1 = p1.matcher(str);	//ͨ��Pattern������÷����õ�Matcher���󣬾��л�ȡ����
		//����ƥ�������������ݴ�Patternƥ����������롣

//		boolean b = m.find();		//ʹ��Matcher�����ȡ���ݣ��ҵ�����true
		
			
		while(m1.find()){
			sb.append(m1.group());	
		}
//			System.out.println(m1.group());
		
		    
	
		return arr;
	}
}
