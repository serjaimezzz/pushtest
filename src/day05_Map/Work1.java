package day05_Map;

import java.util.*;

import day05_Map.*;

public class Work1 {
	public static void main(String[] args) {
		String str = "name:xiaoming,age:10岁,gender:male,height:172cm,weight:70kg\nage:20岁,height:177cm,name:xiaobai,weight:80kg,gender:male\ngender:female,height:176cm,weight:66kg,name:xiaolv,age:20岁";
//		System.out.println(str);
		ArrayList list = new ArrayList();
		Manager m = new Manager(list);

		String[] arr = str.split("\n");	//切出每个人的信息  
//		System.out.println("count:"+arr.length);
//		for(String str1 : arr){
//			System.out.println(str1);
//		}
//		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			String[] arr1 = arr[i].split("\\,");	//个人信息
//			for(String str2 : arr1){
//				System.out.println(str2);
//			}
//			System.out.println();										
			list.add(m.acquire(arr1, new PersonInfo()));
			System.out.println("list:"+list);
		}
		
//		m.delete(list);
//		System.out.println(list);
		
//		list.removeIf((t) ->{
//			
//		});
		
		m.countAge(list);
		System.out.println("list:"+list);
		
		m.sorts();
		System.out.println(list);
		
		m.select();
		System.out.println("select:"+list);
	}
	
	
}

class Manager{
	ArrayList<PersonInfo> list;
	Manager(){}
	Manager(ArrayList<PersonInfo> list){
		this.list = list;
	}
	public PersonInfo acquire(String[] arr1,PersonInfo per){
//		System.out.println("arr1:"+arr1.length);
//		for(String str : arr1){
//			System.out.println(str);
//		}
//		System.out.println();
		PersonInfo p = new PersonInfo();
		for (int i = 0; i < arr1.length; i++) {
			String[] a = arr1[i].split("\\:");
//			for (String string : a) {
//				System.out.println(string);
//			}
//			System.out.println(a[0]+"="+a[1]);
			if(a[0].equals("name")){
				
				p.setName(a[1]);
			}
			if(a[0].equals("age")){
				String[] str = a[1].split("岁");
				p.setAge(Integer.parseInt(str[0]));
			}
//			if(a[0].equals("gender")){
//				p.setGender(a[1]);
//			}
			if(a[0].equals("height")){
				String[] str = a[1].split("cm");
				p.setHeight(Integer.parseInt(str[0]));
			}
			if(a[0].equals("weight")){
				String[] str = a[1].split("kg");
				p.setWeight(Integer.parseInt(str[0]));
			}
		}
		return p;
	}
	
	public void delete(ArrayList<PersonInfo> list){			//遍历删除未成年人员数据
		ListIterator<PersonInfo> ite = list.listIterator();
		while(ite.hasNext()){
			Object obj = ite.next();
			if(obj instanceof PersonInfo){
				PersonInfo p = (PersonInfo)obj;
				if(p.getAge() < 18)
					ite.remove();
			}
		}
		
//		list.removeIf(e -> e.getAge()<18);
	}
	
	public void countAge(ArrayList<PersonInfo> list){
		ListIterator<PersonInfo> ite = list.listIterator();
		int sum = 0;
		double count = 0;	//计数器,除数为double类型,avr也为double
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		while(ite.hasNext()){
			Object obj = ite.next();
			if(obj instanceof PersonInfo){
				PersonInfo p = (PersonInfo)obj;
//				max = p.getAge();
//				System.out.println("max:"+max);
//				min = p.getAge();
				if(p.getAge() > max){
					max = p.getAge();
				}
				if(p.getAge() < min){
					min = p.getAge();					
				}
				sum += p.getAge();
				count++;
			}			
		}
		double avr = sum / count;
		System.out.println("sum:"+sum+",max:"+max+",min:"+min+",avr:"+avr);		
	}
	
	public void sorts(){
		list.sort((t1,t2)->{	//t2.sort(t1),t1-t2>0 result:t1,t2...
			PersonInfo p1 = (PersonInfo)t1;
			PersonInfo p2 = (PersonInfo)t2;
			int num = p2.getAge() - p1.getAge();	//num ==0时年龄相等
			return num == 0? p1.getHeight() - p2.getHeight() : num;//按身高升序排列
		} );
	}
	
	public void select(){
		list.sort((t1,t2)->{
			PersonInfo p1 = (PersonInfo)t1;
			PersonInfo p2 = (PersonInfo)t2;
			if(p1.getAge()>=20 && p1.getAge()<=25 && p1.getWeight()>=60 && p1.getWeight()<=80){
				if(p2.getAge()>=20 && p2.getAge()<=25 && p2.getWeight()>=60 && p2.getWeight()<=80){
					return p2.getHeight() - p1.getHeight();	//身高降序
				}
				return 0;	//xiaoming?????
			}
			return 0;
		});
	}
	
}

class PersonInfo{
	String name;
	int age;
	Genders gender;
	int height;
	int weight;
	PersonInfo(){}
	
	public PersonInfo(String str){
		String[] arr = str.split(",");	//切出每一条具体的信息
		Map<String,String> map = new HashMap();
		for (int i = 0; i < arr.length; i++) {
			String[] array = arr[i].split(":");
			map.put(array[0], array[1]);		//把信息类型:信息内容复制通过map.put()赋值给key-value
		}
		this.name = map.get("name");
		this.age = Integer.parseInt(map.get("age").replace("岁", ""));	//从map中通过map.get(key)取出key所对应的value并做处理
		this.gender = Genders.getGender(map.get("gender"));
		this.height = Integer.parseInt(map.get("height").replace("cm", ""));
		this.weight = Integer.parseInt(map.get("weight").replace("kg", ""));
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
	public Genders getGender() {
		return gender;
	}
	public void setGenders(Genders gender) {
		this.gender = gender;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void getInfo(){
		System.out.println(name + "," + age +"," + gender +"," + height +"," + weight);
	}
	public String toString(){
		return name + "," + age +"," + gender +"," + height +"," + weight;
	}
	
}
enum Genders{
	MALE,FEMALE;
	public static Genders getGender(String sex){
		if("male".equals(sex))
			return Genders.MALE;
		else if("female".equals(sex))
			return Genders.FEMALE;
		else
			return null;
	}
}