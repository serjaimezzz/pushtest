package day05_Map;
/**
 * ���ͽӿ�
 * interface inter<E>{
 * 		void show(E e);//�ͽӿ��ϵķ��͵�����һ��
 * 		void fun(String t);
 * }
 * @author zhangchi
 *
 */
public class GenericsDemo1 {
	public static void main(String[] args) {
		InterTest t = new InterTest();
		t.show(88); //�Զ�װ��
		
		//��ʹ�����ʱ����ȷ������
		InterTest2<Integer> t2 = new InterTest2<>();
		t2.show(15);
		
	}
}

interface inter<E>{
	void show(E e);//�ͽӿ��ϵķ��͵�����һ��
	void fun(String t);
}

class InterTest implements inter<Integer>{

	@Override
	public void show(Integer e) {
		System.out.println(e);
	}

	@Override
	public void fun(String t) {
		System.out.println(t);
	}
	
}

class InterTest2<T> implements inter<T>{

	@Override
	public void show(T e) {
		System.out.println(e);
	}

	@Override
	public void fun(String t) {
		System.out.println(t);
	}
	
}

