package day04_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ����ת��Ϊ����,����ʹ�ü����зḻ�ķ���
 * ��Ҫע�⣬ת��ֻ��ת��ΪList����
 * ʹ�õ�������Ĺ�����Arrays�ľ�̬����asList
 * ֻ��ת��ΪList���ϵ���Ҫԭ����:Set���ܴ���ظ�Ԫ�ء�
 * ������ת��ΪSet���Ͽ��ܳ��ֶ�ʧԪ�ص������
 * @author zhangchi
 *
 */
public class ArrayToListDemo {

	public static void main(String[] args) {
		String[] array={"one","two","three","four"};
		
		List<String> list=Arrays.asList(array);		
		System.out.println(list);
		
		/**
		 * �򼯺������һ��Ԫ��
		 * ʵ������Ĵ�����׳��쳣��ԭ�����ڣ��ü�����������ת�������ģ���ô�ü��Ͼͱ�ʾԭ��������
		 * ���ԶԼ��ϵĲ������Ƕ�����Ĳ�������ô���Ԫ�ػᵼ��ԭ�������ݣ���ô�Ͳ��ܱ�ʾԭ���������ˡ�
		 * ���Բ�������ü��������Ԫ�ء�
		 */
		//list.add("five");
		
		//�޸ļ���Ԫ�أ�����Ԫ��Ҳ��ı�
		list.set(1, "2");
		System.out.println(list);
		
		//�������Ԫ��
		for(String str:array){
			System.out.println(str);
		}
		
		
		/*
		 * ��ϣ����ɾԪ�أ���Ҫ����һ������
		 */
		
		/**
		 * ���еļ��϶��ṩ��һ������Collection���Ͳ����Ĺ��췽����
		 * �ù��췽����Ϊ:���ƹ�����
		 * �������ڴ�����ǰ���ϵ�ͬʱ�������а������������е�����Ԫ��
		 */
		List<String> list1=new ArrayList<String>(list);	//���ϵĹ��췽��
		list1.add("five");
		System.out.println(list1);
		
	}
}
