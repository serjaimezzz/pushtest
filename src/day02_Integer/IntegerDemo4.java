package day02_Integer;
/**
 * ��װ���ṩ��һ����̬����		static parseXXX(String str)
 * ���Խ��������ַ���ת��Ϊ��Ӧ�Ļ�������
 * ǰ���Ǹ��ַ���������ȷ�������������Ϳ��Ա����ֵ 
 * @author zhangchi
 *
 */
public class IntegerDemo4 {

	public static void main(String[] args) {
		String str="123";
		int i=Integer.parseInt(str);
		System.out.println(i+1);
		
		String str1="123.123";
		double d=Double.parseDouble(str1);
		System.out.println(d+0.01);  //double�����������
		
		
		
		
	}

}
