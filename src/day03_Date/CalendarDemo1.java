package day03_Date;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar
 * ������
 * ������һ�������࣬��װ�˶�ʱ�����ز���
 * ���õ�ʵ������������(����)��ʹ��������Ϊ�˶�ʱ�������صĲ������������ʱ�䡣 
 * @author zhangchi
 *
 */
public class CalendarDemo1 {

	public static void main(String[] args) {
		/*
		 * ʹ��Calendar�ľ�̬��������ʵ�����÷�������ݵ�ǰϵͳ���ڵ�������һ����Ӧ��ʵ��
		 * ͨ����GregorianCalendarĬ�ϴ���������ʵ����ʾ��ǰϵͳ��ʱ�䡣
		 */
		Calendar calendar= Calendar.getInstance();
		/*
		 * toString����ֱ�۷�ӳ��ʾ������
		 */
		System.out.println("cal:"+calendar);
		
		/**
		 * Calendar��Date֮���ת��
		 * 
		 * Calendar->Date
		 * Date getTime()
		 * Calendar�ṩ�˷���getTime(),�÷�������һ��Date����,
		 * �ö����ʾ��ʱ����ǵ�ǰCalendar��ʾ��ʱ��
		 */
		
		Date date=calendar.getTime();
		System.out.println("date:"+date);
		
		//��ʾ������һʱ��
		date.setTime(date.getTime()+1000*60*60*24);
		System.out.println("date:"+date);
		
		/**
		 * Calendar��Date֮���ת��
		 * 
		 * Date-> Calendar
		 * void setTime(Date date)
		 * Calendar�ṩ�˷���setTime(),����ʹ��ǰ��ʾ��ʱ��Calendar
		 * ��ʾ������Date����ʾ��ʱ��
		 */
		
		calendar.setTime(date);
		System.out.println(calendar);
		
		
		
		
	}
}
