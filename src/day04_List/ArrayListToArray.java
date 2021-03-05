package day04_List;

import java.util.*;
/**
 * ����ת����:���Է�ֹ���ݵ�����Ķ�
 * <T> T[] toArray(T[] a)
 * @author zhangchi
 *
 */
public class ArrayListToArray {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("bg");
		list.add("sql");
		list.add("cccc");
		
		/*
		//�������鳤�� < ���ϵĴ�С,����ʹ�ø���������
		String[] arr1 = list.toArray(new String[1]);
		for (String string : arr1) {
			System.out.println(string);
		}
		System.out.println(arr1.length);//3
		
		//�������鳤�� >= ���ϵĴ�С,��ʹ�ø���������
		String[] arr2 = list.toArray(new String[5]);
		for (String string : arr2) {
			System.out.println(string);
		}
		System.out.println(arr2.length);//5
		*/
		
		//list���м�������,���鳤�Ⱦ���list.size()
		String[] arr = list.toArray(new String[list.size()]);
		
	}
}
