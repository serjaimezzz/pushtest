
package day03_Date;

import java.util.Calendar;

/**
 * ��ȡĳһ��ʱ����������ֵ
 * @author zhangchi
 *
 */
public class CalendarDemo4 {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		
		//�����ܹ�������
		int days=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(days);
		
		//�鿴2016��2�µ�����
		calendar.set(Calendar.YEAR, 2019);
		calendar.set(Calendar.MONTH, 1);
		days=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(days);
		
		days=calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(days);
	}
}
