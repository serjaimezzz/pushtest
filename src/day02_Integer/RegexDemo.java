package day02_Integer;
/**
 * �ַ���֧��������ʽ�ķ���һ:
 * boolean matches(String regex)
 * ���ݸ�����������ʽ��֤��ǰ�ַ����Ƿ������ʽҪ��
 * �����򷵻�true�����򷵻�false
 * @author zhangchi
 *
 */
public class RegexDemo {
	public static void main(String[] args) {
		/*
		 * ���������������ʽ��
		 * [a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\.[a-zA-Z0-9]+)+
		 */
		String regex="[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z0-9]+)+";
		System.out.println(regex);
		
		/**
		 *  �ַ���֧��������ʽ����һ��
		 *  boolean matches(String regex)
		 *  �ַ����Ƿ�ƥ��
		 */
		String mail = "zz@qq.com";
		boolean flag = mail.matches(regex); // �ַ����Ƿ�ƥ��
		if (flag) {
			System.out.print("������"); // ���λ���
		} else {
			System.out.println("��������");
		}
		
/**
 * �ַ���֧��������ʽ��������
 * String[] split(String regex)
 * ����ǰ�ַ�����������������ʽ�Ĳ��ֽ��в��
 * ���ز�ֺ��ÿ������
 * 
 */
		String str="asd132132sss111";
		//����Ӣ�Ĳ���
		String regex1 = "[0-9]+";// ��д�ӺŲ�ͬ����֮������ո�
		String[] array = str.split(regex1);
		System.out.println("len:" + array.length);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
/**
 * �ַ���֧��������ʽ��������
 * String[] replaceAll(String regex,String str)
 * ����ǰ�ַ���������������ʽ�Ĳ����滻Ϊ�������ַ���
 */
		String str1="abc123def456";
		str1=str1.replaceAll("[0-9]+", "#number#");
		System.out.println(str1);
		
		
		String str2 = "aabbc";
		System.out.println(str2);
		
	}
}
