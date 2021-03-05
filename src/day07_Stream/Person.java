package day07_Stream;

import java.io.Serializable;
import java.util.List;

/**
 * 该类用于测试作为对象流Object I/O Stream读写对象使用
 * 当一个类需要被对象流读写，那么该类必须实现java.io.Serializable接口
 * @author zhangchi
 *
 */
/*
 * 一个对象要想持久化,必须要其所属的类实现Serializable接口,标记接口
 * 实际上编译器编译.class文件时,会隐含的增加一些方法,用于将类中的属性转为字节(使用者无需关注,编译器实现)
 */
public class Person implements Serializable{//签名接口，通知编译器把下面的属性转换成字节的方法添上。为了规范/约束子类的行为。
	/**
	 * 当一个类实现了Serializable接口后，应当添加一个常量serialVersionUID，
	 * 该常量为当前类的序列化版本号，若不定义系统会根据当前类的结构生成，但是只要类的结构发生改变，版本号也会相应发生改变。
	 * 
	 * 版本号影响着反序列化的结果。即:
	 * 当OIS对一个对象进行反序列化时，会检查该对象与类的版本是否一致：
	 * 若一致:反序列化成功，但是若该对象与类的结构不一致时，则采用兼容模式，能还原的属性都还原。
	 * 若不一致:反序列化直接抛出版本不一致异常
	 */
	/*
	 * 如果不定义,系统会自动生成一个默认的序列号  
	 * stream classdesc serialVersionUID = 1	根据该序列号查找所要用到的字节码文件
	 * local class serialVersionUID = 6301891087688367538 ---如果未自定义UID,文件更改之后会生成的新序列号
	 */
	private static final long serialVersionUID = 1L;//序列化版本号，如果不是自己定义的话会根据结构的改变而改变
	public String name;
	private int age;
	private String gender;
	/*
	 * transient关键字用来修饰属性，默认值为null,常用于一些临时性的数据
	 * 当被修饰后，该类实例在使用OOS进行对象序列化时，该属性值被忽略，从而达到对象"瘦身"的目的
	 */
	private transient List<String> otherInfo;	//被修饰为瞬态transient的不参与序列化
	
	public Person(){
		
	}
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public Person(String name, int age, String gender, List<String> otherInfo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.otherInfo = otherInfo;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(List<String> otherInfo) {
		this.otherInfo = otherInfo;
	}

	@Override
	public String toString(){
		return name+","+age+","+gender+","+otherInfo;
	}
	
}
