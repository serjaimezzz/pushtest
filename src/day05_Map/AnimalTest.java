package day05_Map;

import java.util.HashSet;

import day05_Map.*;
/*
 * HomeWork
 * 1.���һ��������Animal�࣬�б�ţ��������Ա��������ԣ���������������ӵ�һ��HashSet������ʱ��
 *	�����е�����ֵ����ͬ��Ϊ��ͬ�������������д�������Animal������ӵ�һ��HashSet�����У����������Ԫ�صĸ���
 */
public class AnimalTest {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(new Animal(1,"s",'M',1));	//��ŵ��Ƕ���ĵ�ַ
		hs.add(new Animal(1,"s",'M',1));
		hs.add(new Animal(1,"s",'M',1));
		System.out.println(hs + "\n size:" + hs.size() );
		
		
	}
}
