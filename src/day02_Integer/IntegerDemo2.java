package day02_Integer;
/**
 * 数字类型的包装类继承自java.lang.Number
 * 其提供了如：intValue,doubleValue这样的方法，
 * 作用是可以将当前包装类表示的数字以其他数字类型的形式返回。
 * @author zhangchi
 *
 */
public class IntegerDemo2 {

	public static void main(String[] args) {
		/**
		 * 将基本类型转换为包装类有两种方式:
		 * 1.调用构造方法
		 * 2.调用静态方法valueOf(推荐)
		 */
		
		/*
		Integer i1=new Integer(12);
		Integer i2=new Integer(12);
		*/
		Integer i1 = Integer.valueOf(128);// 只缓存了一个字节以内的整数，-128到127
		Integer i2 = Integer.valueOf(128);
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));

		int i = i1.intValue();
		System.out.println(i);

		double d = i1.doubleValue();
		System.out.println(d);

		byte b = i1.byteValue();
		System.out.println(b);
		/* byte最大值+1=byte最小值
		 * 0111 1111
		 * 1000 0000 第一位永远是符号位
		 * 1111 1111+1 负数的最大值+1发生进位溢出
		 *10000 0000   
		 */
		
	}

}
