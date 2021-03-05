package day03_Date;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar
 * 日历类
 * 该类是一个抽象类，封装了对时间的相关操作
 * 常用的实现类格里高里历(阳历)，使用日历是为了对时间进行相关的操作。比如计算时间。 
 * @author zhangchi
 *
 */
public class CalendarDemo1 {

	public static void main(String[] args) {
		/*
		 * 使用Calendar的静态方法创建实例，该方法会根据当前系统是在地区创建一个相应的实现
		 * 通常是GregorianCalendar默认创建的日历实例表示当前系统的时间。
		 */
		Calendar calendar= Calendar.getInstance();
		/*
		 * toString不能直观反映表示的日期
		 */
		System.out.println("cal:"+calendar);
		
		/**
		 * Calendar与Date之间的转换
		 * 
		 * Calendar->Date
		 * Date getTime()
		 * Calendar提供了方法getTime(),该方法返回一个Date对象,
		 * 该对象表示的时间就是当前Calendar表示的时间
		 */
		
		Date date=calendar.getTime();
		System.out.println("date:"+date);
		
		//表示明天这一时刻
		date.setTime(date.getTime()+1000*60*60*24);
		System.out.println("date:"+date);
		
		/**
		 * Calendar与Date之间的转换
		 * 
		 * Date-> Calendar
		 * void setTime(Date date)
		 * Calendar提供了方法setTime(),可以使当前表示的时间Calendar
		 * 表示给定的Date所表示的时间
		 */
		
		calendar.setTime(date);
		System.out.println(calendar);
		
		
		
		
	}
}
