package day01_String;
/**
 * from jdk1.5 一个可变的字符序列，但不保证同步(线程不安全)
 * 
 * StringBuilder提供了用于修改字符串内容的相关方法
 * 其内部维护的是一个可变的字符数组，所以修改都是在当前对象内部完成的
 * 当频繁修改字符串内容时应当使用当前类来完成
 * @author zhangchi
 *
 */
public class StringBuildDemo {

	public static void main(String[] args) {
		String str="学习Java";
		/*
		 * 将String转换为StringBuilder
		 * 可以使用有参的构造方法
		 * StringBuilder也有无参构造方法，默认表示空字符串
		 */
		
		StringBuilder builder=new StringBuilder(str);
		/*
		 * 从StringBuilder 转换为 String
		 * 使用.toString方法即可
		 */
		str=builder.toString();
		/**
		 * StringBuilder append(String str)
		 * 向当前字符串末尾追加指定内容
		 * 重载方法允许追加其他内容（先转换为字符串再追加）
		 */
		//0 1234567
		//学习Java，为了找工作
		builder.append("，为了找工作");
		System.out.println(builder.toString());
		
		builder.replace(7, 12,"就是为了改变世界"); //替换，含头不含尾
		System.out.println(builder.toString());
		
		builder.delete(0,7);                     //删除
		System.out.println(builder.toString());
		
		builder.insert(0, "活着，");               //插入
		System.out.println(builder.toString());
		
		StringBuilder builder1=new StringBuilder("a");//a 
		for(int i=0;i<10;i++){
			builder1.append("c").append("b");
		}
		System.out.println(builder1);
	}

}
