package day04_List;
/**
 * 泛型，也叫参数化类型，是将当前类的属性的类型，方法参数的类型以及方法返回值的类型的定义权
 * 交给使用者。使用者在创建当前类的同时将泛型的实际类型传入
 * 
 * @author zhangchi
 *
 * @param <T>
 */
public class Point<T> {	//数字不能在第一位上
	private T x;
	private T y;
	//右键source-Generator Constructor using Fields...自动生成构造方法
	public Point(T x, T y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//右键-source-generate Getters and Setters自动生成接收器
	
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	
	public String toString(){
		return "("+x+","+y+")";
	}
	
}
