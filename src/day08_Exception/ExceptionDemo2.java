package day08_Exception;
/**
 * finally��
 * finall�鶨�����쳣������Ƶ���󣬿���ֱ�Ӹ���try��֮��������һ��catch��֮��
 * finally���еĴ���һ��ִ�У�����try���еĴ����Ƿ��׳��쳣������ͨ������ͷ���Դ�Ȳ�������finally�У�����ر�����
 * @author zhangchi
 *
 */
public class ExceptionDemo2 {

	public static void main(String[] args) {
		System.out.println("����ʼ");
		try {
			String str = "";
			System.out.println(str.length());		
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("������");				
		} finally {		
			System.out.println("finally����ִ��" );//��ʹtry����return,finally������Ȼ��ִ��
		}
		System.out.println("�������");
		
	}
}
