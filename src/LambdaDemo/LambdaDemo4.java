package LambdaDemo;
/**
 * ���췽������
 * @author zhangchi
 *
 */
public class LambdaDemo4 {
	public static void main(String[] args) {
		//�����ڲ���
		Tests1 t = new Tests1(){
			public Person value(){
				System.out.println("�����ڲ���test");
				return null;}
		};
		t.value();
		
		Tests1 p = () -> new Person("p",1);
		System.out.println("p:"+p.value());
		
		/*
		 * �ӿ��� inter = ����::new;
		 * ���� person = inter.test();	//�����츳ֵ
		 */
		
		Tests1 t1 = Person :: new;	//���ù��췽��
		Person p1 = t1.value();	//������һ��������test������������,�˴������޲ι���
		System.out.println("p1:" + p1);
		
		Tests2 t2 = Person::new;
		Person p2 = t2.value("t2", 2); // ���� = �вι���
		System.out.println("p2:" + p2);
		
	}
}

class Person{
	private String name;
	private int age;
	Person(){}
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	String getInfo(){
		System.out.println("name:"+name + ",age:"+age);
		return "name:"+name + ",age:"+age;
	}
	
	public String toString(){
		
		return name + "," +age;
	}
	
}

@FunctionalInterface
interface Tests1{
	Person value();
}

//����ֻ��һ�����뱻��д�ĳ��󷽷��Ľӿھ��Ǻ���ʽ�ӿ�
interface Tests2{
	Person value(String name,int age);
}