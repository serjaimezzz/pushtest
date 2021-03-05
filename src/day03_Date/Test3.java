package day03_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test3 {
	public static void main(String[] args) throws ParseException {
		Calendar calendar=Calendar.getInstance();
		String str = "1995-05-30";
		SimpleDateFormat sdf=new SimpleDateFormat(
				"yyyy-MM-dd");
		Date date=sdf.parse(str);
		calendar.setTime(date);
		
		//各时间分量相互独立
		int year =calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH)+1;		
		int day=calendar.get(Calendar.DATE);
//		int hour=calendar.get(Calendar.HOUR_OF_DAY);
//		int minute=calendar.get(Calendar.MINUTE);
//		int second=calendar.get(Calendar.SECOND);		
		System.out.println(year+"年"+month+"月"+day+"日");
	}
}
