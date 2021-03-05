package day02_Integer;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*6.设计一个方法，将如下字符串中的所有手机号码和固话号码提取出来，存入一个数组返回。（正则） 

     17788889999-010-9988776-19822883322-0398-8976564-16722882288-0922-78906543-15490876845-010-99821123
		
		17788889999
		19822883322
		15490876845
     1.手机号码的校验: 首位是1，第二位是 3579，后面都是数字
     2.固化校验: 区号-号码，其中区号3或4位，号码7位，且首位不能是0
     */
public class Test04 {
	public static void main(String[] args) {
		String str ="17788889999-010-9988776-19822883322-0398-8976564-16722882288-0922-78906543-15490876845-010-99821123";
		String[] arr = acquire(str);
		
		
	}
	public static String[] acquire(String str){
		String[] arr = new String[0];
		StringBuffer sb = new StringBuffer();
		String regex1 = "1[3579]\\d{9}|0[1-9]\\d\\d?-[1-9]\\d{6}";				//先找到符合获取内容的正则表达式
		
	
		//把正则表达式转成Pattern类型的对象，该对象不具备获取的功能
		Pattern p1 = Pattern.compile(regex1);			// return new Pattern(regex, 0);
		
		Matcher m1 = p1.matcher(str);	//通过Pattern对象调用方法得到Matcher对象，具有获取功能
		//创建匹配器，它将根据此Pattern匹配给定的输入。

//		boolean b = m.find();		//使用Matcher对象获取内容，找到返回true
		
			
		while(m1.find()){
			sb.append(m1.group());	
		}
//			System.out.println(m1.group());
		
		    
	
		return arr;
	}
}
