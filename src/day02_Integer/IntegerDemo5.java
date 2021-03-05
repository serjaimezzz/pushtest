package day02_Integer;
/**
 * JDK1.5之后推出了一个新的特性:  自动拆装箱
 * @author zhangchi
 *
 */
public class IntegerDemo5 {

	public static void main(String[] args) {
		/**
		 * 手动拆装箱
		 */
		Byte b1 = new Byte((byte)6);		//手动装箱	 基本类型数据-->对象
		Byte b2 = Byte.valueOf((byte)7);	//手动装箱
		
		byte b3 = b1.byteValue();	//手动拆箱		对象--->基本数据类型
		byte b4 = b2.byteValue();	//手动拆箱
		prt("b3:"+b3+"  b4:"+b4);
		
		
		/**
		 * 自动拆装箱是编译器认可，而不是虚拟机认可。
		 * 编译器在将源程序编译时自动补充代码来完成基本类型与包装类之间的转换
		 */
		Byte b5 = 7;		//自动装箱
		prt("b5:"+b5);
		
		byte b6 = new Byte((byte)8);	
		b6 = (byte) (b6 + 5);			//先拆箱 :  b6.byteValueOf()	,计算后再装箱:b6 = new Byte((byte)13).byteB=Value; 
		prt("b6:"+b6);
		
		
		
		
		int i1=new Integer(1);         //基本类型接收引用类型
		int i2=new Integer(1).intValue();//触发了自动拆装箱: Integer.ValueOf(1).intValueOf;
		//Integer i3=123;
		Integer i3=Integer.valueOf(123);
		
	}
	public static void prt(String str){
		System.out.println(str);
	}

}
