package day02_Integer;

public class EnumDemo {
	public static void main(String[] args) {
		Season[] ss = {Season.SPRING,Season.SUMMER,Season.AUTUMN,Season.WINTER};
		int num = ss[0].ordinal();	
		System.out.println("num:"+num);	//0
		
		int n = ss[0].compareTo(ss[2]);	//比较大小,返回ss[0]-ss[2]的值，比较的是枚举项的编号
		System.out.println(n);
		
		System.out.println("name:"+ss[1].name());	//得到的是ss[1]的常量名称
		System.out.println(ss[0].toString());
		//重写了toString方法
		System.out.println();
		
		Season[] arr = Season.values();	//得到所有枚举项
		for(Season season:arr){
			System.out.println(season.name());
		}
		
		Season s = Season.valueOf("WINTER");//返回枚举项的下标值
		System.out.println(s.ordinal());
		
	}
}
/*
 * 1.enum是一个特殊的类
 * 2.enum是final修饰的类，不能被继承
 * 3.继承了java.lang.Enum类，不能再继承其他类，但是可以实现方法，可以再创建其他属性
 */
enum Season{	//final class Season extends java.lang.Enum<Season>
	SPRING,SUMMER,AUTUMN,WINTER;
	//public static final SPRING = new Season();
	private String desc;
	
	private Season(){}
	private Season(String desc){
		this.desc = desc;
	}
	
}