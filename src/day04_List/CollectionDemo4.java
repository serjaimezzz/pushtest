package day04_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 *  ���ϵı���
 *  Iterator<E> iterator();	 ���شμ����е�Ԫ�صĵ�����(�������ϵ�)
 *  
 *  ������ʹ���ڲ���ʵ�ֱ����ģ�����Iterator�ӿ��ǶԲ�ͬ���ͼ������ڲ�����ȡ���Եõ���һ���ӿ�
 *  �����ڲ��඼ʵ����Iterator�ӿ�,iterator�������ص����ڲ������,��Ϊ�ڲ���ʵ����Iterator�ӿ�,���Ը÷����ķ���ֵ������Iterator���͵�
 * @author zhangchi
 *
 */
public class CollectionDemo4 {

	public static void main(String[] args) {
		//����֧�ַ��ͣ�������������Լ��������Ԫ�ص����͡�
		Collection<String> c=new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		prt(" ");
		
		//��ѭ����������Ԫ��
		for(String str:c){
			System.out.println(str);
		}
		prt(" ");
		
		/*
		 * ������ҲӦ��ָ�����ͣ������͵�ʵ������
		 * Ӧ�����������ļ��ϵķ�������һ��
		 */
		Iterator<String> it=c.iterator();
		while(it.hasNext()){
			//��ȡԪ��ʱ������������
			String str =it.next();
			System.out.println(str);
//			Object obj = it.next();
//			prt( ((String)obj).toUpperCase() );			
		}

		prt("---");
		
		/**
		 * default void forEach(Consumer<? super T> action);	void accept(T t)
		 * �÷�����Ѽ����е�ÿ���������δ�������t
		 *   
		 */
		c.forEach(t -> System.out.println(t));
		prt(" ");		
		
		c.forEach(System.out::println);
		prt(" ");
			
	}
	
	public static void prt(Object str){
		System.out.println(str);
	}
}
