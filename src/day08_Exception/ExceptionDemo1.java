package day08_Exception;
/**
 * java�쳣��������е�try-catch
 * try�����������Ͽ��ܳ���Ĵ���Ƭ��
 * catch������������try���д����׳��Ĵ��󣬲������
 * @author zhangchi
 *
 */
public class ExceptionDemo1 {
	/**
	 * ��Զ��Ҫ��main��������throws�����쳣!!!!!!!!!!
	 * throws="��˵ǰ��"��main��������JVM��������õġ�(�ᱻ�ɵ�)JVM���printStackTrace()
	 * main:�ҿɸ�����,�ҿ��ܻᱨ��!!!
	 * JVM:���Ż�˭��?�㱨������??
	 */
	public static void main(String[] args) {
		System.out.println("����ʼ");
		
		try{
			String str="a";
			/*
			 * JVM��ִ�д���Ĺ�������������һ���쳣�����ʵ��������������쳣ʵ����
			 * ������������ִ�й����������õ��쳣������ʾ�ô��󱨸棬������Ϻ󽫸��쳣�׳���
			 * ���׳��쳣���������б�try��Χ����JVM����catch���Ƿ��й�ע���쳣��
			 * ��ע�򽻸�catch�����,����Ὣ�쳣�׳�����ǰ�����⣬�ɵ��õ�ǰ�����Ĵ��������쳣��
			 */
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			System.out.println(Integer.parseInt(str));
			
		} catch (NullPointerException e) {	//�ܲ��񵽾��Ѿ����Ǵ�����,����Ҫ�������ⲻ����
			System.out.println("�����˿�ָ��");
			
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("�ַ����±�Խ����");
			
		} catch (Exception e) {// �����һ��catch�в���Exception��������δ�����쳣���³����ж�
			System.out.println("������δ֪����");
			/**
			 * �����catch����ͬ�쳣ʱ����Щ�쳣����ڼ̳й�ϵʱ����ô�����쳣Ҫ���в���
			 * ����Exception������Exception���쳣�ĸ��࣬Ӧ�÷������һ��catch��
			 */
		}
		
		
		System.out.println("�������");
	}
}
