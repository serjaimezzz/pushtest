package day08_Exception;
/**
 * ���䲻�Ϸ��쳣
 * 
 * �Զ����쳣��ͨ������������ĳ��ҵ���߼��ϳ��ֵ����⡣
 * �Զ����쳣������Ӧ����������֪�⡣
 * @author zhangchi
 *
 */
public class IllegalAgeException extends Exception{//Exception�ṩ�˺ܶ๹�췽��:Source-Generate Constructors from SuperClass�Զ�����
	/**���е��쳣���������л�
	 * ���л�:Serializable���еİ汾�ؼ�
	 * ���û����ʽ����serialVersionUID��JVM����������Serializable��ĸ��������Զ�Ϊ��ִ�д˲���
	 * 
	 * Ĭ�ϵ�serialVersionUID���������ϸ��Ϣ�ǳ����У�������ͬ��JVMʵ�ֶ��죬�����ڷ����л������лᵼ�������InvalidClassExceptions��
	 * 
	 * - �ͻ�����Windows��ʹ��SUN��JVM��
	 * - ��������Linux��ʹ��JRockit��
	 * 
	 *	�ͻ���ͨ���׽�������������ʹ���Ĭ�����ɵ�serialVersionUID������123L���Ŀ����л��࣬�����������ڷ����л����������ɲ�ͬ��serialVersionUID������124L����
	 *	�����������InvalidClassExceptions��
	 */
	private static final long serialVersionUID = 1L;	//�汾��	SUNǿ�ҽ��鿪����Ա����serialVersionUID�Ա��������г��Ĳ�ͬJVM����

	public IllegalAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
