package day03_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 从字符串转换为Date
 * Date parse(String str)
 * 将给定的字符串按照SimpleDateFormat指定的日期格式解析为一个Date对象
 * @author zhangchi
 *
 */
public class SimpleDateFormatDemo2 {
	public static void main(String[] args) throws ParseException {
		String str="2008-08-08 08:08:08";
		SimpleDateFormat sdf=new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		Date date=sdf.parse(str);
		System.out.println(date);
		
		//1995-05-30 -->	1995年05月30日
		String birth = "1995-05-30";
		Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(birth);
		String str1 = new SimpleDateFormat("yyyy年MM月dd日").format(date1);
		System.out.println(str1);
	}
}
