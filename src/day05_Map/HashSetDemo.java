package day05_Map;

import java.util.*;

import day04_List.*;
/**
 * Hash:ʹ�õ��ǹ�ϣ��ʵ�����ݵĴ洢
 * Set:����,�洢�����ǲ����ظ���
 * 		����:�����д洢���ݵ�˳����û�������ݵ�˳��һ��
 * 
 * HashSet��α�֤���ݵĲ��ظ�:
 * ����Ҫ��ӵ����ݵ�hashCode()�������ֵ��������,ʹ���������Ľ�������һ��������±�ֵ,
 * 		�����λ��û������,����±�λ�þ������ݵĴ��λ��
 * 		�����λ��������,������ݾͻ������ڸ�λ�õ�nextNode
 * 			
 * @author zhangchi
 */
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<>();
		set.add(new Student("zhangsan",26));//ʹ��add�������ʱ,�Ѿ���֤�����ݵĲ��ظ�
		set.add(new Student("lisi",26));	//���������ʵ��
		set.add(new Student("wangwu",26));	//Ԫ�صĴ�ŵ�ַ��������
		set.add(new Student("zhaoliu",26));	
		set.add(new Student("wangwu",26));//����������hashCode��Ȼ��ͬ(hash��ͻ),������ͬλ�õĺ�һ��Node��
		System.out.println(set);
		
		Iterator<Student> it = set.iterator();
		while (it.hasNext()) {
			Student student = (Student) it.next();
			System.out.println(student);
		}
		
	}
}
