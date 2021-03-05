package day04_List;

import java.util.ArrayList;
import java.util.Collection;

/**
 * JDK5.0֮���Ƴ���һ���µ�����:
 * ��ǿ��forѭ��,�ֽ��� ��ѭ����for each
 * 
 * ��ѭ�����������ͳѭ��
 * ֻ�������������ϻ��������
 * 
 * ��ѭ�������µ��﷨����ѭ���Ǳ������Ͽɣ�������������Ͽɡ�
 * ʹ����ѭ����������ʱ���������Ὣ����Ϊ��������ʽ������
 * ������ʹ����ѭ����������ʱ������ͨ�����ϵķ�����ɾԪ��

 */
public class NewForDemo {

	public static void main(String[] args) {
		String[] array={"one","two","three","four"};
		
		for (int i = 0; i < array.length; i++) {
			String str = array[i];
			System.out.println(i + ":" + str);
		}
		
		//	��������ȡ����Ԫ��:Ҫ����������
		for (String str : array) {
			System.out.println(str);	
		}
		
		
		Collection c=new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		System.out.println(c);
	
		for(Object o:c){
			/* �൱��
			 * Iterator it =c.iterator();
			 * while(it.hasNext()){
			 *       Object o=it.next();      
			 */
			String str=(String)o;
			System.out.println(str);
			
		/*	if("#".equals(str)){
				c.remove(str);			
			}
		*/	
		}
	}
}
