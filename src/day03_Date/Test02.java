package day03_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入自己的生日yyyy-MM-dd，经过计算，到今天一共活了多少天
 * 以及距离10000天还有多少天
 * 生存10000天的纪念日是:yyyy-MM-dd
 * @author zhangchi
 *
 */
public class Test02 {
	public static void main(String[] args) throws ParseException {
		System.out.println("输入您的生日(格式为yyyy-MM-dd):");
		Scanner scan=new Scanner(System.in);
		String birStr=scan.next();            //获取出生日期
		SimpleDateFormat sdf=new SimpleDateFormat(
				"yyyy-MM-dd");
		Date birth=sdf.parse(birStr);        //出生日期转为字符串
		System.out.println(birth);    
		
		//计算活了多少天
		Date now=new Date();                    
		long time=now.getTime()-birth.getTime();
		System.out.println(time);               //存活毫秒数
		time=time/1000/60/60/24;		
		System.out.println("已存活天数:"+time);
		//time=10000-time;
		long ttdays=10000-time;           //距离一万天还有多少天
		System.out.println("您距离一万天纪念日还有"+ttdays+"天！");
		
		//10000天纪念日
		ttdays=1000*ttdays*24*60*60;             //剩余天数
		now.setTime(now.getTime()+ttdays);
		System.out.println(sdf.format(now));   //按照指定格式转换成字符串
		
		
		
		
	}
}
