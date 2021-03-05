package day03_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 计算促销日期
 * 输入一个生产日期,一个保质期的天数,促销日为该商品过期日前两周的周三
 * @author zhangchi
 *
 */
public class Test {

	public static void main(String[] args) throws ParseException {
		Scanner scan =new Scanner(System.in);
		System.out.println("请输入生产日期:(yyyy-MM-dd)");
		String dateStr=scan.next();
		System.out.println("请输入保质期的天数:");
		int days = Integer.parseInt(scan.next());     
		
		//String->Date
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=sdf.parse(dateStr);//按SDF格式解析date对象
		System.out.println(date);
		
		//Date->Calendar
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(date);//生产日期
		
		//计算过期日
		calendar.add(Calendar.DAY_OF_YEAR, days);
		//计算过期日的两周前
		calendar.add(Calendar.DAY_OF_YEAR, -14);
		//设置为当周的周三
		calendar.add(Calendar.DAY_OF_WEEK, 4);
		
		//calendar->Date
		date=calendar.getTime();
		
		//Date->String
		dateStr=sdf.format(date);
		System.out.println("促销日为:"+dateStr);
		
	
		
		
	}
}
