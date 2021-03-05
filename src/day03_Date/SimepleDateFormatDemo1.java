package day03_Date;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * 根据一个给定的日期格式将String与Date相互转换
 * @author zhangchi
 *
 */
public class SimepleDateFormatDemo1 {

	public static void main(String[] args) {
		//当前系统时间
		Date now=new Date();
		System.out.println(now);
		
		SimpleDateFormat sdf=new SimpleDateFormat(
				"yyyy-MM-dd E HH:mm:ss");
		/**
		 * Date->String
		 * String format(Date date)\
		 * format方法可以将给定的date对象所表示的时间按照SimpleDateFormat
		 * 指定的日期格式转换为字符串
		 */
		
		String str=sdf.format(now);
		System.out.println(str);
		
	}

}
