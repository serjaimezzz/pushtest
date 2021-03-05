package day02_Integer;
/**
 * �������͵İ�װ��̳���java.lang.Number
 * ���ṩ���磺intValue,doubleValue�����ķ�����
 * �����ǿ��Խ���ǰ��װ���ʾ�������������������͵���ʽ���ء�
 * @author zhangchi
 *
 */
public class IntegerDemo2 {

	public static void main(String[] args) {
		/**
		 * ����������ת��Ϊ��װ�������ַ�ʽ:
		 * 1.���ù��췽��
		 * 2.���þ�̬����valueOf(�Ƽ�)
		 */
		
		/*
		Integer i1=new Integer(12);
		Integer i2=new Integer(12);
		*/
		Integer i1 = Integer.valueOf(128);// ֻ������һ���ֽ����ڵ�������-128��127
		Integer i2 = Integer.valueOf(128);
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));

		int i = i1.intValue();
		System.out.println(i);

		double d = i1.doubleValue();
		System.out.println(d);

		byte b = i1.byteValue();
		System.out.println(b);
		/* byte���ֵ+1=byte��Сֵ
		 * 0111 1111
		 * 1000 0000 ��һλ��Զ�Ƿ���λ
		 * 1111 1111+1 ���������ֵ+1������λ���
		 *10000 0000   
		 */
		
	}

}
