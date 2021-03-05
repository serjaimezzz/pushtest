package day01_String;
import java.util.Arrays;

/**
 * �ַ����ǲ�������ַ�������һ�����������ɸı䣬
 * ����ı�ĳ���ַ�������һ���ᴴ���¶���
 * @author zhangchi
 *
 */
public class StringDemo {
	public static void main(String[] args) throws Exception{
		String s1="123abc";
		s1=s1+"!";         //�Ѿ��������µĶ���
		String s2="123abc";//���ñ���������ǵ�ַ
		String s3=new String("123abc");//new�½�����
		String s4="123"+"abc";//
		System.out.println("s1:"+s1);
		System.out.println("s1==s2:"+s1==s2);
		System.out.println("s1==s3:"+s1==s3);
		System.out.println(s1.equals(s3));//�ַ����ıȽ�
		System.out.println(s4==s2);
		
		/**
		 * ��������һ���Ż���ʩ��
		 * ��һ��������ʽ��������߶���������ʱ����ֱ�Ӽ�������
		 * Ȼ�󽫽�����뵽.class�ļ���
		 */
		String str1="123";  //˫��������ַ������ܱ��޸�
		str1 = "111";		//str1�ĵ�ַ���Ը���,�Ӷ�ָ��ͬ���ַ���
		String str2="abc";
		String s5=str1+str2;//�ȱ����ٱȽ�
		System.out.println("s5���ַ�������:"+s5.length());
		System.out.println("str1:"+str1);
		
		System.out.println(s5==s2);
		
		String str="sss";
		System.out.println(str.length());
		
		/**
		 *  int indexOf(String str)
		 *  �÷������������� �����ַ��� �ڵ�ǰ�ַ����е�λ�á�
		 *  �÷����м������ط���.
		 */
		String str3="thinking in java";
		int index=str3.indexOf("in");
		System.out.println("index:"+index);
		//����in��str3�ַ����е�λ�ã���û���򷵻�-1��
		 	
		/**
		 * ���ط��������ָ��λ�ô���ʼ���� 
		 * in��str3�ַ����еĵ�λ�ã�ָ��λ��֮ǰ���ֵ�in����
		 */  
		index=str3.indexOf("in", 3); //����ʼλ��3��ʼ��
		System.out.println("index3:"+index);	//
		
		index=str3.lastIndexOf("in");//����in���ַ����������ֵ�λ��
		System.out.println("index:"+index);
		
		
		/**
		 * String substring(int start,int end)
		 * ��ȡ�ַ�������ָ��λ��(start)��ʼ��ȡ��ָ����λ��(end)
		 * java API��һ���ص㣬ͨ�����������ֱ�ʾ��Χʱ�����Ǻ�ͷ����β��
		 */
		
		//           0123456789abcdef    --�±��,�Ƕ�����   
		String str4="thinking in java";
		String sub=str4.substring(5, 8);//��ͷ����β
		System.out.println("sub:"+sub);
		sub=str4.substring(9);          //��ȡ���ַ���ĩβ
		System.out.println("sub:"+sub);
		
		/**
		 * String trim()
		 * ȥ���ַ������ߵĿհ��ַ�
		 */
		String str5="  hello  ";
		System.out.println("str5:"+str5);
		str5=str5.trim();
		System.out.println("trim:"+str5);
		
		
		/**
		 * char charAt(int index)
		 * ��ȡ��ǰ�ַ���ָ���±��Ӧ���ַ�
		 */
		
        //           0123456
		String str6="thinking in java";
		//�鿴��5���ַ���ʲô��
		char c=str6.charAt(4);
		System.out.println("charAt:"+c);
		
		/**
		 * ���һ���ַ����Ƿ�Ϊ����
		 */ 
		
		
		String info="�Ϻ�����ˮ���Ժ���";
		char[] chs=info.toCharArray();//�ַ���ת��Ϊ����
		
		for (int i = 0; i < info.length() / 2; i++) {
			if (info.charAt(i) == info.charAt(info.length() - i - 1)) {
				System.out.println(chs[i] + "�ǻ���");

			}
		}
		
		/**
		 * boolean startsWith(String str)
		 * boolean endsWith(String str)
		 * �жϵ�ǰ�ַ����Ƿ�����ָ�����ַ�����ͷ���β
		 */
		
		String str7="thinking in java";
		boolean starts=str7.startsWith("thi");
		System.out.println(starts);
		boolean ends=str7.endsWith("a");
		System.out.println(ends);
		
		/**
		 * String toUpperCase()
		 * String toLowerCase()
		 * ����ǰ�ַ�����Ӣ��ת��Ϊȫ��д��ȫСд
		 */
		String str8 = "thinking in java";
		String str9 = str8.toUpperCase(); // ����ת��д
		System.out.println("str9:" + str9);
		
		String str10 = str9.toLowerCase();// תСд
		System.out.println(str10);
		
		/**
		 * String�ṩ���������صľ�̬����
		 * static String valueOf(XXX xxx)
		 * �÷����������ǽ�Java������������������ת��Ϊ�ַ�����
		 */
		
		int a=1;
		String strA=String.valueOf(a);
		System.out.println(a+1);	//2
		System.out.println(strA+1);	//11
	
		/**
		 *	boolean equals(Object o)
		 *		str.matches(regex); 
		 */
		
		/*
		 * boolean equalsIgnoreCase(String anotherString)
		 * ���Դ�Сд�ж������ַ����������Ƿ���ͬ
		 */
		String strB = "HElloWORLd";
		String strC = "helloWorld";
		System.out.println("���Դ�Сд:"+strB.equalsIgnoreCase(strC));
		
		
		/**
		 * boolean isEmpty()
		 * �ж��ַ����Ƿ�Ϊ��
		 * ��null���ûᷢ����ָ���쳣,��ַ��null
		 */
		
		/**
		 * �ַ�����ת�����ַ������
		 */
		char[] arr = {'a','b','c','d','e'};
		String str11 = new String(arr);
		System.out.println("str11:"+str11);
		String str12 = new String(arr,2,3);//���±�2��ʼ��3��
		System.out.println("str12:"+str12);
		
		/**
		 * ���ַ���תΪ�ַ�����
		 * char[] toCharArray()
		 */
		String str13 = "hello";
		char[] arr1 = str13.toCharArray();
		for (char d : arr1) {
			System.out.println(d);
		}

		//����
		byte[] b2 = "ABCDEF".getBytes(); //����:��ABCDEF���ASC II��
		byte[] b3 = "���".getBytes("UTF-8");
		System.out.println(Arrays.toString(b2));
		System.out.println(Arrays.toString(b3));
		
		//���ֽ�����ת���ַ���
		byte[] b4 = {65,66,67,68,69,70};
		//���ù��췽������
		String str14 = new String(b4);//ʹ��ƽ̨Ĭ�ϵ��ַ�������GBK
		System.out.println(str14);//ABCDEF
		
		String str15 = new String(b3);//����ʹ�õ�GBK�ַ����ͱ���ʱ��UTF-8��һ��ʱ�����������
		String str16 = new String(b3,"UTF-8");
		System.out.println(str15);
		System.out.println(str16);
		
		String str17 = "Hello World";
		String str18 = str17.replace('e', 'a');//���ַ�e���滻��'a',����һ���µ��ַ���
		System.out.println("str17:"+str17);
		System.out.println("str18:"+str18);
		
		/*
		 *	������˳��Ƚ������ַ���
		 */
		int num = "aab".compareTo("aaa");//ǰ�ߵĴ��ں�ߵķ��ش���0���� return b-a;//b-a>0
		if(num > 0)//��Ӧ���ַ�һһ�Ƚ�,�ȱȵ�һ���ַ�,��������,�������޹�
			System.out.println("aabƫ��");
		else
			System.out.println("aaaƫ��");
		
		/*
		 * ƴ�Ӻ��и�
		 * String concat(String str)/split(String str)
		 */
		String str19 = "Hello".concat("World");
		System.out.println(str19);
		String str20 = "a,b,c,d";
		String[] str21 = str20.split(",");
		for (String string : str21) {
			System.out.println(string.toUpperCase());
		}
		
		
		/*
		 * �ɱ�����ۼ�
		 */
		int sum = add(1,2,3,5,7);//�ɱ���� �����ǲ����б��е����һ��:7
		System.out.println("sum:"+sum);
		
		/* 
		 * String.join(delimiter, elements);
		 * ��һ����������һ���ַ��� (����ַ�����Ϊ���ӷ�)
		 */
		String str22 = String.join(".", "h","e","l","l","o");
		System.out.println("str22:"+str22);
		/*
		 * String format(String format,Object...args)
		 * ����ռλ��:????
		 * %s:����ַ���		%ns--�չ�nλ�ַ���,�������,���ַ�ǰ���ո�
		 * %d:��������ռλ��		%nd--�չ�nλ,����������ַ�ǰ���ո�
		 * %f:����������ռλ��,	%.nf-����С�������ָ��λ������
		 * %c:�ַ���ռλ��
		 */
		String str23 = String.format("%10s%5d%.2f%3c", "hello",66,66.345,'k');
		System.out.println("str23"+str23);
		
	}
	
		/*
		 * ��n�������ĺ�
		 */
		public static int add(int...a){	//�ɱ����---�����ǲ����б��е����һ��
			int sum = 0;
			for (int i = 0; i < a.length; i++) {
				sum += a[i];
			}
			return sum;
		}
}
