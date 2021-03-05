package day03_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 查看当前系统时间和16天5小时23分40秒以后的日期
 * 显示的格式:
 * yyyy-MM-dd HH:mm:ss
 * @author zhangchi
 *
 */
public class Test01 {

	public static void main(String[] args) {
		Date now=new Date();
		System.out.println(now);
		SimpleDateFormat sdf=new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		String str=sdf.format(now);
		System.out.println(str);
		
		long time=now.getTime();//获取now的维护值
		System.out.println("getTime:"+time);
		time+=1000*16*24*60*60;  //+16days
		time+=1000*5*60*60;      //+5hours
		time+=1000*23*60;        //+23minus
		time+=1000*40;           //+40seconds
		now.setTime(time);       //设置long值，time表示的是该long值的时间
		System.out.println(sdf.format(now));
		
		
		
	}
}
