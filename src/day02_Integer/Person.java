package day02_Integer;
//����˽�л�������
public class Person {
	private int age;
	
	public void setAge(int age){  //�ж����������Ƿ�Ϸ�
		if(age<0||age>100){
			return;
		}
		this.age=age;
	}
	public int getAge(){  //����
		return age;
	}
	
}
