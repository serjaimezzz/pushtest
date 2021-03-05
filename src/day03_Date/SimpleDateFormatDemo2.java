package day03_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ���ַ���ת��ΪDate
 * Date parse(String str)
 * ���������ַ�������SimpleDateFormatָ�������ڸ�ʽ����Ϊһ��Date����
 * @author zhangchi
 *
 */
public class SimpleDateFormatDemo2 {
	public static void main(String[] args) throws ParseException {
		String str="2008-08-08 08:08:08";
		SimpleDateFormat sdf=new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		Date date=sdf.parse(str);
		System.out.println(date);
		
		//1995-05-30 -->	1995��05��30��
		String birth = "1995-05-30";
		Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(birth);
		String str1 = new SimpleDateFormat("yyyy��MM��dd��").format(date1);
		System.out.println(str1);
	}
}
