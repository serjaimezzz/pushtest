package day05_Map;

import java.util.*;

import day04_List.*;

public class Work1ov {
	public static void main(String[] args) {
		String str = "name:xiaoming,age:10��,gender:male,height:172cm,weight:70kg\n"
				+ "age:20��,height:177cm,name:xiaobai,weight:80kg,gender:male\n"
				+ "gender:female,height:176cm,weight:66kg,name:xiaolv,age:20��";
		
		List<PersonInfo> list = getPersons(str);
		System.out.println(list);
		
		//ɾ��δ����������
//		list.removeIf(t -> t.age<18);	//�൱���ڲ�������ⲿ������
//		list.removeIf(t -> t.getAge() < 18);	//���ֶ���
//		System.out.println(list);
		
		//����ƽ������
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
		
		list.sort((t1,t2)->{		//Comparator�ӿ�,��д�ӿ��е�sort()����
			PersonInfo p1 = (PersonInfo)t1;
			PersonInfo p2 = (PersonInfo)t2;
			int num = p1.getAge() - p2.getAge();	//num=0ʱ,�������
			return num == 0? p1.getHeight() - p2.getHeight() : num;	//�������	//p2.compare(p1)
		});
		System.out.println("sort:"+list);
		
		//��ѯ���������е�������[20, 25]��Χ�ڣ�������[60, 80]��Χ�ڵ����ݣ�������߽������У���ȡ��4������8����
		//����һ���¼���,�������������ü��������
		
	}
	
	public static List<PersonInfo> getPersons(String str){
		List<PersonInfo> list = new ArrayList();
		String[] arr = str.split("\n");		//�г�ÿ���˵ĸ�����Ϣ
		for(int i =0; i < arr.length; i++){
			list.add(new PersonInfo(arr[i]));
		}
		return list;
	}
}


