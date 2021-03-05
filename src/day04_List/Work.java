package day04_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



/*   01#张三#20*02#李四#18*03#王五#22*04#赵六#20*05#田七#21 
 * 创建Student类，属性：学号  姓名 年龄

--1.将这些Student对象放进集合中

--2.查询里面有没有叫田七的学生如果存在则打印学生的具体信息（封装成方法，键盘输入姓名）

--3.计算所有学生的平均年龄，最大年龄，最小年龄

--4.如果存在名字叫张三的将名字改为张兵
*/
public class Work 
{
	public static void main(String[] args) 
	{
		String str = "01#张三#20*02#李四#18*03#王五#22*04#赵六#20*05#王五#21";
//		List stu = new ArrayList();
//		String[] arr = str.split("[#\\*]");	//先按#*切割,把学生的个人数据分离出来		
//		for (String string : arr) {
//			System.out.println(string);
//		}
		
//		for(int i = 0; i<arr.length/3;i++){
//			int id = 0, name = 1 , age = 2;
//			Sinter s = Student :: setInfo ;
//			s.setIn(new Student(), arr[id++],arr[name++], arr[age++]);	// 怎么调用new出来的对象????
//		}
		
		
		
			String[] arr1 = str.split("\\*");
			for (String string : arr1) {
			System.out.println(string);
			}
			
			List list = new ArrayList();
//			Student stu = null;
//			for (int j = 0; j < arr1.length; j++) {
//				Student stu = new Student();
//				String[] arr2 = arr1[j].split("#");
//				stu.setId(arr2[0]);
//				stu.setName(arr2[1]);
//				stu.setAge(arr2[2]);	
//				stu.getInfo();
//				list.add(stu);
				
//			}			
//			System.out.println(list);
			

			
//			System.out.println(seek(list));
			
		
	
		
	}
	public static String seek(List list){
		boolean flag = false;
//		for (Object object : list) {	//遍历List集合
//			System.out.println(object);
////			Sinter sin = Student :: getName;
////			String name = sin.getNameInfo();
////			System.out.println(name);
//			
////			list.contains(name);
//			
//		}
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		list.forEach(t -> System.out.println(t));
		
		return "NotFound";
		
	}
}





@FunctionalInterface
interface Sinter{
	String getNameInfo(Student stuent);
}

