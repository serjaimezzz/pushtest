package day04_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



/*   01#����#20*02#����#18*03#����#22*04#����#20*05#����#21 
 * ����Student�࣬���ԣ�ѧ��  ���� ����

--1.����ЩStudent����Ž�������

--2.��ѯ������û�н����ߵ�ѧ������������ӡѧ���ľ�����Ϣ����װ�ɷ�������������������

--3.��������ѧ����ƽ�����䣬������䣬��С����

--4.����������ֽ������Ľ����ָ�Ϊ�ű�
*/
public class Work 
{
	public static void main(String[] args) 
	{
		String str = "01#����#20*02#����#18*03#����#22*04#����#20*05#����#21";
//		List stu = new ArrayList();
//		String[] arr = str.split("[#\\*]");	//�Ȱ�#*�и�,��ѧ���ĸ������ݷ������		
//		for (String string : arr) {
//			System.out.println(string);
//		}
		
//		for(int i = 0; i<arr.length/3;i++){
//			int id = 0, name = 1 , age = 2;
//			Sinter s = Student :: setInfo ;
//			s.setIn(new Student(), arr[id++],arr[name++], arr[age++]);	// ��ô����new�����Ķ���????
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
//		for (Object object : list) {	//����List����
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

