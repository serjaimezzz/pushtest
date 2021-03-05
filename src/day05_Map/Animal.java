package day05_Map;
/**
 * HomeWork
 * @author zhangchi
 *
 */
@SuppressWarnings("rawtypes")
public class Animal implements Comparable{
	int num;		//编号
	String name;	//姓名
	char gender;	//性别
	int age;		//年龄
	Animal(){}
	Animal(int num,String name){
		this.num = num;
		this.name = name;
	}
	public Animal(int num, String name,char gender,int age) {
		super();
		this.num = num;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int hashCode(){
		return name.hashCode() *11;
	}
	
	public boolean equals(Object obj){
		if(! (obj instanceof Animal))
			throw new RuntimeException();
		Animal ani = (Animal)obj;
			return this.name.equals(ani.name) && this.num == ani.num 
					&& this.gender == ani.gender && this.age == ani.age; 
	}
	
	@Override
	public String toString(){
		return num+","+name+","+gender+","+age;
	}
	@Override
	public int compareTo(Object obj) {
		if(!(obj instanceof Animal))
			throw new ClassCastException("类型不匹配");
		Animal animal = (Animal)obj;
		if(this.num > animal.num)
			return 1;
		else if(this.num < animal.num)
			return -1;		//升序
		else
			return 0;			
	}
	
}
