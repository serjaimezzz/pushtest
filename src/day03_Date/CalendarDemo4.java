
package day03_Date;

import java.util.Calendar;

/**
 * 获取某一个时间分量的最大值
 * @author zhangchi
 *
 */
public class CalendarDemo4 {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		
		//当月总共多少天
		int days=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(days);
		
		//查看2016年2月的天数
		calendar.set(Calendar.YEAR, 2019);
		calendar.set(Calendar.MONTH, 1);
		days=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(days);
		
		days=calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(days);
	}
}
