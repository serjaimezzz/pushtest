package day05_Map;

/**
 * ����:ͨ��<>����һ��������������,�������ڱ���ʱ�ھͼ�鼯���д�ŵ������Ƿ�ͷ���ָ�������������Ƿ�һ�¡�
 * �����һ��,�������RE,�Ӷ�������ʱ�ڵ�����ת�Ƶ��˱���ʱ��,����˳���İ�ȫ��
 * �ڶ�����ʱ�����˷���,�������ʹ�÷��͡�
 * ʹ��ʱ,�����ϵķ���ȷ����,�÷����Ĳ��������Ͳ�ȷ����
 * since jdk1.5
 * 
 * ��ʽ:��������<> ���ñ��� =new ��������<>();  
 * 			<>ָ������
 * @author zhangchi
 *
 */
public class GenericsDemo {
	public static void main(String[] args) {
	
	}
}

class Worker{
	
}

class GTest<T>{
	//�����ϵķ���ȷ����,�÷����Ĳ��������Ͳ�ȷ��
	public void show(T t){
		System.out.println(t);
	}
	
	//�����Լ��÷���,�����ϵķ���û�й�ϵ
	public <E> void fun(E t){	//���ϵĲ���ʲô���Ͷ�����
		System.out.println(t);
	}
	
	//��̬����ֻ���Լ��÷���,�������ڴ�������ʱȷ����,����̬��������Ҫ����
	public static <E> void ff(E t){
		System.out.println(t);
	}
	
}

class Tool{
	private Object obj;
	
	Tool(){}
	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
}