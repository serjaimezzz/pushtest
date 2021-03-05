package LambdaDemo;
/**
 * ��������:
 * �ӿ��еķ����Ĳ������������͵�(��Ҫ����һ������),�������ǵ��ý��ն����ĳ������
 * @author zhangchi
 *
 */
public class LambdaDemo5 {
	public static void main(String[] args) {
		Test1 test = person -> person.getName();
		System.out.println(test.getInfo(new Persons("test",1)));
		
		Test1 test1 = Persons :: getName;
		System.out.println("test1:"+test1);
		String name = test1.getInfo(new Persons("test1",1));	//��ȡnew Person()�е�ֵ
		System.out.println(name);
		
		Test2 test2 = Persons :: getInfo;	
		test2.showInfo(new Persons("test2",2));	//���õ���String getInfo()
		
		Test3 test3 = Persons :: setName;
		test3.setInfo(new Persons("t3",3), "test3");//����setName����,this.name=t3;
		
		
		
	}
}

@FunctionalInterface
interface Test1{
	String getInfo(Persons person);
}

interface Test2{
	void showInfo(Persons person);
}
interface Test3{
	void setInfo(Persons person,String name);
}

class Persons{
	private String name;
	private int age;
	
	Persons(){}
	Persons(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	
	public void setIn(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public String getInfo(){
		System.out.println( name+","+age);
		return name+","+age;
	}
	
	public String toString(){
		return name+","+age;
	}
	
}