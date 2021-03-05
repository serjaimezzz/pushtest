package day04_List;


public class Student implements Comparable<Student>
{
	 int id;
	 String name;
	 int age;

	public Student(){}
	Student(String name){
		this.name = name;
	}

	Student(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAge(int age) {
		this.age = age;
	}
	void setName(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	int getAge(){
		return age;
	}
	
	public void setInfo(int id,String name,int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public String getInfo(){
		System.out.println( id+","+name+","+age);
		return id+","+name+","+age;
	}

	public String toString(){
		return id+","+name+","+age;
	}

	public int hashCode(){
		return name.hashCode() + age * 36;
	}
	
	public boolean equals(Object obj){	//重写equals方法  ArrayListDemo2
		if(!(obj instanceof Student))
			throw new RuntimeException();
		Student stu = (Student)obj;	
		return this.name.equals(stu.name) && this.age == stu.age;//认为名字相等且年龄相等的是同一个对象
	}
	
	public int compareTo(Student stu){	//参数和类的参数保持一致
		
		int num = this.age - stu.age;
		return num == 0? this.name.compareTo(stu.name) : num;
	}
	
}

