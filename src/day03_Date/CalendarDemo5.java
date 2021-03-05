package day03_Date;

import java.util.Calendar;

/**
 * Calendar�м���ʱ��ķ���
 * void add(int field,int value)
 * ��ָ����ʱ��������ϸ�����ֵ����������ֵ�Ǹ��������Ǽ�ȥ������ֵ
 * @author zhangchi
 *
 */
public class CalendarDemo5 {

	public static void main(String[] args) {
		// �鿴3����������8���ٲ�5Сʱ�Ժ������
		 Calendar calendar=Calendar.getInstance();
		 
		 calendar.add(Calendar.YEAR, 3);
		 calendar.add(Calendar.MONTH, 2);
		 calendar.add(Calendar.DAY_OF_YEAR, 8);//�п��ܿ���
		 calendar.add(Calendar.HOUR, -5);//ָ��ʱ��ǰ5Сʱ
		 System.out.println(calendar.getTime());
		 
		 /**
		  * ���������ƿ�������:
		  * Ҫ���û�����һ�����ڣ�Ȼ��Ը����ڽ���һϵ�е����㣬�ٽ�������������ʾ���û�
		  * ����:
		  * 1.��ȡ�û�����������ַ���
		  * 2.ʹ��SimpleDateFormat����ת��ΪDate
		  * 3.����һ��calendar��ʹ���ʾdate������
		  * 4.ʹ��Calendar�����������ʱ��
		  * 5.��calendarת��Ϊһ��date
		  * 6.ʹ��SimpleDateFormatת��Ϊ�ַ�������ʾ���û�
		  */
		 
		 
	}
}
