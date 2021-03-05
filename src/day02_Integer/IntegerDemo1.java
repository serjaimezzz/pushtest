package day02_Integer;
/**
 * 包装类
 * Java对于8个基本类型分别定义了对应的包装类。
 * 而包装类出现的原因就是为了解决基本类型不能参与面向对象开发的问题。
 * @author zhangchi
 *
 */
public class IntegerDemo1 {

	public static void main(String[] args) {
		dosome("abc");
		dosome(new Point(1,2));
		/**
		 * Java的8个基本类型：
		 * byte,short,int,long,float,double,char,boolean
		 * 是以值的形式直接存在的，所以他们并没有面对对象的特征，自然也不继承自Object，
		 * 所以不能使用多态，用Object的角度去接受基本类型
		 */
		int i = 1;
		Integer ii = new Integer(i);
		dosome(ii);
		Integer.toString(i);
		
	}

	public static void dosome(Object obj){
		
	}


	
}
