package day01_String;
/**
 * from jdk1.0 �̰߳�ȫ�Ŀɱ���ַ����С�
 * �ַ�������������һ��String,�������޸�,��StringBuffer����һ���ַ���������
 * @author zhangchi
 *
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		//��������������ӣ��޸ģ�ɾ����ֻҪ�Ǳ����������Ķ���ת��Ϊ�ַ�����
		
		/**
		 * �洢:append(Object o)
		 * 		ÿ����ӵ�����Ĭ��׷����������ĩβ,����ԭ����,ʼ���õĶ���ͬһ����������
		 */
//		StringBuffer sb2 = sb1.append(false);
//		StringBuffer sb3 = sb1.append(666);
//		System.out.println("sb1:"+sb1);
//		System.out.println(sb1 == sb2 & sb1 == sb3);
		
		sb1.append(false).append(666);
		System.out.println("append:"+sb1);
		
		/**
		 * insert
		 */
		//��ָ��λ�ò���Ԫ��
		sb1.insert(5, 999);
		System.out.println("insert:"+sb1);
		
		/**
		 * delete
		 */
		//ɾ�����Ԫ��
		sb1.delete(5, 8);	//��ͷ����β
		System.out.println("delete:"+sb1);
		//ɾ��ָ���±��ϵ�Ԫ��
		sb1.deleteCharAt(6);
		System.out.println("delete:"+sb1);
		
		/**
		 * replace
		 */
		//�滻
		sb1.replace(0, 5, "true");	//��ͷ����β
		System.out.println("sb1:"+sb1);
		
		//�滻	�±괦Ԫ���滻Ϊ�ַ�
		sb1.setCharAt(4, '7');
		System.out.println("sb1:"+sb1);
		
		//��ת
		sb1.reverse();
		System.out.println("sb1:"+sb1);
		
		System.out.println(sb1.toString());
		
		
	}
}
