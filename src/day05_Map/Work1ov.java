package day05_Map;

import java.util.*;

import day04_List.*;

public class Work1ov {
	public static void main(String[] args) {
		String str = "name:xiaoming,age:10岁,gender:male,height:172cm,weight:70kg\n"
				+ "age:20岁,height:177cm,name:xiaobai,weight:80kg,gender:male\n"
				+ "gender:female,height:176cm,weight:66kg,name:xiaolv,age:20岁";
		
		List<PersonInfo> list = getPersons(str);
		System.out.println(list);
		
		//删除未成年人数据
//		list.removeIf(t -> t.age<18);	//相当于内部类访问外部类属性
//		list.removeIf(t -> t.getAge() < 18);	//两种都行
//		System.out.println(list);
		
		//计算平均年龄
		int sum = list.get(0).getAge();
		int min = list.get(0).getAge();
		int max = list.get(0).getAge();
		for(int i = 1 ; i < list.size() ; i++ ){
			int age = list.get(i).getAge();
			if(max < age)
				max = age;
			if(min > age)
				min = age;
			sum += age;
		}
		System.out.println("sum:"+(double)(sum/list.size())+",max:"+max+",min:"+min);
		
		list.sort((t1,t2)->{		//Comparator接口,重写接口中的sort()方法
			PersonInfo p1 = (PersonInfo)t1;
			PersonInfo p2 = (PersonInfo)t2;
			int num = p1.getAge() - p2.getAge();	//num=0时,年龄相等
			return num == 0? p1.getHeight() - p2.getHeight() : num;	//身高升序	//p2.compare(p1)
		});
		System.out.println("sort:"+list);
		
		//查询集合中所有的年龄在[20, 25]范围内，体重在[60, 80]范围内的数据，按照身高降序排列，截取第4名到第8名。
		//创建一个新集合,符合条件就往该集合中添加
		
	}
	
	public static List<PersonInfo> getPersons(String str){
		List<PersonInfo> list = new ArrayList();
		String[] arr = str.split("\n");		//切出每个人的个人信息
		for(int i =0; i < arr.length; i++){
			list.add(new PersonInfo(arr[i]));
		}
		return list;
	}
}


