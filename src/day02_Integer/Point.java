package day02_Integer;
/**
 * 使用该类来测试Object相关方法的重写
 * 该类的每一个实例表示直接坐标系上的一个点
 * @author zhangchi
 *
 */
public class Point {
	private int x;  //属性私有化，行为公开化
	private int y;
	public int getX() {  //右键-source-generate Getters and Setters自动生成
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public Point(){
		
	}
	
	public Point(int x,int y){
		this.x=x;
		this.y=y;
		
	}
/**
 * 通常我们要使用一个自己定义的类的toString方法时应当重写该方法。
 * Object 自身的toString方法返回的是：类名@地址。这个字符串无实际意义
 * 重写该方法后，返回的字符串没有严格的格式要求，将来可以根据需求而定。
 * 单杀原则上该字符串中应当包含当前对象的属性信息
 * 只有我们自定义的类需要重写该方法，JAVA API提供的类通常都已经重写了该方法。
 */
	public String toString(){
		return "(" + x + "," + y + ")";
	}
	
/**
 * 通常，当我们需要使用一个自己定义的类的equals方法时，就应当重写它。
 * equals方法的作用是比较当前对象与给定对象内容是否一样（长得像不像）
 * Object提供的equals方法内部就是用"=="实现的，所以没有意义
 * equals比较式不一定要求所以属性值都要相同，这要结合实际需求而定。
 * 只有自己定义的类需要重写，JAVA API提供的类基本上都已经重写了equals
 */
	public boolean equals(Object obj){  //重写equals
		
		if(obj==null){
			return false;
		}
		if(obj==this){
			return true;
		}
		if(obj instanceof Point){//判断对象和Point是否是相同类型
			Point p=(Point)obj;
			return this.x==p.x && this.y==p.y;
		}
		return false;
	}
	
	
}
