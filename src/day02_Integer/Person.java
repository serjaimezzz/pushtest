package day02_Integer;
//属性私有化的作用
public class Person {
	private int age;
	
	public void setAge(int age){  //判断属性输人是否合法
		if(age<0||age>100){
			return;
		}
		this.age=age;
	}
	public int getAge(){  //传参
		return age;
	}
	
}
