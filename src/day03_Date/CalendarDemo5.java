package day03_Date;

import java.util.Calendar;

/**
 * Calendar中计算时间的方法
 * void add(int field,int value)
 * 对指定的时间分量加上给定的值，若给定的值是负数，则是减去给定的值
 * @author zhangchi
 *
 */
public class CalendarDemo5 {

	public static void main(String[] args) {
		// 查看3年两个月零8天再差5小时以后的日期
		 Calendar calendar=Calendar.getInstance();
		 
		 calendar.add(Calendar.YEAR, 3);
		 calendar.add(Calendar.MONTH, 2);
		 calendar.add(Calendar.DAY_OF_YEAR, 8);//有可能跨年
		 calendar.add(Calendar.HOUR, -5);//指定时间前5小时
		 System.out.println(calendar.getTime());
		 
		 /**
		  * 当遇到类似开发需求:
		  * 要求用户输入一个日期，然后对该日期进行一系列的运算，再将计算后的日期显示给用户
		  * 流程:
		  * 1.获取用户输入的日期字符串
		  * 2.使用SimpleDateFormat将其转换为Date
		  * 3.创建一个calendar，使其表示date的日期
		  * 4.使用Calendar根据需求计算时间
		  * 5.将calendar转换为一个date
		  * 6.使用SimpleDateFormat转换为字符串后显示给用户
		  */
		 
		 
	}
}
