package day02_Integer;
/**
 * 字符串支持正则表达式的方法一:
 * boolean matches(String regex)
 * 根据给定的正则表达式验证当前字符串是否满足格式要求
 * 满足则返回true，否则返回false
 * @author zhangchi
 *
 */
public class RegexDemo {
	public static void main(String[] args) {
		/*
		 * 电子邮箱的正则表达式：
		 * [a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\.[a-zA-Z0-9]+)+
		 */
		String regex="[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z0-9]+)+";
		System.out.println(regex);
		
		/**
		 *  字符串支持正则表达式方法一：
		 *  boolean matches(String regex)
		 *  字符串是否匹配
		 */
		String mail = "zz@qq.com";
		boolean flag = mail.matches(regex); // 字符串是否匹配
		if (flag) {
			System.out.print("是邮箱"); // 两次换行
		} else {
			System.out.println("不是邮箱");
		}
		
/**
 * 字符串支持正则表达式方法二：
 * String[] split(String regex)
 * 将当前字符串按照满足正则表达式的部分进行拆分
 * 返回拆分后的每段内容
 * 
 */
		String str="asd132132sss111";
		//保留英文部分
		String regex1 = "[0-9]+";// 不写加号不同数字之间会拆出空格
		String[] array = str.split(regex1);
		System.out.println("len:" + array.length);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
/**
 * 字符串支持正则表达式方法三：
 * String[] replaceAll(String regex,String str)
 * 将当前字符串中满足正则表达式的部分替换为给定的字符串
 */
		String str1="abc123def456";
		str1=str1.replaceAll("[0-9]+", "#number#");
		System.out.println(str1);
		
		
		String str2 = "aabbc";
		System.out.println(str2);
		
	}
}
