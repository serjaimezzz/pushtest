package day03_Date;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * ����һ�����������ڸ�ʽ��String��Date�໥ת��
 * @author zhangchi
 *
 */
public class SimepleDateFormatDemo1 {

	public static void main(String[] args) {
		//��ǰϵͳʱ��
		Date now=new Date();
		System.out.println(now);
		
		SimpleDateFormat sdf=new SimpleDateFormat(
				"yyyy-MM-dd E HH:mm:ss");
		/**
		 * Date->String
		 * String format(Date date)\
		 * format�������Խ�������date��������ʾ��ʱ�䰴��SimpleDateFormat
		 * ָ�������ڸ�ʽת��Ϊ�ַ���
		 */
		
		String str=sdf.format(now);
		System.out.println(str);
		
	}

}
