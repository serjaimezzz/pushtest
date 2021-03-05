package day03_Date;

import java.util.Date;

/**
 * java.util.Date
 * Date的每一个实例用于表示一个确切的时间点，内部维护了一个long型的值，记录：
 * 从1970.1.1 00:00:00到表示的时间点直接所经历的毫秒值。
 * 正数是1970年以后的日期，负数是1970年以前的日期。
 * 由于Date设计上存在缺陷(时区,千年虫)，所以它的大部分方法被设置为"过时的"，不再建议使用
 * @author zhangchi
 *
 */
public class DateDemo {

	public static void main(String[] args) {
		/**
		 * 使用默认构造方法创建的Date表示当前的系统时间
		 */
		Date now=new Date();
		/**
		 * Date重写了toString，返回的字符串显示的就是当前Date表示的时间。
		 */
		System.out.println(now);
		//Date的大部分方法不建议使用了。
		now.getDate();
		
		//获取Date内部维护的long值:
		long time=now.getTime();
		System.out.println("getTime:"+time);
		System.out.println(System.currentTimeMillis());
		
		 //明天这一刻的毫秒值
		time+=1000*60*60*24;
		/**
		 * void setTime(long)
		 * 设置一个long值，使Date表示该long值所表示的时间。
		 */
		now.setTime(time);
		System.out.println(now);
		
		
		
	}

}
