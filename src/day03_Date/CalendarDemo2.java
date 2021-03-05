package day03_Date;

import java.util.Calendar;

/**
 * Calendar �ṩ����Բ�ͬʱ�������������ֵ�ķ�����
 * void set(int field,int value)
 * field:ʱ��������� �꣬�£���...  //intֵ��ʹ��Calendar�ṩ�ĳ���
 * value:��Ӧ��ֵ
 * @author zhangchi
 *
 */
public class CalendarDemo2 {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		
		System.out.println("getTime:"+calendar.getTime());
		/**
		 * ����calendar,ʹ���ʾ
		 * 2008-08-08 08:08:08
		 */
		
		//�趨��
		calendar.set(Calendar.YEAR, 2008);
		System.out.println(calendar.getTime());
		
		//�趨�£��·ݴ�0��ʼ����  0=1��
		calendar.set(Calendar.MONTH,Calendar.AUGUST);
		System.out.println(calendar.getTime());
		
		
		/* �趨��:
		 * DATE:���е���
		 * DAY_OF_MONTH:���е��죬��DATEһ��
		 * DAY_OF_WEEK:���еĵ�n��,���ڼ�
		 * DAY_OF_YEAR:���еĵ�n��
		 */
		calendar.set(Calendar.DATE, 8);
		System.out.println(calendar.getTime());
		
		//�趨ʱ
		calendar.set(Calendar.HOUR_OF_DAY, 8);
		//�趨��
		calendar.set(Calendar.MINUTE, 8);
		//�趨��
		calendar.set(Calendar.SECOND, 8);
		System.out.println(calendar.getTime());
		
	}
}
