package day01_String;
import java.util.Arrays;

/**
 * 字符串是不变对象，字符串内容一旦创建，不可改变，
 * 若想改变某个字符串内容一定会创建新对象
 * @author zhangchi
 *
 */
public class StringDemo {
	public static void main(String[] args) throws Exception{
		String s1="123abc";
		s1=s1+"!";         //已经创建了新的对象
		String s2="123abc";//引用变量储存的是地址
		String s3=new String("123abc");//new新建对象
		String s4="123"+"abc";//
		System.out.println("s1:"+s1);
		System.out.println("s1==s2:"+s1==s2);
		System.out.println("s1==s3:"+s1==s3);
		System.out.println(s1.equals(s3));//字符串的比较
		System.out.println(s4==s2);
		
		/**
		 * 编译器的一个优化措施：
		 * 当一个计算表达式计算符两边都是字面量时，会直接计算结果，
		 * 然后将结果编译到.class文件中
		 */
		String str1="123";  //双引号里的字符串不能被修改
		str1 = "111";		//str1的地址可以更改,从而指向不同的字符串
		String str2="abc";
		String s5=str1+str2;//先编译再比较
		System.out.println("s5的字符串长度:"+s5.length());
		System.out.println("str1:"+str1);
		
		System.out.println(s5==s2);
		
		String str="sss";
		System.out.println(str.length());
		
		/**
		 *  int indexOf(String str)
		 *  该方法是用来查找 给定字符串 在当前字符串中的位置。
		 *  该方法有几个重载方法.
		 */
		String str3="thinking in java";
		int index=str3.indexOf("in");
		System.out.println("index:"+index);
		//查找in在str3字符串中的位置，若没有则返回-1。
		 	
		/**
		 * 重载方法允许从指定位置处开始查找 
		 * in在str3字符串中的的位置，指定位置之前出现的in忽略
		 */  
		index=str3.indexOf("in", 3); //从起始位置3开始找
		System.out.println("index3:"+index);	//
		
		index=str3.lastIndexOf("in");//查找in在字符串中最后出现的位置
		System.out.println("index:"+index);
		
		
		/**
		 * String substring(int start,int end)
		 * 截取字符串，从指定位置(start)开始截取到指定的位置(end)
		 * java API有一个特点，通常用两个数字表示范围时，都是含头不含尾的
		 */
		
		//           0123456789abcdef    --下标号,非二进制   
		String str4="thinking in java";
		String sub=str4.substring(5, 8);//含头不含尾
		System.out.println("sub:"+sub);
		sub=str4.substring(9);          //截取到字符串末尾
		System.out.println("sub:"+sub);
		
		/**
		 * String trim()
		 * 去除字符串两边的空白字符
		 */
		String str5="  hello  ";
		System.out.println("str5:"+str5);
		str5=str5.trim();
		System.out.println("trim:"+str5);
		
		
		/**
		 * char charAt(int index)
		 * 获取当前字符串指定下标对应的字符
		 */
		
        //           0123456
		String str6="thinking in java";
		//查看第5个字符是什么？
		char c=str6.charAt(4);
		System.out.println("charAt:"+c);
		
		/**
		 * 检查一个字符串是否为回文
		 */ 
		
		
		String info="上海自来水来自海上";
		char[] chs=info.toCharArray();//字符串转换为数组
		
		for (int i = 0; i < info.length() / 2; i++) {
			if (info.charAt(i) == info.charAt(info.length() - i - 1)) {
				System.out.println(chs[i] + "是回文");

			}
		}
		
		/**
		 * boolean startsWith(String str)
		 * boolean endsWith(String str)
		 * 判断当前字符串是否是以指定的字符串开头或结尾
		 */
		
		String str7="thinking in java";
		boolean starts=str7.startsWith("thi");
		System.out.println(starts);
		boolean ends=str7.endsWith("a");
		System.out.println(ends);
		
		/**
		 * String toUpperCase()
		 * String toLowerCase()
		 * 将当前字符串的英文转换为全大写或全小写
		 */
		String str8 = "thinking in java";
		String str9 = str8.toUpperCase(); // 往上转大写
		System.out.println("str9:" + str9);
		
		String str10 = str9.toLowerCase();// 转小写
		System.out.println(str10);
		
		/**
		 * String提供了若干重载的静态方法
		 * static String valueOf(XXX xxx)
		 * 该方法的作用是将Java中其他基本数据类型转换为字符串。
		 */
		
		int a=1;
		String strA=String.valueOf(a);
		System.out.println(a+1);	//2
		System.out.println(strA+1);	//11
	
		/**
		 *	boolean equals(Object o)
		 *		str.matches(regex); 
		 */
		
		/*
		 * boolean equalsIgnoreCase(String anotherString)
		 * 忽略大小写判断两个字符串的内容是否相同
		 */
		String strB = "HElloWORLd";
		String strC = "helloWorld";
		System.out.println("忽略大小写:"+strB.equalsIgnoreCase(strC));
		
		
		/**
		 * boolean isEmpty()
		 * 判断字符串是否为空
		 * 用null调用会发生空指针异常,地址是null
		 */
		
		/**
		 * 字符数组转换成字符串输出
		 */
		char[] arr = {'a','b','c','d','e'};
		String str11 = new String(arr);
		System.out.println("str11:"+str11);
		String str12 = new String(arr,2,3);//从下标2开始数3个
		System.out.println("str12:"+str12);
		
		/**
		 * 把字符串转为字符数组
		 * char[] toCharArray()
		 */
		String str13 = "hello";
		char[] arr1 = str13.toCharArray();
		for (char d : arr1) {
			System.out.println(d);
		}

		//编码
		byte[] b2 = "ABCDEF".getBytes(); //编码:把ABCDEF变成ASC II码
		byte[] b3 = "你好".getBytes("UTF-8");
		System.out.println(Arrays.toString(b2));
		System.out.println(Arrays.toString(b3));
		
		//将字节数组转成字符串
		byte[] b4 = {65,66,67,68,69,70};
		//利用构造方法解码
		String str14 = new String(b4);//使用平台默认的字符集解码GBK
		System.out.println(str14);//ABCDEF
		
		String str15 = new String(b3);//解码使用的GBK字符集和编码时的UTF-8不一样时，会出现乱码
		String str16 = new String(b3,"UTF-8");
		System.out.println(str15);
		System.out.println(str16);
		
		String str17 = "Hello World";
		String str18 = str17.replace('e', 'a');//把字符e都替换成'a',返回一个新的字符串
		System.out.println("str17:"+str17);
		System.out.println("str18:"+str18);
		
		/*
		 *	按出现顺序比较两个字符串
		 */
		int num = "aab".compareTo("aaa");//前边的大于后边的返回大于0的数 return b-a;//b-a>0
		if(num > 0)//对应的字符一一比较,先比第一个字符,相等则继续,跟长短无关
			System.out.println("aab偏大");
		else
			System.out.println("aaa偏大");
		
		/*
		 * 拼接和切割
		 * String concat(String str)/split(String str)
		 */
		String str19 = "Hello".concat("World");
		System.out.println(str19);
		String str20 = "a,b,c,d";
		String[] str21 = str20.split(",");
		for (String string : str21) {
			System.out.println(string.toUpperCase());
		}
		
		
		/*
		 * 可变参数累加
		 */
		int sum = add(1,2,3,5,7);//可变参数 必须是参数列表中的最后一个:7
		System.out.println("sum:"+sum);
		
		/* 
		 * String.join(delimiter, elements);
		 * 第一个参数接收一个字符串 (这个字符串作为连接符)
		 */
		String str22 = String.join(".", "h","e","l","l","o");
		System.out.println("str22:"+str22);
		/*
		 * String format(String format,Object...args)
		 * 常见占位符:????
		 * %s:替代字符串		%ns--凑够n位字符串,如果不够,在字符前补空格
		 * %d:整型数字占位符		%nd--凑够n位,如果不够在字符前补空格
		 * %f:浮点型数字占位符,	%.nf-保留小数点后面指定位的数字
		 * %c:字符型占位符
		 */
		String str23 = String.format("%10s%5d%.2f%3c", "hello",66,66.345,'k');
		System.out.println("str23"+str23);
		
	}
	
		/*
		 * 求n个整数的和
		 */
		public static int add(int...a){	//可变参数---必须是参数列表中的最后一个
			int sum = 0;
			for (int i = 0; i < a.length; i++) {
				sum += a[i];
			}
			return sum;
		}
}
