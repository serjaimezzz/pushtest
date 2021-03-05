package day08_Exception;
/**
 * ��������throw��throws
 * @author zhangchi
 *
 */
public class Person {
	private int age;

	public int getAge() {
		return age;
	}

	/**
	 * ��һ��������ʹ��throw�׳�һ���쳣ʱ����Ҫ�ڷ�����ʹ��throws���������쳣���׳��Լ�֪ͨ�����߽����
	 * ֻ��RuntimeException���������쳣ʹ��throw�׳�ʱ��ǿ��Ҫ�����ʹ��throws������
	 * �����쳣����ǿ��Ҫ��ģ�������벻ͨ����
	 * @param age
	 * @throws Exception
	 */
	public void setAge (int age) throws IllegalAgeException{//�����쳣
		if(age < 0 || age > 100){
			throw new IllegalAgeException("���䲻�Ϸ�");//�׳��쳣�Ƿ�����ʱ�쳣ʱ��Ҫ�����쳣
//			throw new RuntimeException("");//������Ҳ��ͨ������--��ʶS�Դ���
		}
		this.age = age;
	}
	
}
