package day02_Integer;

public class EnumDemo {
	public static void main(String[] args) {
		Season[] ss = {Season.SPRING,Season.SUMMER,Season.AUTUMN,Season.WINTER};
		int num = ss[0].ordinal();	
		System.out.println("num:"+num);	//0
		
		int n = ss[0].compareTo(ss[2]);	//�Ƚϴ�С,����ss[0]-ss[2]��ֵ���Ƚϵ���ö����ı��
		System.out.println(n);
		
		System.out.println("name:"+ss[1].name());	//�õ�����ss[1]�ĳ�������
		System.out.println(ss[0].toString());
		//��д��toString����
		System.out.println();
		
		Season[] arr = Season.values();	//�õ�����ö����
		for(Season season:arr){
			System.out.println(season.name());
		}
		
		Season s = Season.valueOf("WINTER");//����ö������±�ֵ
		System.out.println(s.ordinal());
		
	}
}
/*
 * 1.enum��һ���������
 * 2.enum��final���ε��࣬���ܱ��̳�
 * 3.�̳���java.lang.Enum�࣬�����ټ̳������࣬���ǿ���ʵ�ַ����������ٴ�����������
 */
enum Season{	//final class Season extends java.lang.Enum<Season>
	SPRING,SUMMER,AUTUMN,WINTER;
	//public static final SPRING = new Season();
	private String desc;
	
	private Season(){}
	private Season(String desc){
		this.desc = desc;
	}
	
}