package day04_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * ���ϵ���������
 * @author zhangchi
 *
 */
public class CollectionDemo2 {

	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add("java");
		c1.add("c++");
		c1.add(".net");
		System.out.println("c1:"+c1);
		
		Collection c2=new HashSet();	
		c2.add("java");
		c2.add("ios");
		c2.add("android");
		c2.add("linux");
		c2.add("ios");
		System.out.println("c2:"+c2);
		
		/*
		 *ȡ����
		 *boolean addAll(Collection c)
		 *�����������е�����Ԫ����ӵ���ǰ������,
		 *��Ӻ�ֻҪ��ǰԪ�ؼ���Ԫ�����������˱仯,�򷵻�true 
		 */
		boolean b = c1.addAll(c2);
		boolean flag=c2.addAll(c1);
		System.out.println("c1:"+c1);
		System.out.println("c2:"+c2);
		System.out.println(flag);
		
		Collection c3=new ArrayList();
		c3.add("java");
		c3.add("android");
		System.out.println("c3:"+c3);
		/*
		 * boolean containsAll(Collection c)
		 * �жϵ�ǰ�����Ƿ�������������е�����Ԫ��
		 */
		boolean contains=c1.containsAll(c3);
		System.out.println("�Ƿ�ȫ����:"+contains);
		
		/*
		 * ��c1������ɾ��c3��c1���ϵĹ���Ԫ��
		 */
		c1.removeAll(c3);
		System.out.println("c1:"+c1);
		
		
	}
}
