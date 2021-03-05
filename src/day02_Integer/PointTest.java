package day02_Integer;
/**
 * 测试Point重写Object相关方法
 * @author zhangchi
 *
 */
public class PointTest {

	public static void main(String[] args) {
		Point p1=new Point(1,2);
		//String str=p1.toString();
		//System.out.println(str);
		/*
		 * System.out.println(Object obj)
		 * 输出的是给定对象toString返回的字符串
		 */
		System.out.println(p1);
		//输出的是类名@对象的地址
		
		Point p2=new Point(1,2);//新建Point对象
		System.out.println(p1==p2);//比较的是堆中的地址
		System.out.println(p1.equals(p2));//比较的是对象的内容
	}

}
//用来判断两个对象的内容是否相同