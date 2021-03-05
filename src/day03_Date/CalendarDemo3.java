package day03_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 获取一个Calendar表示的日期中各个时间分量对应的值
 * (搜狗输入法中输入sj显示当前时间的算法)
 * @author zhangchi
 *
 */
public class CalendarDemo3 {

	public static void main(String[] args) throws ParseException {
		Calendar calendar=Calendar.getInstance();
		/**
		 * int get(int field)
		 * 获取对应时间分量的值
		 */
		String str="2008-11-08 08:08:08";
		SimpleDateFormat sdf=new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		Date date=sdf.parse(str);
		calendar.setTime(date);
		
		//各时间分量相互独立
		int year =calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH)+1;		
		int day=calendar.get(Calendar.DATE);
		int hour=calendar.get(Calendar.HOUR_OF_DAY);
		int minute=calendar.get(Calendar.MINUTE);
		int second=calendar.get(Calendar.SECOND);		
		System.out.println(year+"年"+month+"月"+day+"日"+"  "+hour+":"+minute+":"+second);
		
		int dow=calendar.get(Calendar.DAY_OF_WEEK)-1; 
		System.out.println(Calendar.DAY_OF_WEEK);//7
		System.out.println("周"+dow);//老美周日为一周首日
		
		String[] data={"日","一","二","三","四","五","六"};
		System.out.println("星期"+data[dow]);
		
		int doy=calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("今天是今年的第"+doy+"天");
		
	}
}
