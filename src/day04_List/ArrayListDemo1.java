package day04_List;

import java.util.ArrayList;
/**
 * ArrayList ��׺List�Ǹ��ӿ�,ArrayList������Ŀ��ظ���
 * �ײ����ݽṹ������,�����ڴ���������,���Ա������ݵĲ���,���������ݵ���ɾ
 * @author zhangchi
 *
 */
public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(true);
		al.add("sql");
		al.add("bigdata");
		al.add("bigdata");				
		System.out.println(al);
		ArrayList al2 = new ArrayList();	//����ArrayList�洢���ظ���Ԫ��
		for(int i = 0;i < al.size() ; i++){
			Object obj = al.get(i);
			//�ж��¼����Ƿ�����ö���
			//final class String{}ʵ����Comparable,���Դ���compareTo����
			//String str = str.compareTo(anotherString);
			if(!al2.contains(obj))
				al2.add(obj);
		}
		System.out.println(al2);
		
		
	}
}
