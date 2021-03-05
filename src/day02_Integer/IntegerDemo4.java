package day02_Integer;
/**
 * 包装类提供了一个静态方法		static parseXXX(String str)
 * 可以将给定的字符串转换为对应的基本类型
 * 前提是该字符串必须正确的描述基本类型可以保存的值 
 * @author zhangchi
 *
 */
public class IntegerDemo4 {

	public static void main(String[] args) {
		String str="123";
		int i=Integer.parseInt(str);
		System.out.println(i+1);
		
		String str1="123.123";
		double d=Double.parseDouble(str1);
		System.out.println(d+0.01);  //double发生舍入误差
		
		
		
		
	}

}
