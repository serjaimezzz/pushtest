package day02_Integer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 从字符串中获取符合正则表达式的字符串
 * @author zhangchi
 *
 */
public class RegexDemo2 {
	public static void main(String[] args) {
		acquire();
	}
	public static void acquire(){	//获取
		String str ="zhu yi le, ming tian fang jia ";
		String regex = "[a-z]{4}";
		//把正则表达式转成Pattern类型的对象，该对象不具备获取的功能
		Pattern p = Pattern.compile(regex);	
					
		Matcher m = p.matcher(str);	//通过Pattern对象调用方法得到Matcher对象，具有获取功能
//		boolean b = m.find();		//使用Matcher对象获取内容，找到返回true
//		if(b)
//			System.out.println(m.group());	
		while(m.find())
			System.out.println(m.group());	//返回的是符合正则表达式规律的字符串,每找到一次就输出一次
	}
}
