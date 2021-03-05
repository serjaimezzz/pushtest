package day03_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ��ȡһ��Calendar��ʾ�������и���ʱ�������Ӧ��ֵ
 * (�ѹ����뷨������sj��ʾ��ǰʱ����㷨)
 * @author zhangchi
 *
 */
public class CalendarDemo3 {

	public static void main(String[] args) throws ParseException {
		Calendar calendar=Calendar.getInstance();
		/**
		 * int get(int field)
		 * ��ȡ��Ӧʱ�������ֵ
		 */
		String str="2008-11-08 08:08:08";
		SimpleDateFormat sdf=new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		Date date=sdf.parse(str);
		calendar.setTime(date);
		
		//��ʱ������໥����
		int year =calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH)+1;		
		int day=calendar.get(Calendar.DATE);
		int hour=calendar.get(Calendar.HOUR_OF_DAY);
		int minute=calendar.get(Calendar.MINUTE);
		int second=calendar.get(Calendar.SECOND);		
		System.out.println(year+"��"+month+"��"+day+"��"+"  "+hour+":"+minute+":"+second);
		
		int dow=calendar.get(Calendar.DAY_OF_WEEK)-1; 
		System.out.println(Calendar.DAY_OF_WEEK);//7
		System.out.println("��"+dow);//��������Ϊһ������
		
		String[] data={"��","һ","��","��","��","��","��"};
		System.out.println("����"+data[dow]);
		
		int doy=calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("�����ǽ���ĵ�"+doy+"��");
		
	}
}
