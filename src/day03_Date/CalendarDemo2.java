package day03_Date;

import java.util.Calendar;

/**
 * Calendar 提供了针对不同时间分量单独设置值的方法。
 * void set(int field,int value)
 * field:时间分量，如 年，月，日...  //int值，使用Calendar提供的常量
 * value:对应的值
 * @author zhangchi
 *
 */
public class CalendarDemo2 {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		
		System.out.println("getTime:"+calendar.getTime());
		/**
		 * 设置calendar,使其表示
		 * 2008-08-08 08:08:08
		 */
		
		//设定年
		calendar.set(Calendar.YEAR, 2008);
		System.out.println(calendar.getTime());
		
		//设定月，月份从0开始计数  0=1月
		calendar.set(Calendar.MONTH,Calendar.AUGUST);
		System.out.println(calendar.getTime());
		
		
		/* 设定日:
		 * DATE:月中的天
		 * DAY_OF_MONTH:月中的天，和DATE一致
		 * DAY_OF_WEEK:周中的第n天,星期几
		 * DAY_OF_YEAR:年中的第n天
		 */
		calendar.set(Calendar.DATE, 8);
		System.out.println(calendar.getTime());
		
		//设定时
		calendar.set(Calendar.HOUR_OF_DAY, 8);
		//设定分
		calendar.set(Calendar.MINUTE, 8);
		//设定秒
		calendar.set(Calendar.SECOND, 8);
		System.out.println(calendar.getTime());
		
	}
}
