package day04_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ��������
 * Collection�ṩ��ͳһ�ı�������Ԫ�صķ�ʽ:������ģʽ
 * 
 * Iterator iterator()
 * ��ȡ���ڱ�����ǰ���ϵĵ�����
 * 
 * java.util.Iterator()��һ���ӿ�,�涨�����ڱ�������Ԫ�ص���ط���,
 * ��ͬ�ļ����ṩ����Ӧ��ʵ���ࡣ�����סʵ���������,�����ǵ���Iterator���ɡ�
 * 
 * ����������ѭ:��,ȡ,ɾ�Ĳ���,����ɾ�����Ǳ������
 * 
 * @author zhangchi
 *
 */
public class CollectionDemo3 {

	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		System.out.println(c);
		
		
		/*
		 * boolean hasNext()
		 * �÷������жϼ������Ƿ���Ԫ�ؿ���ȡ��
		 * E next()ȡ�Ĺ���
		 * ��ȡ�����е���һ��Ԫ��
		 */
		
		//��ȡ���ڱ�����ǰ���ϵĵ�����		��ѭ	 ��-ȡ-ɾ 	ԭ��
		Iterator it=c.iterator();	//ȷ���˱���������
		while(it.hasNext()){             //�ʡ�
			String str=(String)it.next();//ȡ�������е�Ԫ�ض���String
			
			if("#".equals(str)){
//				c.remove(str);      //ʹ�õ���������ʱ,�󲿷ּ��ϲ�������ɾԪ��,����������쳣ConcurrentModificationException				
				it.remove();//ɾ��	
				/* �������ṩ��remove����,����ɾ��ͨ��next����ȡ����Ԫ��	
				 * �ӵײ㼯�����Ƴ��˵��������ص����һ��Ԫ�أ���ѡ�������� 
				 * ÿ�ε���next()ʱ��ֻ�ܵ��ô˷���һ�Ρ� 
				 * ����ͨ�����ô˷���������κη�ʽ�޸Ļ������ϣ�
				 * �������������Ϊδָ����������д����ָ�������޸Ĳ��ԡ� 
				 * ����ڵ���forEachRemaining��������ô˷����� ��ָ������������Ϊ�� 
				 */
			}			
//			System.out.println(str);
		}		
		System.out.println(c);
		
		
	}
}
